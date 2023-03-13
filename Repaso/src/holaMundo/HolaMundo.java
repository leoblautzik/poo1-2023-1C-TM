package holaMundo;

public class HolaMundo {

	public static void main(String[] args) {
		int a, b, suma;
		a = 7;
		b = 5;

		suma = a + b;
		int resta = a - b;
		int division = a / b;
		int producto = a * b;
		int modulo = a % b;

		System.out.println("La suma es " + suma);
		System.out.println("La resta es " + resta);
		System.out.println("La division es " + division);
		System.out.println("La multiplicación es " + producto);
		System.out.println("El resto de dividir a/b es " + modulo);
	}

}
