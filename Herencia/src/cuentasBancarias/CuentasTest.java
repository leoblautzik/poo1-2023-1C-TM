package cuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentasTest {

	@Test
	public void depositarEnCAtest() {
		Cuenta ca = new CuentaAhorro(123);
		assertEquals(0.0, ca.getSaldo(), 0.01);
		ca.depositar(10000);
		assertEquals(10000.0, ca.getSaldo(), 0.01);
	}
	@Test
	public void depositarEnCCAtest() {
		Cuenta ca = new CuentaCorriente(123, 5000);
		assertEquals(0.0, ca.getSaldo(), 0.01);
		ca.depositar(10000);
		assertEquals(10000.0, ca.getSaldo(), 0.01);
	}
	
	@Test
	public void extraerEnCAtest() {
		Cuenta ca = new CuentaAhorro(123);
		assertEquals(0.0, ca.getSaldo(), 0.01);
		ca.depositar(10000);
		assertEquals(10000.0, ca.getSaldo(), 0.01);
		ca.extraer(8000);
		assertEquals(2000.0, ca.getSaldo(), 0.01);
		ca.extraer(2000);
		assertEquals(000.0, ca.getSaldo(), 0.01);
		
	}
	
	@Test
	public void extraerEnCCtest() {
		Cuenta ca = new CuentaCorriente(123, 5000);
		assertEquals(0.0, ca.getSaldo(), 0.01);
		ca.depositar(10000);
		assertEquals(10000.0, ca.getSaldo(), 0.01);
		ca.extraer(8000);
		assertEquals(2000.0, ca.getSaldo(), 0.01);
		ca.extraer(2000);
		assertEquals(000.0, ca.getSaldo(), 0.01);
		
	}
	
	@Test
	public void extraerMasDelSaldoEnCAtest() {
		Cuenta ca = new CuentaAhorro(123);
		ca.depositar(10000);
		assertEquals(0.0,ca.extraer(12000),0.01);
		
	}
	
	@Test
	public void extraerMasDelSaldoEnCCtest() {
		Cuenta ca = new CuentaCorriente(123, 5000);
		ca.depositar(10000);
		ca.extraer(12000);
		assertEquals(-2000,ca.getSaldo(),0.01);
		
	}
	
	@Test
	public void TransferirEntreCAtest() {
		Cuenta ca = new CuentaAhorro(123);
		Cuenta cb = new CuentaAhorro(345);
		ca.depositar(100000);
		ca.transferir(cb, 20000);
		assertEquals(80000, ca.getSaldo(),0.01);
		assertEquals(20000, cb.getSaldo(),0.01);
	}
	
	@Test
	public void TransferirEntreCuentastest() {
		Cuenta ca = new CuentaCorriente(123, 20000);
		Cuenta cb = new CuentaAhorro(345);
		ca.depositar(100000);
		ca.transferir(cb, 120000);
		assertEquals(120000, cb.getSaldo(),0.01);
		assertEquals(-20000, ca.getSaldo(),0.01);
	}
	
	@Test
	public void TransferirEntreCuentasNoAlcanzatest() {
		Cuenta ca = new CuentaCorriente(123, 20000);
		Cuenta cb = new CuentaAhorro(345);
		ca.depositar(100000);
		ca.transferir(cb, 120000.50);
		assertEquals(0, cb.getSaldo(),0.01);
		assertEquals(100000, ca.getSaldo(),0.01);
	}
	
	@Test
	public void TransferirEntreCAInsuficientetest() {
		Cuenta ca = new CuentaAhorro(123);
		Cuenta cb = new CuentaAhorro(345);
		ca.depositar(100000);
		ca.transferir(cb, 120000);
		assertEquals(100000, ca.getSaldo(),0.01);
		assertEquals(0000, cb.getSaldo(),0.01);
	}

}
