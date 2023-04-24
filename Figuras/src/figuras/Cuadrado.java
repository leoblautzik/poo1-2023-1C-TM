package figuras;

public class Cuadrado extends Rectangulo {
	/**
	 * 
	 * @param lado
	 */
	
	public Cuadrado(double lado) {
		super(lado,lado);
		
	}

	@Override
	public String toString() {
		return "Cuadrado [Area=" + getArea() + "]";
	}

}
