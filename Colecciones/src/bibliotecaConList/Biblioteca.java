package bibliotecaConList;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private ArrayList<Libro> libros;

	// Se construya a partir de la cantidad inicial de libros.
	public Biblioteca(int cantidadInicial) {
		this.libros = new ArrayList<Libro>(cantidadInicial);

	}

	// Se pueda consultar la cantidad de libros que contiene.
	public int cuantosLibros() {
		return this.libros.size();
	}

	// Se pueda agregar un libro indicando su título, autor, Genero y cantidad de
	// páginas,
	public void agregarLibro(String titulo, String autor, Genero genero, int paginas) {
		Libro l = new Libro(titulo, autor, genero, paginas);
		libros.add(l);
	}

	// Devuelva el título de un libro a partir de la posición.
	public String libroEnLaPosicion(int posicion) {
		if (posicion < 1 || posicion > this.libros.size())
			throw new Error("Posición fuera de rango");
		return libros.get(posicion-1).getTitulo();
	}

	// Devuelva el libro con más cantidad de páginas.
	public Libro libroConMasPaginas() {
		Libro conMasPaginas = libros.get(0);
		
		for (Libro libro : libros) {
			if (libro.getPaginas() > conMasPaginas.getPaginas()) {
				conMasPaginas = libro;
			}
		}
		return conMasPaginas;

	}

	// Se pueda consultar cuantos libros hay de determinado autor.
	public int cuantosLibrosDelAutor(String autor) {
		int contador = 0;

		for (Libro libro : libros) {
			if (libro.getAutor().equals(autor)) {
				contador ++;
			}
		}

		return contador;

	}

	// Devuelva un arreglo con todos los Libros de un autor que se pasa por
	// parámetro.
	public List<Libro> librosDelAutor(String autor) {
		ArrayList<Libro> aux = new ArrayList<Libro>();
		
		for (Libro libro : libros) {
			if (libro.getAutor().equals(autor)) {
				aux.add(libro);
			}
		}
		
		return aux;
	}

	// Calcule el tiempo (en minutos) que llevaría leer todos los libros, asumiendo
	// que se tarda 1 minuto por página.
	public int tiempoEnLeetTodosLosLibros() {
		int minutos = 0;
		for (Libro libro : libros) {
			minutos += libro.getPaginas();
		}
		return minutos;

	}

	// Informe por pantalla la cantidad de libros que hay por cada Genero literario.
	public String librosPorGeneroLiterario() {

		Genero generos[] = Genero.values();
		int acumuladores[] = new int[generos.length];
		String cadena = "";

		for (Libro libro : libros) {
			acumuladores[libro.getGenero().ordinal()]++;
			
		}
				
		for (int i = 0; i < generos.length; i++) {
			cadena += generos[i] + "\t" + acumuladores[i] + "\n";
		}

		return cadena;

	}
}