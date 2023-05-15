package pilasycolas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TerminalTeletipoTest {

	@Test
	public void enunciadoTest() {
		
		TerminalDeTeletipo ttt = new TerminalDeTeletipo();
		assertEquals("ae", ttt.procesar("abc/d//e"));
		
	}
	
	@Test
	public void barrasTest() {
		
		TerminalDeTeletipo ttt = new TerminalDeTeletipo();
		assertEquals("", ttt.procesar("///"));
		
	}
	
	@Test
	public void barrasYletraTest() {
		
		TerminalDeTeletipo ttt = new TerminalDeTeletipo();
		assertEquals("e", ttt.procesar("///e"));
		
	}
	@Test
	public void masBarrasQueletraTest() {
		
		TerminalDeTeletipo ttt = new TerminalDeTeletipo();
		assertEquals("e", ttt.procesar("/w/a//e"));
		
	}
	
	@Test
	public void ampersandTest() {
		
		TerminalDeTeletipo ttt = new TerminalDeTeletipo();
		assertEquals("e", ttt.procesar("abc/d//&e"));
		
	}

}
