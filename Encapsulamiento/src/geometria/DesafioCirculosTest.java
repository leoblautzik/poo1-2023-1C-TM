package geometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class DesafioCirculosTest {

	@Test
	public void circulosLejanosTest() {
		Circulo c1 = new Circulo(20, 0, 5);
		Circulo c2 = new Circulo(35, 0, 5);
		assertFalse(c1.intersectaCon(c2));
		assertFalse(c2.intersectaCon(c1));
	}

	@Test
	public void circulosConcentricosTest() {
		Circulo c1 = new Circulo(2, 1, 5);
		Circulo c2 = new Circulo(2, 1, 2);
		assertTrue(c1.intersectaCon(c2));
		assertTrue(c2.intersectaCon(c1));
	}

	@Test
	public void circulosDelEnunciadoTest() {
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		assertTrue(c1.intersectaCon(c2));
		assertTrue(c2.intersectaCon(c1));
	}
	
	@Test
	public void circulosTangentesTest() {
		Circulo c1 = new Circulo(new Punto(11, 0), 1);
		Circulo c2 = new Circulo(new Punto(13, 0), 1);
		assertTrue(c1.intersectaCon(c2));
		assertTrue(c2.intersectaCon(c1));
	}

}
