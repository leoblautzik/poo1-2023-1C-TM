package procesarPersonas;

import java.util.Comparator;

public class ApellidoComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		
		return o1.getApenom().compareTo(o2.getApenom());
		
	}

}
