package pilasycolas;

import java.util.Stack;

public class DemoPilas {
	
	public static void main(String[] args) {
		Stack<Integer> pilaint = new Stack<Integer>();
		int ultimo;
		pilaint.push(1);
		pilaint.push(2);
		pilaint.push(3);
		pilaint.push(4);
		pilaint.push(5);
		pilaint.push(6);
		System.out.println(pilaint);
		System.out.println(pilaint.peek());
		ultimo = pilaint.pop();
		System.out.println(ultimo);
		System.out.println(pilaint);
	}

}
