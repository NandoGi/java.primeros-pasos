import java.util.Scanner;

public class PracticaFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.out.println("Hallemos el factorial de un numero");
		
		Scanner teclea = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		
		int numero = teclea.nextInt();
		
		for (int factor = 1; factor < numero; factor++) {
			
			System.out.print("El factorial de " + factor + "! = ");
			
			int resultado = 1;
			
			for(int multi = 1; multi <= factor; multi++) {
				
				System.out.print(multi);
				resultado *= multi;
				
				if (multi == factor) {
					
					System.out.print(" = ");
				}
				if (multi < factor){
					System.out.print(" x ");
				}
				else {
					System.out.print(resultado);
				}
			}
			System.out.println();
		}
	}

}
