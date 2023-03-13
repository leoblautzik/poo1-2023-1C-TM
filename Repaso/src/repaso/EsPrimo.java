package repaso;

import java.util.Scanner;

public class EsPrimo {

	static boolean esPrimo(int n) {

		/*
		 * for(int i = 2; i < n; i++) { 
		 * 	if(n % i == 0) 
		 * 		return false; 
		 * }
		 */
		int i = 2;
		while (i < n && n % i != 0)
			i++;

		return n == i;
	}

	public static void main(String[] args) {
		int numero;
		Scanner miScanner = new Scanner(System.in);// leer un entero por teclado e informar si es par o impar
		System.out.print("Ingrese un valor entero: ");
		numero = miScanner.nextInt();
		miScanner.close();

		if (esPrimo(numero)) {
			System.out.println(numero + " Es Primo");
		} else {
			System.out.println(numero + " No Es Primo");
		}
	}

}
