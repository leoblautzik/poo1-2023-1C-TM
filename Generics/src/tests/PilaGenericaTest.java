package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import genericos.PilaGenericaArray;
import genericos.PilaGenericaLL;

public class PilaGenericaTest {

	@Test
	public void apilarDesapilarLLtest() {
		PilaGenericaLL<Integer> p = new PilaGenericaLL<Integer>();
		p.push(1);
		p.push(2);
		p.push(3);
		p.push(4);
		p.push(5);
		
		assertEquals((Integer)5, p.pop());
		System.out.println(p);
	}
	
	@Test
	public void pilaLLVaciatest() {
		PilaGenericaLL<Integer> p = new PilaGenericaLL<Integer>();
				
		assertEquals(null, p.pop());
		System.out.println(p);
	}
	
	
	@Test
	public void apilarDesapilarLLStringtest() {
		PilaGenericaLL<String> p = new PilaGenericaLL<String>();
		p.push("Hola");
		p.push("Mundo");
		
		assertEquals("Mundo", p.pop());
		System.out.println(p);
	}
	@Test
	public void apilarDesapilarArrtest() {
		PilaGenericaArray<Integer> p = new PilaGenericaArray<Integer>();
		p.push(1);
		p.push(2);
		p.push(3);
		p.push(4);
		p.push(5);
		
		assertEquals((Integer)5, p.pop());
		System.out.println(p);
	}
	
	@Test
	public void pilaVaciaArrtest() {
		PilaGenericaArray<Integer> p = new PilaGenericaArray<Integer>();
		
		assertEquals(null, p.pop());
		
	}
	
	@Test
	public void apilarDesapilarAStringtest() {
		PilaGenericaArray<String> p = new PilaGenericaArray<String>();
		p.push("Hola");
		p.push("Mundo");
		
		assertEquals("Mundo", p.pop());
		System.out.println(p);
	}

}
