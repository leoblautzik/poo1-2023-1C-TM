package geometria;

public class Segmento implements Desplazable, Comparable<Segmento>, EsParalelo {

	private Punto a;
	private Punto b;

	public Segmento(Punto p1, Punto p2) {
		this.a = p1;
		this.b = p2;
	}

	public double longitud() {
		return a.distancia(b);
	}

	public boolean esParaleloAX() {
		return a.getY() == b.getY();
	}

	public boolean esParaleloAY() {
		return a.getX() == b.getX();
	}

	public boolean esParalelo(Segmento s2) {

		return this.pendiente() == s2.pendiente();
	}

	public boolean esPerpendicular(Segmento s2) {

		return this.pendiente() == (1 / s2.pendiente());
	}

	private double pendiente() {
		return (b.getY() - a.getY()) / (b.getX() - a.getX());
	}

	@Override
	public int compareTo(Segmento otroSegmento) {
		
		return Double.compare(this.longitud(), otroSegmento.longitud());
	}

	@Override
	public void mover(double enx, double eny) {
		this.a.mover(enx, eny);
		this.b.mover(enx, eny);
		
	}

}
