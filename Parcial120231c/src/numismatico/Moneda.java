package numismatico;

public class Moneda implements Comparable<Moneda> {
	
	private String origen;
	private int anio;
	private int valor;
	

	public Moneda(String origen, int anio, int valor) {
		super();
		this.origen = origen;
		this.anio = anio;
		this.valor = valor;
	}

	protected String getOrigen() {
		return origen;
	}

	protected int getAnio() {
		return anio;
	}

	protected int getValor() {
		return valor;
	}

	@Override
	public int compareTo(Moneda o) {
		return Integer.compare(this.anio, o.anio);
	}

}
