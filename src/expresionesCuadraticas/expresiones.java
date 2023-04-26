package expresionesCuadraticas;

import java.util.*;
//import net.objecthunter.exp4j.*;

public class expresiones {

	public static void main (String[] args) {
		String ingreso;
		double limite_superior, limite_inferior;
		double resultado;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese una funcion");
		
		ingreso = input.nextLine();
		
		Expresion e = new ExpresionConstructor("x^2+2");
				.variable("x");
				.build();
				
		System.out.println("Digite el limite superior");
		limite_superior = input.nextDouble();
		
		System.out.println("Digite el limite inferor");
		limite_inferior = input.nextDouble();
		
		
	}
}
