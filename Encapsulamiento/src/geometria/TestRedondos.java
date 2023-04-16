package geometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRedondos {

	@Test
	public void radioTest() {
		Circulo c1 = new Circulo(1,1,2);
		assertEquals(2, c1.getRadio(),0.1);	
	}
	@Test
	public void diametroTest() {
		Circulo c1 = new Circulo(1,1,2);
		assertEquals(4, c1.getDiametro(),0.1);	
	}
	
	@Test(expected=Error.class)
	public void radioNegativoTest() {
		Circulo c1 = new Circulo(1,1,-2);
		
	}
	
	@Test
	public void areaTest() {
		Circulo c1 = new Circulo(1,1,2);
		double esperado = Math.PI * 4;
		assertEquals(esperado, c1.getArea(),0.1);	
	}
	@Test
	public void area3Test() {
		Circulo c1 = new Circulo(1,1,3);
		double esperado = Math.PI * 9;
		assertEquals(esperado, c1.getArea(),0.1);	
	}
	
	@Test
	public void perimetroTest() {
		Circulo c1 = new Circulo(1,1,2);
		double esperado = Math.PI * 4;
		assertEquals(esperado, c1.getPerimetro(),0.1);	
	}
	
	@Test
	public void coronaPerimetroTest() {
		CoronaCircular cc = new CoronaCircular(1,1,1, 2);
		double esperado = 6 *Math.PI; 	
		assertEquals(esperado, cc.getPerimetro(),0.1);
	}
	
	@Test
	public void coronaAreaTest() {
		CoronaCircular cc = new CoronaCircular(1,1,1, 2);
		double esperado = 3 * Math.PI; 	
		assertEquals(esperado, cc.getArea(),0.1);
	}
	
	@Test(expected=Error.class)
	public void coronaRadiosInvertidosTest() {
		CoronaCircular cc = new CoronaCircular(2,2,2, 1);
		
	}

}
