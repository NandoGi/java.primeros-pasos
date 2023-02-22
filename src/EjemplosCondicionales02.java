import java.util.*;

public class EjemplosCondicionales02 {
	
	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Introduce tu edad");
			
			
			int edad = entrada.nextInt();
			int cantidadPersonas = 2;
			
//		boolean esPareja = cantidadPersonas > 1;
			boolean puedeEntar = edad >= 18 && cantidadPersonas >= 2;
//		System.out.println(esPareja);

			if (puedeEntar) {
				System.out.println("puedes entrar");
			} else {

				System.out.println("No puedes entrar");
			}
		}
	}

}
