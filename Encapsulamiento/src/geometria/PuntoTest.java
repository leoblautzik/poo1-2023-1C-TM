package geometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class PuntoTest {

	@Test
	public void estaSobreXTest() {
		Punto puntito = new Punto(5,0);
		assertTrue(puntito.estaSobreElEjeX());
	}
	
	@Test
	public void noEestaSobreXTest() {
		Punto puntito = new Punto(5,5);
		assertFalse(puntito.estaSobreElEjeX());
	}
	
	@Test
	public void elOrigenestaSobreXTest() {
		Punto puntito = new Punto(0,0);
		assertTrue(puntito.estaSobreElEjeX());
	}
	
	
	
	@Test
	public void distanciaAlOrigenDelOrigenTest() {
		Punto puntito = new Punto(0,0);
		double esperado = 0;
		double obtenido = puntito.distanciaAlOrigen();
		assertEquals(esperado, obtenido, 0.01);
		
	}
	@Test
	public void distanciaAlOrigenTest() {
		Punto puntito = new Punto(3,4);
		double esperado = 5;
		double obtenido = puntito.distanciaAlOrigen();
		assertEquals(esperado, obtenido, 0.01);
		
	}
	
	@Test
	public void distanciaAlOrigenSiEstaSobreXTest() {
		Punto puntito = new Punto(3,0);
		double esperado = 3;
		double obtenido = puntito.distanciaAlOrigen();
		assertEquals(esperado, obtenido, 0.01);
		
	}
	
	@Test
	public void distanciaEntreDosPuntosTest() {
		Punto puntin = new Punto(3,3);
		Punto punton = new Punto(-3,-3);
		
		double esperado = 2 * puntin.distanciaAlOrigen();
		double obtenido = puntin.distancia(punton);
		assertEquals(esperado, obtenido, 0.01);
		
	}

}
