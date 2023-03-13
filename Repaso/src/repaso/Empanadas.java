package repaso;

import java.util.Scanner;

public class Empanadas {

	static int importeApagar(int cantEmpanadas) {
		return cantEmpanadas / 12 * 3000 + cantEmpanadas % 12 * 300;
	}
	
	public static void main(String[] args) {
		int cantidadDeEmpanadas;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuantas empanadas quiere: ");
		cantidadDeEmpanadas=sc.nextInt();
		sc.close();
		
		//int importe = importeApagar(30);
		System.out.println(importeApagar(cantidadDeEmpanadas));

	}
	
	
	

}
