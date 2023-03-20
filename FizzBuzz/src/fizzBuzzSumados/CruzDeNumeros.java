package fizzBuzzSumados;

public class CruzDeNumeros {

	public String espacios(int n) {
		String cadena = "";
		for (int i = 1; i <= n; i++)
			cadena += " ";
		return cadena;
	}

	public String numerosHasta(int n) {
		String cadena = "";
		for (int i = 1; i <= n; i++)
			cadena += i;
		return cadena;
	}

	public String numerosDesde(int n) {
		String cadena = "";
		for (int i = n; i >= 1; i--)
			cadena += i;
		return cadena;
	}

	public void cruz(int n) {
		for (int i = 1; i < n; i++) {
			System.out.println(espacios(n - 1) + i);
		}
		System.out.print(numerosHasta(n - 1));
		System.out.print(n);
		System.out.println(numerosDesde(n - 1));
		for (int i = n -1; i >=1; i--) {
			System.out.println(espacios(n - 1) + i);
		}

	}

	public static void main(String[] args) {
		CruzDeNumeros cdn = new CruzDeNumeros();
		cdn.cruz(5);
	}

}
