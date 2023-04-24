package figuras;

public class Rectangulo extends Figura {
	/**
	 * 
	 * @param base
	 * @param altura
	 */
	public Rectangulo(double base, double altura) {
		super(base * altura);
	}

	@Override
	public String toString() {
		return "Rectangulo [Area=" + getArea() + "]";
	}
	
	

}
