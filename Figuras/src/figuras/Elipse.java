package figuras;

public class Elipse extends Figura{
	/**
	 * 
	 * @param radioMayor
	 * @param radioMenor
	 */
	public Elipse(double radioMayor, double radioMenor) {
		super(Math.PI * radioMayor * radioMenor);
	}

	@Override
	public String toString() {
		return "Elipse [Area=" + getArea() + "]";
	}

}
