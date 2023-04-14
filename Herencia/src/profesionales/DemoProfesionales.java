package profesionales;

import java.util.Arrays;

public class DemoProfesionales {

	public static void main(String[] args) {
		double honorariosTotales;
		Cirujano tazo = new Cirujano("Dr. Tazo");
		CirujanoCardiovascular venoso = new CirujanoCardiovascular("Dr. Venoso");
		Dentista molar = new Dentista("Dr. Molar");
		Endodoncista endo = new Endodoncista("Dr. Endo");
		Medico cureta = new Medico("Dr. Cureta");
		
		Profesional[] profesionales = {
				tazo, venoso, molar, endo, cureta};
		
		honorariosTotales = getHonorariosTotales(profesionales);
		
		System.out.println(honorariosTotales);
				
		Profesional.setBasico(200000);
		honorariosTotales = getHonorariosTotales(profesionales);
		System.out.println(honorariosTotales);
		
		Arrays.sort(profesionales);
		
		for (Profesional profesional : profesionales) {
			System.out.println(profesional);
		}
		
		
	}

	private static double getHonorariosTotales(Profesional[] profesionales) {
		double honorariosTotales = 0;
		
		for (Profesional profesional : profesionales) {
			honorariosTotales += profesional.getHonorarios();
		}
		return honorariosTotales;
	}
	
}
