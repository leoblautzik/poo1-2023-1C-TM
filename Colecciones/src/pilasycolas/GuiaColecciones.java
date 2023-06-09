package pilasycolas;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class GuiaColecciones {
	/**
	 * Escribir un método que, dadas dos colas de enteros, 
	 * construya una cola con el resultado de poner una a 
	 * continuación de la otra. por ejemplo si 
	 * q1 = [1,2,3] (con 1 al frente y 3 al final) y 
	 * q2 = [5,7], el resultado es [1,2,3,5,7] (con 1 al frente y 7 al final).
	 * @param q1
	 * @param q2
	 * @return
	 */

	public ArrayDeque<Integer> dosColasEnUna(Queue<Integer> q1, Queue<Integer> q2){
		ArrayDeque<Integer> qc = new ArrayDeque<Integer>();
	
		while(!q1.isEmpty()) {
			qc.offer(q1.poll());
		}
		while(!q2.isEmpty()) {
			qc.offer(q2.poll());
		}
		
		return qc;
	}
	
	public boolean expresionBalanceada(String e) {
		if (e == "")
			return false;
		
		Stack<Character> pila = new Stack<Character>();
		HashMap<Character,Character> mapa = new HashMap<Character, Character>();
		mapa.put('}', '{');
		mapa.put(')', '(');
		mapa.put(']', '[');
				
		for(int i=0; i<e.length(); i++) {
			if(esDeApilar(e.charAt(i))){
				pila.push(e.charAt(i));
			}else {
				if(mapa.get(e.charAt(i)) != pila.pop()) {
					return false;
				}
			}
		}
		return pila.isEmpty();
	}
	
	private boolean esDeApilar(char c) {
		Set<Character> deApertura = new HashSet<Character>();
		deApertura.add('{');
		deApertura.add('[');
		deApertura.add('(');
		return deApertura.contains(c) ;
	}

	

}
