package pony;

public class PonyExpress {
	
	public int caballos(int estaciones []) {
		
		int caballos = 1;
		int distanciaARecorrer = estaciones[0];
		for(int i = 1; i < estaciones.length; i++) {
			if(distanciaARecorrer + estaciones[i] > 100) {
				caballos ++;
				distanciaARecorrer = estaciones[i];
			}
			else {
				distanciaARecorrer += estaciones[i];
			}
		}
		return  caballos;
	}
}
