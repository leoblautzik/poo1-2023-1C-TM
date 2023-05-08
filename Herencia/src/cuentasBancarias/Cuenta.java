package cuentasBancarias;

public abstract class Cuenta {

	private int dni;
	private double saldo;

	public Cuenta(int dni, double saldo) {
		this.dni = dni;
		this.saldo = saldo;
	}

	public Cuenta(int dni) {
		this(dni, 0.0);
	}

	public abstract double extraer(double monto);

	public void depositar(double monto) {
		if (monto<0)
			throw new Error("Monto invalido");
		this.setSaldo(monto);
	}

	protected void setSaldo(double monto) {
		this.saldo = monto;
	}

	protected double getSaldo() {
		return saldo;
	}

	

	public void transferir(Cuenta destino, double monto) {
		destino.depositar(this.extraer(monto));
	}

	@Override
	public String toString() {
		return "Cuenta [dni=" + dni + ", saldo=" + saldo + "]";
	}
	
	

}
