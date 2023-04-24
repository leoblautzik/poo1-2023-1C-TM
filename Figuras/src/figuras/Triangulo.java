package figuras;

public class Triangulo extends Figura {
	/**
	 * 
	 * @param base
	 * @param altura
	 */
	public Triangulo(double base, double altura) {
		super(base * altura / 2);
	}

	@Override
	public String toString() {
		return "Triangulo [Area=" + getArea() + "]";
	}

}
