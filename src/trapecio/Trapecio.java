/*
 * Class                :Trapecio.java
 * Description          :Calcular el metodo del trapecio con programacion paralela y secuencial
 * Author               :Rodrigo Ojeda Arce
 * Course               :Lenguaje a la programacion 3
 * Editor               :Eclipse
 */
package trapecio;
	/*
	 * Input 01         :Funcion Evaluar. Tipo: String. Ejemplo: "2x^2+1"
	 * input 02         :Limite Inferior. Tipo: int. Ejemplo: 5
	 * Input 03         :Limite superior. Tipo: in. Ejemplo: 10
	 */
import net.objecthunter.exp4j.*;
import java.util.Scanner;

public class Trapecio {
	
	public static void main(String args[]) {

		System.out.println(" - - - - - - - - - - - -");
		System.out.println(" - Método del trapecio -");
		System.out.println(" - - - - - - - - - - - -");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una ecuacion: ");
		String ecuacionStr = sc.nextLine();
		Expression ecuacion = new ExpressionBuilder(ecuacionStr).variables("x").build();
		
		System.out.println("Ingrese el límite inferior:");
        double a = sc.nextDouble();
		
        System.out.println("Ingrese el límite superior:");
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
        
        
        System.out.println("El área aproximada bajo la curva es: " + areaActual);
        System.out.println("Se necesitaron " + n + " trapecios para alcanzar el error tolerado.");
	   }
	}
 