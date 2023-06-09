package ejercicios;

import java.util.NoSuchElementException;
import java.util.Stack;

public class ColaConDosPilas<T> implements QueueInterface<T>{
	
	private Stack<T> pilaA; 
	private Stack<T> pilaB;

	public ColaConDosPilas(){
		this.pilaA = new Stack<T>();
		this.pilaB = new Stack<T>();
	}
	
	@Override
	public boolean isEmpty() {
		return this.pilaA.isEmpty() && this.pilaB.isEmpty();
	}

	@Override
	public void enqueue(T newItem) {
		this.pilaA.push(newItem);
	}

	@Override
	public T dequeue() throws NoSuchElementException {
		acomodarPilas();
		return pilaB.pop();
	}

	@Override
	public T peek() throws NoSuchElementException {
		acomodarPilas();
		return pilaB.peek();
	}
	
	private void acomodarPilas() {
		if(this.isEmpty()) {
			throw new NoSuchElementException();
		}
		if(this.pilaB.isEmpty()) {
			while(!pilaA.isEmpty()) {
				pilaB.push(pilaA.pop());
			}
		}
	}
}
