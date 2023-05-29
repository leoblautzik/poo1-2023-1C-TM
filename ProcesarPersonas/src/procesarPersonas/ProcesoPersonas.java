package procesarPersonas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProcesoPersonas {

	public static LinkedList<Persona> getPersonas(String entrada) {
		LinkedList<Persona> lp = new LinkedList<Persona>();

		try {
			FileReader input = new FileReader(entrada);
			BufferedReader bufInput = new BufferedReader(input);

			String line;
			int dni;
			String apenom;
			int edad;
			String[] datos;

			line = bufInput.readLine();
			while (line != null) {
				datos = line.split(" ");
				dni = Integer.parseInt(datos[0]);
				apenom = datos[1];
				edad = Integer.parseInt(datos[2]);
				Persona p = new Persona(dni, apenom, edad);
				lp.add(p);

				// lp.add(new Persona(Integer.parseInt(datos[0]), datos[1],
				// Integer.parseInt(datos[2])));

				line = bufInput.readLine();
			}
			bufInput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return lp;
	}

	public static LinkedList<Persona> getPersonasMayores(LinkedList<Persona> lp, int edad) {
		LinkedList<Persona> lpm = new LinkedList<Persona>();

		for (Persona cadaPersona : lp) {
			if (cadaPersona.getEdad() > edad) {
				lpm.add(cadaPersona);
			}
		}
		return lpm;
	}

	public static void imprimirLista(LinkedList<Persona> l, String archSalida) throws IOException {
		PrintWriter salida = new PrintWriter(new FileWriter(archSalida));

		for (Persona cadaPersona : l) {
			salida.println(cadaPersona);
		}
		salida.close();
	}

	public static int edadPromedio(List<Persona> l) {
		int suma = 0, cantidad = 0, promedio;

		for (Persona cadaPersona : l) {
			suma += cadaPersona.getEdad();
			cantidad++;
		}

		if (cantidad > 0) {
			return suma / cantidad;
		} else

			return 0;
	}

	// ¿Cual es la persona de mayor edad?, si hubiera varias,
	// mostrarlas a todas.

	public static void personasDeMayorEdad(List<Persona> l) {
		List<Persona> lm = new ArrayList<Persona>();
		int mayorEdad = l.get(0).getEdad();
		lm.add(l.get(0));

		for (int i = 1; i < l.size(); i++) {

			if (l.get(i).getEdad() > mayorEdad) {
				mayorEdad = l.get(i).getEdad();
				lm.clear();
				lm.add(l.get(i));
			} else if (l.get(i).getEdad() == mayorEdad)
				lm.add(l.get(i));

		}

		System.out.println(mayorEdad);
		System.out.println(lm);

	}

	public static TreeMap<Integer, List<Persona>> agruparPorEdad(List<Persona> l) {
		TreeMap<Integer, List<Persona>> tm = new TreeMap<Integer, List<Persona>>();

		for (Persona cadaPersona : l) {

			Integer key = cadaPersona.getEdad();
			if (tm.containsKey(key)) {
				tm.get(key).add(cadaPersona);
			} else {
				ArrayList<Persona> nuevaLista = new ArrayList<Persona>();
				nuevaLista.add(cadaPersona);
				tm.put(key, nuevaLista);
			}
		}
		return tm;
	}

	public static void imprimirMapa(TreeMap<Integer, List<Persona>> mapa) throws IOException {
		PrintWriter salida = new PrintWriter(new FileWriter("porEdad.out"));
		
		int menorEdad = mapa.firstKey();
		salida.printf("Las personas de menor edad (%d) son : \n", menorEdad);
		
		for (Persona p : mapa.get(menorEdad)) {
			salida.println(p);
		}
		salida.println("--------------------------------------------------");
		int mayorEdad = mapa.lastKey();
		salida.printf("Las personas de mayor edad (%d) son : \n", mayorEdad);
		
		for (Persona p : mapa.get(mayorEdad)) {
			salida.println(p);
		}
		salida.println("--------------------------------------------------");

		for (Map.Entry<Integer, List<Persona>> entry : mapa.entrySet()) {
			Integer key = entry.getKey();
			List<Persona> val = entry.getValue();
			salida.println("Edad: " + key);
			for (Persona persona : val) {
				salida.println(persona);
			}
		}
		
		salida.close();
	}

	public static void main(String[] args) throws IOException {
		LinkedList<Persona> lp = getPersonas("personas.in");
		imprimirLista(lp, "leidas.out");
		LinkedList<Persona> lpm = getPersonasMayores(lp, 30);
		String filename = "MayoresDe30.out";
		imprimirLista(lpm, filename);
		personasDeMayorEdad(lpm);

		imprimirMapa(agruparPorEdad(lp));

	}

}
