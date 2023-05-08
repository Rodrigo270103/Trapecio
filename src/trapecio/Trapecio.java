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
		System.out.println(" - M�todo del trapecio -");
		System.out.println(" - - - - - - - - - - - -");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una ecuacion: ");
		String ecuacionStr = sc.nextLine();
		Expression ecuacion = new ExpressionBuilder(ecuacionStr).variables("x").build();
		
		System.out.println("Ingrese el l�mite inferior:");
        double a = sc.nextDouble();
		
        System.out.println("Ingrese el l�mite superior:");
        double b = sc.nextDouble();
        
        final double ERROR_TOLERADO = 0.0001;
        double areaAnterior = 0.0;
        double areaActual = 0.0;
        int n = 1;
	   }
	}
 