package geometria;

public class CoronaCircular {
	
	private Circulo grande;
	private Circulo agujero;
	
	public CoronaCircular(double radioInterior, double radioExterior) {
		if (radioInterior >= radioExterior)
			throw new Error("Radios invalidos");
		this.agujero = new Circulo(radioInterior);
		this.grande = new Circulo(radioExterior);
	}
	
	public double getArea() {
		return this.grande.getArea() - this.agujero.getArea();
	}
	
	public double getPerimetro() {
		return this.grande.getPerimetro() + this.agujero.getPerimetro();
	}

}
