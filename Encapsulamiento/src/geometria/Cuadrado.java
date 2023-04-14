package geometria;

public class Cuadrado extends Figura {
	
	private double lado;

	public Cuadrado(double x, double y, double lado) {
		super(x, y);
		this.lado = lado;
		
	}

	@Override
	public double getArea() {
		return Math.pow(lado, 2);
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}
	
	

}
