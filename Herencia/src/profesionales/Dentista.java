package profesionales;

public class Dentista extends Profesional {

	public Dentista(String nombre) {
		super(nombre);
	}

	@Override
	public double getHonorarios() {
		return super.getBasico();
	}
}
