package TrapecioParalelo;

import java.util.Scanner;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class TrapecioParalelo extends Thread  {
	
	
public void run(){
	System.out.println(" - - - - - - - - - - - -");
	System.out.println(" - Metodo del trapecio -");
	System.out.println(" - - - - - - - - - - - -");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese una ecuacion: ");
	String ecuacionStr = sc.nextLine();
	Expression ecuacion = new ExpressionBuilder(ecuacionStr).variables("x").build();
	
	System.out.println("Ingrese el limite inferior:");
    double a = sc.nextDouble();
	
    System.out.println("Ingrese el limite superior:");
    double b = sc.nextDouble();
    
    final double ERROR_TOLERADO = 0.0001;
    double areaAnterior = 0.0;
    double areaActual = 0.0;
    int n = 1;
    
    while (true) {
        double h = (b - a) / n;
        areaActual = (ecuacion.setVariable("x", a).evaluate() + ecuacion.setVariable("x", b).evaluate()) / 2;
        for (int i = 1; i < n; i++) {
            double xi = a + i * h;
            areaActual += ecuacion.setVariable("x", xi).evaluate();
        }
        areaActual *= h;
        
        if (n > 1 && Math.abs(areaActual - areaAnterior) < ERROR_TOLERADO) {
            break;
        }
        
        areaAnterior = areaActual;
        n++;
    }
    
    
    System.out.println("El area aproximada bajo la curva es: " + areaActual);
    System.out.println("Se necesitaron " + n + " trapecios para alcanzar el error tolerado.");
   }
}
