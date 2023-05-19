package conjuntos;

import java.util.Objects;

public class Punto implements Comparable<Punto>  {

	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punto() {
		this(0, 0);
	}

	public double distanciaAlOrigen() {
		// return Math.hypot(x, y);
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public static double distancia(Punto p1, Punto p2) {
		return Math.hypot((p2.y - p1.y), (p2.x - p1.x));
	}

	public double distancia(Punto p2) {
		return Math.hypot((p2.y - this.y), (p2.x - this.x));
	}

	public boolean estaSobreElEjeX() {
		
		return y == 0; 
		

	}

	public boolean estaSobreElEjeY() {
		
		return x == 0;

	}

	public boolean esElOrigenDeCoordenadas() {
		
		return estaSobreElEjeX() && estaSobreElEjeY();

	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public static void main(String[] args) {

		Punto p1 = new Punto(3, 4);
		Punto p2 = new Punto(6, 8);

		double distanciaAlOrigenDeP1 = p1.distanciaAlOrigen();
		System.out.println(distanciaAlOrigenDeP1);

		double distanciaEntreP1yP2 = distancia(p1, p2);
		System.out.println("Static " + distanciaEntreP1yP2);
		distanciaEntreP1yP2 = p1.distancia(p2);
		System.out.println("No static " + distanciaEntreP1yP2);

	}

	
	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}

	public void mover(double enx, double eny) {
		this.x += enx;
		this.y += eny;
		
	}

	@Override
	public int compareTo(Punto o) {
		if(Double.compare(this.distanciaAlOrigen(), o.distanciaAlOrigen()) == 0)
			if(Double.compare(this.x, o.x) == 0)
				return Double.compare(this.y, o.y);
			else
				return Double.compare(this.x, o.x);
		return Double.compare(this.distanciaAlOrigen(), o.distanciaAlOrigen());
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}


}
