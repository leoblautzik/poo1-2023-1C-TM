package cuentaCompartida;

public class Consumo {
	
	private String descripcion;
	private double precio;
	public Consumo(String descripcion, double precio) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
	}
	protected String getDescripcion() {
		return descripcion;
	}
	protected double getPrecio() {
		return precio;
	}
	@Override
	public String toString() {
		return "[descripcion=" + descripcion + ", precio=" + precio + "]";
	}
	
	
}
