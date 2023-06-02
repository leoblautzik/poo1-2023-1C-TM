package genericos;

import java.util.LinkedList;

public class PilaGenericaLL<T> {
	
	private LinkedList<T> pila;
	
	public PilaGenericaLL(){
		this.pila = new LinkedList<T>();
	}
	
	public void push(T dato) {
		pila.addFirst(dato);
	}
	
	public T pop() {
		return pila.poll();
	}
	
	public T peek() {
		return pila.getFirst();
	}
	
	public boolean isEmpty() {
		return pila.isEmpty();
	}
	
	@Override
	public String toString() {
		return pila.toString();
	}
}
