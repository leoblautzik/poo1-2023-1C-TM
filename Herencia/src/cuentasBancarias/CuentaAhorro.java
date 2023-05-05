package cuentasBancarias;

public class CuentaAhorro extends Cuenta {

	public CuentaAhorro(int dni) {
		super(dni);
		
	}

	@Override
	public double extraer(double monto) {
		if (getSaldo() >= monto){
			super.setSaldo(super.getSaldo() - monto);
			return monto;
		}
		System.out.println("Saldo insuficiente");
		return 0;
	}

}
