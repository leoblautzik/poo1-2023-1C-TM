package numeroFraccionario;

public class Fraccion {
	
	private int numeraador, denominador;
	
	public Fraccion (int numerador, int denominador) {
		if (denominador == 0) {
			throw new Error("Denominador no puede ser 0");
		}
		this.numeraador = numerador;
		this.denominador = denominador;
	}
	
	public Fraccion sumar(Fraccion otra) {
		int denominadorComun = this.denominador * otra.denominador / 
				mcd(this.denominador, otra.denominador);
		int numerador = denominadorComun / this.denominador * this.numeraador +
				denominadorComun / otra.denominador * otra.numeraador;
		Fraccion resultado = new Fraccion(numerador, denominadorComun);
		resultado.simplificar();
		return resultado;
		
		
	}
	
	public void simplificar() {
		int mcd = mcd(this.numeraador, this.denominador);
		this.numeraador /= mcd;
		this.denominador /= mcd; 
	}
	
	private int mcd(int a, int b) {
		if (b == 0)
			return a;
		return mcd(b, a%b);
	}
	
	@Override
	public String toString() {
		return "[" + numeraador + "/" + denominador + "]";
	}

	public static void main(String[] args) {
		Fraccion a = new Fraccion(2,3);
		Fraccion b = new Fraccion(6,9);
		System.out.println(a.sumar(b));
	}

}
