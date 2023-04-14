package profesionales;

public class Endodoncista extends Dentista {

	public Endodoncista(String nombre) {
		super(nombre);
		
	}
	
	@Override
	public double getHonorarios() {
		return super.getHonorarios() * 1.25;
	}

}
