package procesarPersonas;

public class Persona {
	private int dni;
	private String apenom;
	private int edad;
	
	public Persona(int dni, String apenom, int edad) {
		this.dni = dni;
		this.apenom = apenom;
		this.edad = edad;
	}

	protected int getDni() {
		return dni;
	}

	protected String getApenom() {
		return apenom;
	}

	protected int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return dni + " " + apenom + " " + edad;
				
	}
	
	

}
