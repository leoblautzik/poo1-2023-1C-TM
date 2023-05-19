package tablero;

public class Tablero {

	private boolean[] pulsadores;

	private Tablero(int n) {
		this.pulsadores = new boolean[n];
	}

	public void activarPulsador(int pulsador) {
		if (pulsador < 1 || pulsador > this.pulsadores.length)
			throw new Error("Fuera de rango");
		this.pulsadores[pulsador - 1] = true;
	}

	public void deactivarPulsador(int pulsador) {
		if (pulsador < 1 || pulsador > this.pulsadores.length)
			throw new Error("Fuera de rango");
		this.pulsadores[pulsador - 1] = false;
	}

	public boolean activado(int pulsador) {
		return pulsadores[pulsador - 1];
	}

	public int numActivos() {
		int contador = 0;

		for (boolean b : pulsadores) {
			if (b) {
				contador++;
			}
		}
		return contador;
	}

}