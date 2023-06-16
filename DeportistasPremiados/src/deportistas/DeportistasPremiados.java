package deportistas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class DeportistasPremiados {

	private TreeMap<Integer, ArrayList<String>> premiados;

	public DeportistasPremiados() {
		this.premiados = new TreeMap<Integer, ArrayList<String>>(Collections.reverseOrder());
	}

	public void leerDeportistas(String archivo) {
		Integer anio;
		String torneoTenista;
		ArrayList<String> l;
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);

			String linea = br.readLine();
			while (linea != null) {

				String[] datos = linea.split(",");
				try {
					anio = Integer.parseInt(datos[1].trim());
					torneoTenista = datos[2] + "\t" + datos[0];

					// si la key no esta creo, la lista
					if (!premiados.containsKey(anio)) {
						l = new ArrayList<String>();
					}
					// si la clave esta pido, la lista
					else {
						l = premiados.get(anio);
					}
					l.add(torneoTenista);
					this.premiados.put(anio, l);
				} catch (NumberFormatException nfe) {
					System.err.println("Anio incorrecto");
				}
				linea = br.readLine();
			}
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void generarResultado(String salida) throws IOException {
		PrintWriter pr = new PrintWriter(new File(salida));

		for (Map.Entry<Integer, ArrayList<String>> entry : premiados.entrySet()) {
			Integer anio = entry.getKey();
			ArrayList<String> lista = entry.getValue();
			pr.println("Año:" + anio);
			for (String s : lista) {
				pr.println(s);
			}
			pr.println("---------------------------------------------------");
		}
		pr.close();
	}

	protected TreeMap<Integer, ArrayList<String>> getPremiados() {
		return premiados;
	}

	public static void main(String[] args) throws IOException {
		DeportistasPremiados dp = new DeportistasPremiados();
		dp.leerDeportistas("premiados.in");
		System.out.println(dp.getPremiados());
		dp.generarResultado("premiados.out");
	}

}
