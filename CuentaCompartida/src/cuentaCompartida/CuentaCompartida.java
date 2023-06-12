package cuentaCompartida;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CuentaCompartida {

	private ArrayList<ArrayList<Consumo>> consumos;
	private double cubierto;

	public CuentaCompartida(int cantidadDeComensales, double cubierto) {
		this.cubierto = cubierto;
		this.consumos = new ArrayList<ArrayList<Consumo>>();

		for (int i = 0; i < cantidadDeComensales; i++) {
			consumos.add(new ArrayList<Consumo>());
		}
	}

	public void agregarConsumo(int comensal, String descripcion, double precio) {
		if (comensal < 1 || comensal > consumos.size()) {
			throw new Error("Incorrecto");
		}
		consumos.get(comensal - 1).add(new Consumo(descripcion, precio));
	}

	public String consumosDelComensal(int comensal) {
		String salida = "";
		salida += "Comensal Nro: " + comensal + "\n";

		for (Consumo cadaConsumo : consumos.get(comensal - 1)) {
			salida += cadaConsumo + "\n";

		}

		return salida;
	}

	public String consumosPorComensal() {
		String salida = "";
		for (ArrayList<Consumo> cadaListaDeConsumos : consumos) {
			double importeDelComensal = 0;
			for (Consumo cadaConsumo : cadaListaDeConsumos) {
				importeDelComensal += cadaConsumo.getPrecio();
			}
			if (importeDelComensal > 0) {
				salida += "Comensal Nro: " + (consumos.indexOf(cadaListaDeConsumos) + 1) + "\t";
				salida += importeDelComensal + "\n";
			}

		}
		return salida;
	}
	
	
	public void exportarCuentaCompartida() throws FileNotFoundException {
		PrintWriter pr = new PrintWriter(new File("Cuenta.out"));
		String salida = "Cuenta Compartida \n";
		double totalCuenta = 0;
		for (int i = 0; i < consumos.size(); i++) {
			double importeDelComensal = 0;
			for (Consumo cadaConsumo : consumos.get(i)) {
				salida += cadaConsumo.toString() + "\n";
				importeDelComensal += cadaConsumo.getPrecio();
				
			}
			totalCuenta += importeDelComensal;
			if (importeDelComensal > 0) {
				salida += "Comensal Nro: " + (i + 1) + "\t";
				salida += importeDelComensal + "\n";
			}

		}
		
		pr.print(salida + "\n" + "Total: \t" + totalCuenta);
		pr.close();
		
	}
	

	public static void main(String[] args) throws FileNotFoundException {

		CuentaCompartida cumplePablito = new CuentaCompartida(15, 1000);
		cumplePablito.agregarConsumo(1, "Medialunas", 300);
		cumplePablito.agregarConsumo(1, "Cafe con leche", 400);
		cumplePablito.agregarConsumo(2, "Tostado", 800);
		cumplePablito.agregarConsumo(2, "Cafe con leche", 400);
		
		cumplePablito.agregarConsumo(5, "Panqueque", 1800);
		cumplePablito.agregarConsumo(5, "Capuchino", 600);

		System.out.println(cumplePablito.consumosDelComensal(1));
		System.out.println(cumplePablito.consumosDelComensal(2));

		System.out.println(cumplePablito.consumosPorComensal());
		
		cumplePablito.exportarCuentaCompartida();

	}

}
