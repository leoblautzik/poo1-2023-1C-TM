package profesionales;

public class Medico extends Profesional{

	public Medico(String nombre) {
		super(nombre);
		
	}

	@Override
	public double getHonorarios() {
		return super.getBasico();
	
	}

}
