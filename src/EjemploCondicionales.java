
public class EjemploCondicionales {
	public static void main(String[] args) {
		System.out.println("Hola Mundo");

		int edad = 15;
		int cantidad = 2;

		if (edad >= 18) {
			System.out.println("puedes entrar");
		} else {
			if (cantidad >= 2) {

				System.out.println("Usted es menor de " + "edad pero puede entrar");
			} else {
				System.out.println("no puede entrar");
			}

		}
	}

}
