package cuentasBancarias;

import java.util.ArrayList;
import java.util.List;

public class DemoCuentas {
	
	public static void main(String[] args) {
		
		Cuenta ca1 = new CuentaAhorro(123);
		Cuenta cc1 = new CuentaCorriente(345, 20000);
		Cuenta ca2 = new CuentaAhorro(111);
		Cuenta cc2 = new CuentaCorriente(222, 10000);
		
		ca1.depositar(100);
		
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		
		cuentas.add(ca1);
		cuentas.add(cc1);
		cuentas.add(ca2);
		cuentas.add(cc2);
		
		System.out.println(cuentas);
		
		cc2.depositar(5000);
		
		System.out.println(cuentas);
		
		System.out.println(cuentas.get(2));
		cuentas.add(2, new CuentaAhorro(444));		
		System.out.println(cuentas);
		
		cuentas.remove(cuentas.indexOf(cc1));
		System.out.println(cuentas);
		
		System.out.println(cuentas.contains(ca1));
	}

}
