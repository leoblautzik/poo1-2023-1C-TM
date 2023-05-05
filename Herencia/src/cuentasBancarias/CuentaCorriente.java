package cuentasBancarias;

public class CuentaCorriente extends Cuenta {

	private double descubierto;

	public CuentaCorriente(int dni, double descubierto) {
		super(dni);
		this.descubierto = descubierto;

	}

	@Override
	public double extraer(double monto) {
		if (super.getSaldo() + this.descubierto >= monto) {
			setSaldo(super.getSaldo() - monto);
			return monto;
		} else {
			System.out.println("Fondos insuficientes");
			return 0;
		}
	}
	


}
