package repaso;

import java.util.Scanner;

public class EsPar {
	
	static boolean esPar(int n) {
		return n % 2 == 0;
		
	}

	public static void main(String[] args) {
		int numero;
		Scanner miScanner = new Scanner(System.in);//leer un entero por teclado e informar si es par o impar
		System.out.print("Ingrese un valor entero: ");
		numero = miScanner.nextInt();
		miScanner.close();
		if (esPar(numero)) {
			System.out.println(numero + " Es Par");
		}
			else {
				System.out.println(numero + " Es Impar");
			}
		}
		

	

}
