package empresa;

public abstract class Empleado {
	
	private int hsTrabajadas;
	private int cantHijos;
	private boolean casado;
	
	
	public Empleado(int hsTrabajadas, int cantHijos, boolean casado) {
		this.hsTrabajadas = hsTrabajadas;
		this.cantHijos = cantHijos;
		this.casado = casado;
	}

	public double getSalarioFamiliar() {
		double esposao = 0;
		if (this.casado) {
			esposao = 100;
		}
		return this.cantHijos * 200 + esposao; 
	}
	
	public abstract double getSalario(); 
	
	

	protected int getHsTrabajadas() {
		return hsTrabajadas;
	}

	public static void main(String[] args) {
		//Empleado e = new Empleado(20, 2, false);
	}
	
}
