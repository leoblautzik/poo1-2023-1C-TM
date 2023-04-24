package figuras;

import java.util.Arrays;

public class DemoFiguras {

	public static void main(String[] args) {
		Circulo circulito = new Circulo(2);
		Elipse eli = new Elipse(8, 4);
		Triangulo triangulito = new Triangulo(4, 2);
		Rectangulo rectangulito = new Rectangulo(4, 2);
		Cuadrado cuadradito = new Cuadrado(6); 
		
		Figura [] figuritas = {circulito, eli, triangulito, rectangulito, cuadradito};
		
		double areaTotal = 0;
		
		for (Figura cadaFigura : figuritas) {
			areaTotal += cadaFigura.getArea();
			System.out.println(cadaFigura);
		}
		
		System.out.println("Area total= " + areaTotal);
		
		Arrays.sort(figuritas);
		System.out.println("\nFiguras ordenadas");
		for (Figura cadaFigura : figuritas) {
			areaTotal += cadaFigura.getArea();
			System.out.println(cadaFigura);
		}

	}

}
