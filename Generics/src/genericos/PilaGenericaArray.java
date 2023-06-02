package genericos;

import java.util.Arrays;

public class PilaGenericaArray<T> {

	private Object[] pila;
	private int tope = 0;

	public PilaGenericaArray() {
		this.pila = new Object[100];
	}

	public void push(T dato) {
		try {
			if (tope == pila.length) {
				throw new PilaLLenaException();
			}
			this.pila[tope] = dato;
			tope++;
		} catch (PilaLLenaException pll) {
		}
	}

	@SuppressWarnings("unchecked")
	public T pop() {
		try {
			if (this.isEmpty()) {
				throw new PilaVaciaException("Pila vacia");
			}
			tope--;
			return (T) pila[tope];

		} catch (PilaVaciaException pv) {

		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public T peek() {
		return (T) this.pila[tope - 1];
	}

	public boolean isEmpty() {
		return tope == 0;
	}

	@Override
	public String toString() {
		return Arrays.toString(pila);
	}

}
