package procesarPersonas;

import java.util.Comparator;

public class DNIApeComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		if(Integer.compare(o1.getDni(), o2.getDni())== 0)
			return o1.getApenom().compareTo(o2.getApenom());
		return Integer.compare(o1.getDni(), o2.getDni());
	}
	
	

}
