package conjuntos;

import java.util.Set;
import java.util.TreeSet;

public class DemoConjuntos {

	public static void main(String[] args) {
		Punto p1 = new Punto(1,1);
		Punto p2 = new Punto(-1,1);
		Punto p3 = new Punto(-1,-1);
		Punto p4 = new Punto(1,-1);
		
		Set<Punto> conjunto = new TreeSet<Punto>();
		
		conjunto.add(p1);
		conjunto.add(p2);
		conjunto.add(p3);
		conjunto.add(p4);
		
		System.out.println(conjunto);

	}

}
