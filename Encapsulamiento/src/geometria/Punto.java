package geometria;

public class Punto implements Desplazable {

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
	public void mover(double enx, double eny) {
		this.x += enx;
		this.y += eny;
		
	}

}
