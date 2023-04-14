package profesionales;

public class CirujanoCardiovascular extends Cirujano {

	public CirujanoCardiovascular(String nombre) {
		super(nombre);
	}
	
	@Override
	public double getHonorarios() {
		return super.getHonorarios() * 1.25;
	}

}
