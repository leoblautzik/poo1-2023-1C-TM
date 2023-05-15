package pilasycolas;

import java.util.ArrayDeque;
import java.util.Queue;

public class Supermercado {
	
	private Queue<Integer> colaA = new ArrayDeque<Integer>();
	private Queue<Integer> colaB = new ArrayDeque<Integer>();
	
	public void acomodarColas() {
		Queue<Integer> colaAux = new ArrayDeque<Integer>();
		while (!colaA.isEmpty()) {
			if (colaA.peek() < 5) {
				colaB.offer(colaA.poll());
			} else {
				colaAux.offer(colaA.poll());
			}
		}
		this.colaA = colaAux;
		
	}
	
	public void ponerEnLaFila(Integer cantProductos) {
		colaA.offer(cantProductos);
	}
	
	public String toString() {
		return colaA.toString() + "\n" + colaB.toString();
	}

	public static void main(String[] args) {
		Supermercado elChino = new Supermercado();
		
		elChino.ponerEnLaFila(5);
		elChino.ponerEnLaFila(3);
		elChino.ponerEnLaFila(8);
		elChino.ponerEnLaFila(20);
		elChino.ponerEnLaFila(2);
		elChino.ponerEnLaFila(4);
		elChino.ponerEnLaFila(7);
		elChino.ponerEnLaFila(8);
		elChino.ponerEnLaFila(3);
		
		elChino.acomodarColas();
		
		System.out.println(elChino);
		
		
		
	}
	
}
