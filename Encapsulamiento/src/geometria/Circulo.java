package geometria;

public class Circulo {
	
	private double radio;
	
	public Circulo(double radio) {
		this.setRadio(radio);
	}

	public double getRadio() {
		return radio;
	}

	private void setRadio(double radio) {
		if(radio <= 0)
			throw new Error("No se adminten radios negativos");
		this.radio = radio;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(), 2); 
	}
	 
	public double getPerimetro() {
		return Math.PI * this.getDiametro(); 
	}
	
	public double getDiametro() {
		return 2 * this.getRadio();
	}
	
	
	

}
