package bibliotecaConList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	/**
	 * Devuelve un map de tipo <Genero, List<Libro>> 
	 * con los lobros de caga genero literario.
	 * @return HasMap<Genero, List<Libro>>
	 */
	public Map<Genero,List<Libro>> librosPorGeneroLiterario() {
		Map<Genero, List<Libro>> mapita = new HashMap<Genero, List<Libro>>();
		List<Libro> lista;
		//Recorro la lista de libros
		for (Libro cadaLibro : this.libros) {
			Genero k = cadaLibro.getGenero();
			if(!mapita.containsKey(k)) {
				lista = new ArrayList<Libro>();
			} else {
				lista = mapita.get(k);
			}
			lista.add(cadaLibro);
			mapita.put(k,lista);
		}
		return mapita;
	}
}