package maps;

import java.util.Map;
import java.util.TreeMap;

/*
In Java Map Interface is present in java.util package 
represents a mapping between a key and a value 
Java Map interface is not a subtype of the Collection interface 
Therefore it behaves a bit differently from the 
rest of the collection types A map contains unique keys

*/

public class FrecuenciaDePalabras {
	
	private Map<String, Integer> mapa = new TreeMap<String, Integer>();
	
	public void resolver(String texto) {
		String [] listaDePalabras = texto.split(" ");
		int cantidad;
		
		for (String palabra : listaDePalabras) {
			
			if(mapa.containsKey(palabra)) {
				cantidad = mapa.get(palabra);
				cantidad ++;
				
			}
			else {
				cantidad = 1;
				
			}
			mapa.put(palabra, cantidad);
		}
		
		System.out.println(mapa);
	}
	
	public static void main(String[] args) {
		FrecuenciaDePalabras fp = new FrecuenciaDePalabras();
		//fp.resolver("In Java Map Interface is present in java.util package represents a mapping between a key and a value Java Map interface is not a subtype of the Collection interface Therefore it behaves a bit differently from the rest of the collection types A map contains unique keys");
		fp.resolver("Boca Juniors demostró solidez y golpeó en los momentos justos para vencer a Belgrano de Córdoba con goles de Martín Payero y Darío Benedetto antes de los 10 minutos del segundo tiempo. El equipo de Jorge Almirón se impuso sin sobresaltos y en la próxima jornada visitará a Argentinos Juniors.\n"
				+ "\n"
				+ "En tanto que el conjunto de Guillermo Farré recibirá el domingo 21 de mayo en el Gigante de Alberdi a Talleres en una nueva edición del clásico de Córdoba.\n"
				+ "\n"
				+ "");
	
	
	}
	

}
