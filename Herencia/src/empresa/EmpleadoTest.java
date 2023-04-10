package empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoTest {

	@Test
	public void plantaPermanenteSolteroSinHijosSinAnti() {
		PlantaPermanente pp = new PlantaPermanente(100, 0, false, 0);
		assertEquals(30000, pp.getSalario(),0.001);
	}
	
	@Test
	public void plantaPermanenteCasadoSinHijosSinAnti() {
		PlantaPermanente pp = new PlantaPermanente(100, 0, true, 0);
		assertEquals(30100, pp.getSalario(),0.001);
	}
	@Test
	public void plantaPermanenteCasado2HijosSinAnti() {
		PlantaPermanente pp = new PlantaPermanente(100, 2, true, 0);
		assertEquals(30500, pp.getSalario(),0.001);
	}
	@Test
	public void plantaPermanenteCasado2Hijos10Anti() {
		PlantaPermanente pp = new PlantaPermanente(100, 2, true, 10);
		assertEquals(31500, pp.getSalario(),0.001);
	}
	
	@Test
	public void plantaTemporariaSolteroSinHijos() {
		PlantaTemporaria pt = new PlantaTemporaria(100, 0, false);
		assertEquals(20000, pt.getSalario(),0.001);
	}
	
	@Test
	public void plantaTemporariaCasado3Hijos() {
		PlantaTemporaria pt = new PlantaTemporaria(100, 3, true);
		assertEquals(20700, pt.getSalario(),0.001);
	}
	
	@Test
	public void gerenteCasado4Hijos5Anti() {
		Gerente g = new Gerente(100, 4, true, 5);
		assertEquals(41650, g.getSalario(),0.001);
	}
	
	@Test
	public void todosPolimorficosTest() {
		Empleado pp = new PlantaPermanente(100, 2, true, 10);
		Empleado pt = new PlantaTemporaria(100, 3, true);
		Empleado g = new Gerente(100, 4, true, 5);
		
		Empleado [] empleados = new Empleado[3];
		empleados[0] = g;
		empleados[1] = pt;
		empleados[2] = pp;
		double salariosTotales = 0;
		for(Empleado e : empleados) {
			salariosTotales += e.getSalario();
		}
		//31500 + 20700 + 41650
		assertEquals(93850, salariosTotales, 0.001);
		
		
	}
	

}
