import java.util.Scanner;

public class PracticaForIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclea = new Scanner(System.in);
		
		System.out.println("Introduce un numero del 1 al 100: ");
		
		int numero = teclea.nextInt();
		
		for (int i = 1; i <= numero; i++ ) {
			
			if (i % 3 == 0) {
				System.out.println(i + " Es multiplo de 3");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
 