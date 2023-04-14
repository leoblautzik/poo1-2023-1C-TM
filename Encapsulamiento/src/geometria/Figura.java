package geometria;

public abstract class Figura implements Comparable<Figura>, Desplazable {
	
	public Punto punto;
	
	public Figura(double x, double y) {
		this.punto = new Punto(x, y);
	}
	
	public void mover(double enx, double eny) {
		this.punto.mover(enx, eny);
	}
	
	public abstract double getArea();
	
	@Override
	public int compareTo(Figura f) {
		return (-1) * Double.compare(this.getArea(), f.getArea());
	}

}
