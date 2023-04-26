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


public class Trapecio {
	
	String funcion;
	int base_menor;
	int base_mayor;
	int altura;
	
	
	
	public static void main(String args[]) {

		long start = System.nanoTime();
	
		System.out.println(" - - - - - - - - - - - -");
		System.out.println(" - Método del trapecio -");
		System.out.println(" - - - - - - - - - - - -");
		//System.out.println("Función a evaluar : " + args[0]);
		//System.out.println("Límite inferior : " + args[1]);
		//System.out.println("Límite superior : " + args[2]);
	
		long end = System.nanoTime();
	
		//Mostrando el tiempo total de la ejecución del programa
		System.out.println("\n" + "TIEMPO TOTAL DE EJECUCIÓN : " + (end-start) + " ns.");
		
		Scanner input = new Scanner(System.in);

	      System.out.print("Ingrese la longitud de la base mayor: ");
	      double baseMayor = input.nextDouble();

	      System.out.print("Ingrese la longitud de la base menor: ");
	      double baseMenor = input.nextDouble();

	      System.out.print("Ingrese la altura del trapecio: ");
	      double altura = input.nextDouble();

	      double area = (baseMayor + baseMenor) * altura / 2;

	      System.out.println("El área del trapecio es: " + area);
	   }
	}
  }
}
