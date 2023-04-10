package empresa;

public class PlantaTemporaria extends Empleado {
	
	private static final double VALOR_HORA = 200;
	
	public PlantaTemporaria(int hsTrabajadas, int cantHijos, boolean casado) {
		super(hsTrabajadas, cantHijos, casado);
		
	}
	
	@Override
	public double getSalario() {
		return super.getHsTrabajadas() * VALOR_HORA + 
				super.getSalarioFamiliar();
	}

	

}
