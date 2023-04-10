package empresa;

public class PlantaPermanente extends Empleado {

	private int antiguedad;
	private static final double VALOR_HORA = 300;
	private static final double VALOR_ANIO = 100;
	
	
	public PlantaPermanente(int hsTrabajadas, int cantHijos, boolean casado, int antiguedad) {
		super(hsTrabajadas, cantHijos, casado);
		this.antiguedad = antiguedad;
	}
	


	protected int getAntiguedad() {
		return antiguedad;
	}



	@Override
	public double getSalario() {
		return this.antiguedad * PlantaPermanente.VALOR_ANIO + 
				super.getHsTrabajadas() * PlantaPermanente.VALOR_HORA + 
				super.getSalarioFamiliar();
	}

}
