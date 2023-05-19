package bibliotecaConList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BibliotecaConListTest {

	@Test
	public void agregarLibroTest() {
		// Libro otraVueltaDeTuerca = new Libro("Otra vuelta de tuerca",
		// "Henry James", Genero.Suspenso, 155);

		Biblioteca bDc = new Biblioteca(1);
		bDc.agregarLibro("Otra vuelta de tuerca", "Henry James", Genero.Suspenso, 155);
		assertEquals(1, bDc.cuantosLibros());

	}
	
	@Test
	public void tituloApartirDeLaPosicionTest() {
		Biblioteca bDc = new Biblioteca(5);
		bDc.agregarLibro("Otra vuelta de tuerca", "Henry James", Genero.Suspenso, 1800);
		bDc.agregarLibro("Moby Dick", "Herman Melville", Genero.Novela, 1800);
		assertEquals("Otra vuelta de tuerca", bDc.libroEnLaPosicion(1));
		assertEquals("Moby Dick", bDc.libroEnLaPosicion(2));
	}

	@Test(expected = Error.class)
	public void tituloApartirDeLaPosicionInvalidaTest() {
		Biblioteca bDc = new Biblioteca(5);
		bDc.agregarLibro("Otra vuelta de tuerca", "Henry James", Genero.Suspenso, 1800);
		bDc.agregarLibro("Moby Dick", "Herman Melville", Genero.Novela, 1800);
		assertEquals("Otra vuelta de tuerca", bDc.libroEnLaPosicion(1));
		assertEquals("Moby Dick", bDc.libroEnLaPosicion(3));
	}
	
	@Test(expected = Error.class)
	public void tituloApartirDeLaPosicion0Test() {
		Biblioteca bDc = new Biblioteca(10);
		bDc.agregarLibro("Otra vuelta de tuerca", "Henry James", Genero.Suspenso, 1800);
		bDc.agregarLibro("Moby Dick", "Herman Melville", Genero.Novela, 1800);
		assertEquals("Otra vuelta de tuerca", bDc.libroEnLaPosicion(1));
		assertEquals("Moby Dick", bDc.libroEnLaPosicion(0));
	}
	
	@Test
	public void libroConMasPaginasTest() {
		Biblioteca bDc = new Biblioteca(10);
		bDc.agregarLibro("Otra vuelta de tuerca", "Henry James", Genero.Suspenso, 155);
		bDc.agregarLibro("Moby Dick", "Herman Melville", Genero.Novela, 1800);
		bDc.agregarLibro("El origen", "Dan Brown", Genero.Novela, 989);
		Libro esperado = new Libro ("Moby Dick", "Herman Melville", Genero.Novela, 1800);
		assertEquals(esperado, bDc.libroConMasPaginas());
		assertEquals(1800, bDc.libroConMasPaginas().getPaginas());
		
	}
	
	@Test
	public void cuantosLibreosDelAutorTest() {
		Biblioteca bDc = new Biblioteca(10);
		bDc.agregarLibro("Otra vuelta de tuerca", "Henry James", Genero.Suspenso, 155);
		bDc.agregarLibro("Moby Dick", "Herman Melville", Genero.Novela, 1800);
		bDc.agregarLibro("El origen", "Dan Brown", Genero.Novela, 989);
		bDc.agregarLibro("Inferno", "Dan Brown", Genero.Novela, 1200);
		
		List<Libro> esperada = new ArrayList<Libro>();
		esperada.add(new Libro("El origen", "Dan Brown", Genero.Novela, 989));
		esperada.add(new Libro("Inferno", "Dan Brown", Genero.Novela, 1200));
		
		assertEquals(esperada, bDc.librosDelAutor("Dan Brown"));
		
		
		
	}
	
	@Test
	public void tiempoEnLeerLaBibliotecaTest() {
		Biblioteca bDc = new Biblioteca(10);
		bDc.agregarLibro("Otra vuelta de tuerca", "Henry James", Genero.Suspenso, 155);
		bDc.agregarLibro("El origen", "Dan Brown", Genero.Novela, 989);
		assertEquals(1144, bDc.tiempoEnLeetTodosLosLibros());
	}
	
	@Test
	public void tiempoEnLeerLaBibliotecaVaciaTest() {
		Biblioteca bDc = new Biblioteca(10);
		assertEquals(0, bDc.tiempoEnLeetTodosLosLibros());
	}
	
	@Test
	public void librosPorGeneroTest() {
		Biblioteca bDc = new Biblioteca(10);
		bDc.agregarLibro("Otra vuelta de tuerca", "Henry James", Genero.Suspenso, 155);
		bDc.agregarLibro("Moby Dick", "Herman Melville", Genero.Novela, 1800);
		bDc.agregarLibro("El origen", "Dan Brown", Genero.Historia, 989);
		bDc.agregarLibro("Inferno", "Dan Brown", Genero.Novela, 1200);
	
		System.out.println(bDc.librosPorGeneroLiterario());
		
	}

}
