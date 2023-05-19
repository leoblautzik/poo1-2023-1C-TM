package pilasycolas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayDeque;

import org.junit.Test;

public class GuiaColeccionesTest {
	GuiaColecciones gc = new GuiaColecciones();
	@Test
	public void doscolasenunatest() {
		
		ArrayDeque<Integer> q1 = new ArrayDeque<Integer>();
		ArrayDeque<Integer> q2 = new ArrayDeque<Integer>();
		ArrayDeque<Integer> q3 = new ArrayDeque<Integer>();

		q1.offer(1);
		q1.offer(2);
		q1.offer(3);
		
		q2.offer(5);
		q2.offer(7);
		
		q3.offer(1);
		q3.offer(2);
		q3.offer(3);
		q3.offer(5);
		q3.offer(7);
		
	
		
		GuiaColecciones gc = new GuiaColecciones();
		System.out.println(gc.dosColasEnUna(q1, q2));
		//assertEquals(q3, gc.dosColasEnUna(q1, q2));
		
	}
	@Test
	public void expresionBalanceadaTest() {
		
		String e ="{[()]}";
		assertTrue(gc.expresionBalanceada(e));
		e = "";
		assertFalse(gc.expresionBalanceada(e));
		e ="{[(()]}";
		assertFalse(gc.expresionBalanceada(e));
		e ="{{[()]}";
		assertFalse(gc.expresionBalanceada(e));
	}

}
