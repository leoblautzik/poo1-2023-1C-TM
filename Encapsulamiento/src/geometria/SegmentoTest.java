package geometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class SegmentoTest {

	@Test
	public void longitudTest() {
		Punto a = new Punto();
		Punto b = new Punto(3,4);
		Segmento s = new Segmento(a, b);
		
		assertEquals(5, s.longitud(), 0.001);
				
	}
	
	@Test
	public void paraleloAXTest() {
		Punto a = new Punto();
		Punto b = new Punto(3,4);
		Segmento s1 = new Segmento(a, b);
		
		Punto c = new Punto(-3, 4);
		Segmento s2 = new Segmento(c, b);
		
		assertFalse(s1.esParaleloAX());
		assertTrue(s2.esParaleloAX());
				
	}
	
	@Test
	public void paraleloAYTest() {
		Punto a = new Punto();
		Punto b = new Punto(3,4);
		Segmento s1 = new Segmento(a, b);
		
		Punto c = new Punto(3, -19);
		Segmento s2 = new Segmento(c, b);
		
		assertFalse(s1.esParaleloAY());
		assertTrue(s2.esParaleloAY());
				
	}
	
	@Test
	public void sonParalelosTest() {
		Punto a = new Punto();
		Punto b = new Punto(3,4);
		Segmento s1 = new Segmento(a, b);
		
		Punto c = new Punto(4, 3);
		Punto d = new Punto(7, 7);
		Segmento s2 = new Segmento(c, d);
		
		assertTrue(s1.esParalelo(s2));
	}
	
	@Test
	public void sonPPerpendicularesTest() {
		Punto a = new Punto(3,0);
		Punto b = new Punto(5,0);
		Segmento s1 = new Segmento(a, b);
		
		Punto c = new Punto(0, 3);
		Punto d = new Punto(0, 5);
		Segmento s2 = new Segmento(c, d);
		
		assertTrue(s1.esPerpendicular(s2));
	}

}
