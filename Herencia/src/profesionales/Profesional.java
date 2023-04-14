package profesionales;

public abstract class Profesional implements Comparable<Profesional> {

	private String nombre;
	private static double basico = 100000;

	public Profesional(String nombre) {
		this.nombre = nombre;
	}

	protected static double getBasico() {
		return basico;
	}

	protected static void setBasico(double basico) {
		Profesional.basico = basico;
	}

	protected String getNombre() {
		return nombre;
	}

	public abstract double getHonorarios();

	@Override
	public String toString() {
		return "Profesional [nombre=" + nombre + ", Honorarios: " + getHonorarios() + "]";
	}

	@Override
	public int compareTo(Profesional otro) {
		return Double.compare(this.getHonorarios(), otro.getHonorarios());
	}

}
