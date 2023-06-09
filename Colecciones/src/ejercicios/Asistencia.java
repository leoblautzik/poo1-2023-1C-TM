package ejercicios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Asistencia {

	public Map<String, List<String>> asistenciaPorAlumno(Map<String, List<String>> porDia) {
		Map<String, List<String>> porAlumno = new TreeMap<String, List<String>>();

		for (Map.Entry<String, List<String>> entry : porDia.entrySet()) {
			String dia = entry.getKey();
			List<String> alumnos = entry.getValue();
			for (String alumno : alumnos) {
				if (porAlumno.containsKey(alumno)) {
					porAlumno.get(alumno).add(dia);
				} else {
					List<String> lista = new ArrayList<String>();
					lista.add(dia);
					porAlumno.put(alumno, lista);
				}
			}
		}
		return porAlumno;
	}

	public static void main(String[] args) {
		/*
		 * [(“Mie 10”, [“Ana", "Pedro"]), (“Vie 12”, [“Ana", "Luz”]), (“Mie 17”, [“Luz”,
		 * "Pedro"])
		 */
		Map<String, List<String>> asistenciaXdia = new TreeMap<String, List<String>>();

		List<String> listaMie10 = new LinkedList<String>();
		listaMie10.add("Ana");
		listaMie10.add("Pedro");
		asistenciaXdia.put("Mie 10", listaMie10);

		List<String> listaVie12 = new LinkedList<String>();
		listaVie12.add("Ana");
		listaVie12.add("Luz");
		asistenciaXdia.put("Vie 12", listaVie12);

		List<String> listaMie17 = new LinkedList<String>();
		listaMie17.add("Luz");
		listaMie17.add("Pedro");
		asistenciaXdia.put("Mie 17", listaMie17);

		List<String> listaMie1 = new LinkedList<String>();
		listaMie1.add("Luz");
		listaMie1.add("Pedro");
		listaMie1.add("Juancito");
		listaMie1.add("Ruth");
		asistenciaXdia.put("Mie 1", listaMie1);

		System.out.println(asistenciaXdia);

		Asistencia aa = new Asistencia();

		System.out.println(aa.asistenciaPorAlumno(asistenciaXdia));

	}

}
