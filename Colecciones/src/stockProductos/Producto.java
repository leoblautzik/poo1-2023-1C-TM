package stockProductos;

public class Producto {
	
	private int codigo;
	private String descripcion;
	private double importe;
	private int stock;
	
	public Producto(int codigo, String descripcion, double importe, int stock) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.importe = importe;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "codigo=" + codigo + ", descripcion=" + descripcion + ", importe=" + importe + ", stock="
				+ stock ;
	}

	protected int getCodigo() {
		return codigo;
	}

	public double getImporte() {
		
		return importe;
	}

	public void setImporte(double nuevoImporte) {
		this.importe = nuevoImporte;
		
	}

	protected int getStock() {
		return stock;
	}
	
	
	
	

}
