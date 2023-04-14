package profesionales;

public class Cirujano extends Medico{

	public Cirujano(String nombre) {
		super(nombre);
		
	}
	@Override
	public double getHonorarios() {
		return super.getHonorarios() * 1.25;
	}

}
