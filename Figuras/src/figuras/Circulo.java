package figuras;

public class Circulo extends Elipse {
	/**
	 * 
	 * @param radio
	 */
	public Circulo(double radio) {
		super(radio, radio);
	}

	@Override
	public String toString() {
		return "Circulo [Area=" + getArea() + "]";
	}

}
