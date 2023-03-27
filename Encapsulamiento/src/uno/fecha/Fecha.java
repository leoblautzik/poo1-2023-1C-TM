package uno.fecha;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	// Sobrecarga del constructor
		public Fecha(int dia, int mes) {
			this(dia, mes,  2023);
		}
	

	// Sobrecarga del constructor
	public Fecha() {
		this(1, 1);
	}

	@Override
	public String toString() {
		return "[" + dia + "/" + mes + "/" + anio + "]";
	}

	public static void main(String[] args) {
		Fecha f1 = new Fecha(23, 6, 1912);
		Fecha f2 = new Fecha(7, 6, 1954);
		Fecha f3 = new Fecha();
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
	}

}
