package numismatico;

import java.util.Arrays;

public class ColeccionDeMonedas  {

	private Moneda[] monedas;
	private int cantMonedas = 0;

	public ColeccionDeMonedas(int maxCantMonedas) {
		this.monedas = new Moneda[maxCantMonedas];
	}

	public void agregarMoneda(String origen, int anio, int valor) {
		Moneda nuevaMoneda = new Moneda(origen, anio, valor);
		monedas[cantMonedas] = nuevaMoneda;
		cantMonedas++;
	}

	public int cuantasDelPais(String pais) {
		int contador = 0;
		for (int i = 0; i < cantMonedas; i++) {
			if (monedas[i].getOrigen().equals(pais)) {
				contador++;
			}
		}
		return contador;
	}
	
	public int anioDeLaMasAntigua() { 
		int anioMasAntigua = monedas[0].getAnio();
		for (int i = 0; i < cantMonedas; i++) {
			if (monedas[i].getAnio() < anioMasAntigua) {
				anioMasAntigua = monedas[i].getAnio();
			}
		}
		return anioMasAntigua;		
	}
	
	public Moneda[] monedasDelPais(String pais) {
		int tam = this.cuantasDelPais(pais);
		Moneda[] aux = new Moneda[tam];
		int pos = 0;
		for (int i = 0; i < cantMonedas; i++) {
			if (monedas[i].getOrigen().equals(pais)) {
				aux[pos] = monedas[i];
				pos ++;
			}
		}
		Arrays.sort(aux);
		return aux;
	  }
}
