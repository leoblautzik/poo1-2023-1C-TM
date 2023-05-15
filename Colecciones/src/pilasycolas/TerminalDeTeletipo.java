package pilasycolas;

import java.util.Stack;

public class TerminalDeTeletipo {

	public String procesar(String cadena) {
		String s = "";
		Stack<Character> pila = new Stack<Character>();
		Stack<Character> aux = new Stack<Character>();

		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == '/') {
				if (!pila.empty()) {
					pila.pop();
				}
								
			} else if (cadena.charAt(i) == '&') {
				while (!pila.empty()) {
					pila.pop();
				}
				
			} else {
				pila.push(cadena.charAt(i));
			}
		}

		System.out.println(pila);

		while (!pila.empty())

		{
			aux.push(pila.pop());
		}

		while (!aux.empty()) {
			s += aux.pop();
		}

		return s;
	}

}
