package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class ListaGenerica<T extends Comparable<? super T>> {
	/*
	 * ejercicio 2
	 */
	public List<T> nezclarListas(List<T> l1, List<T> l2) {
		List<T> aux = new ArrayList<T>();

		for (T t : l1) {
			aux.add(t);
		}
		for (T t : l2) {
			aux.add(t);
		}

		Collections.sort(aux);

		return aux;

	}

	/*
	 * ejercicio 3
	 */
	public List<T> quitarDuplicados(List<T> l) {
		Set<T> conjunto = new TreeSet<T>();
		List<T> aux = new LinkedList<T>();
		for (T t : l) {
			conjunto.add(t);
		}
		for (T t : conjunto) {
			aux.add(t);
		}
		return aux;
	}

	/*
	 * ejercicio 4
	 */
	public List<T> invertirLista(List<T> l) {
		Stack<T> pila = new Stack<T>();
		List<T> aux = new LinkedList<T>();
		for (T t : l) {
			pila.push(t);
		}
		while (!pila.isEmpty()) {
			aux.add(pila.pop());
		}
		return aux;
	}

	/*
	 * ejercicio 6 retorna true si l1 es sublista de l2
	 */
	public boolean esSublista(List<T> l1, List<T> l2) {
		for (int i = 0; i <= l2.size() - l1.size(); i++) {
			if (l2.subList(i, i + l1.size()).equals(l1)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ListaGenerica<Integer> lg = new ListaGenerica<Integer>();

		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(3);
		l1.add(5);
		l1.add(5);
		l1.add(5);
		l1.add(7);
		l1.add(9);
		l1.add(7);
		l1.add(9);
		l1.add(7);
		l1.add(9);

		System.out.println("Innvertida");
		System.out.println(lg.invertirLista(l1));

		System.out.println("Sin duplicados");
		System.out.println(lg.quitarDuplicados(lg.invertirLista(l1)));

		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(2);
		l2.add(4);
		System.out.println("Mezcla: ");
		System.out.println(lg.nezclarListas(l1, l2));

		LinkedList<Integer> l11 = new LinkedList<Integer>();
		LinkedList<Integer> l12 = new LinkedList<Integer>();
		l11.add(39);
		l11.add(41);
		l11.add(17);
		l11.add(3);
		l11.add(11);
		l11.add(73);
		l11.add(81);

		l11.add(22);
		l11.add(9);
		l11.add(14);
		l11.add(6);

		l12.add(22);
		l12.add(14);
		l12.add(6);

		System.out.print("Es sublista  ");
		System.out.println(lg.esSublista(l12, l11));

		ListaGenerica<String> lgs = new ListaGenerica<String>();
		LinkedList<String> l3 = new LinkedList<String>();
		LinkedList<String> l4 = new LinkedList<String>();
		l3.add("Hola");
		l3.add("Java");
		l4.add("Mundo");
		System.out.println("Mezcla");
		System.out.println(lgs.nezclarListas(l3, l4));
	}

}
