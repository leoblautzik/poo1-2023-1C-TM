package geometria;

import java.util.Arrays;

public class DemoGeometria {

	public static void main(String[] args) {
		
		Circulo circulito = new Circulo(1,1,3);
		Cuadrado cuadradito = new Cuadrado(2,2,2);
		
		Figura[] figuras = {circulito, cuadradito};
		
		double areaTotal = 0;
		
		for (Figura figura : figuras) {
			areaTotal += figura.getArea();
		}
		
		//System.out.println(areaTotal);
		
		for (Figura figura : figuras) {
			System.out.println(figura.toString() + " Area: " + figura.getArea() );
		}
		System.out.println("------------------------------------");
		Arrays.sort(figuras);
		
		for (Figura figura : figuras) {
			System.out.println(figura.toString() + " Area: " + figura.getArea() );
		}

	}

}
