package empresa;

public class Gerente extends PlantaPermanente {
	
	private static final double VALOR_HORA = 400;
	private static final double VALOR_ANIO = 150;
	
	public Gerente(int hsTrabajadas, int cantHijos, boolean casado, int antiguedad) {
		super(hsTrabajadas, cantHijos, casado, antiguedad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalario() {
		return super.getAntiguedad() * Gerente.VALOR_ANIO + 
					super.getHsTrabajadas() * Gerente.VALOR_HORA + 
					super.getSalarioFamiliar();
		}
	
}
