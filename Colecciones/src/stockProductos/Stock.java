package stockProductos;

import java.util.LinkedList;
import java.util.List;

public class Stock {
	
	private List<Producto> listaDeProductos;

	public Stock() {
		this.listaDeProductos = new LinkedList<Producto>();
	}
	
	public void agregarProducto(Producto p) {
		this.listaDeProductos.add(p);
	}
	
	public void listarStock() {
		for (Producto producto : listaDeProductos) {
			System.out.println(producto);
		}
		
	}
	
	public Producto elementoEnLaPosicionK(int k) {
		if (k >= this.listaDeProductos.size()) {
			throw new Error("Fuera de rango");
		}
		return this.listaDeProductos.get(k);
	}
	
	public void incrementarPrecio(int codigo, double porcentaje) {
		for (Producto producto : listaDeProductos) {
			if(producto.getCodigo() == codigo) {
				producto.setImporte(producto.getImporte()+ 
						producto.getImporte()*porcentaje/100);
			}
		}
	}
	
	//Devolver el stock de un producto dado o -1 si no esta.
	
	public int stockDelProducto(int codigo) {
		
		for (Producto producto : listaDeProductos) {
			if (producto.getCodigo() == codigo)
				return producto.getStock();
		}
		
		return -1;
	}
	
	public List<Producto> productosStockMenorA (int cant) {
		LinkedList<Producto> aux = new LinkedList<Producto>();
		
		for (Producto producto : listaDeProductos) {
			if(producto.getStock() < cant) {
				aux.add(producto);
			}
		}
		return aux;
	}
	
	public List<Producto> productosStockMayorA (int cant) {
		LinkedList<Producto> aux = new LinkedList<Producto>();
		
		for (Producto producto : listaDeProductos) {
			if(producto.getStock() >= cant) {
				aux.add(producto);
			}
		}
		return aux;
	}
	
	
	public static void main(String[] args) {
		
		Producto lapicera = new Producto(111, "lapicera", 100, 20);
		Producto marcador = new Producto(222, "marcador seco", 230, 10);
		Producto borrador = new Producto(333, "borrador", 50, 50);
		
		Stock libreria = new Stock();
		libreria.agregarProducto(lapicera);
		libreria.agregarProducto(marcador);
		libreria.agregarProducto(borrador);
		
		libreria.listarStock();
		
		//System.out.println(libreria.elementoEnLaPosicionK(2));
		
		libreria.incrementarPrecio(333, 10);
		libreria.listarStock();
		
		System.out.println(libreria.productosStockMenorA(50));
		
	}
	
}
