package biblioteca;

public class Biblioteca {
	private Libro[] libros;
	private int cantLibros;

	// Se construya a partir de la máxima cantidad de libros que puede contener.
	public Biblioteca(int maxCantidadDeLibros) {
		this.libros = new Libro[maxCantidadDeLibros];
		this.cantLibros = 0;
	}

	// Se pueda consultar la cantidad de libros que contiene.
	public int cuantosLibros() {
		return this.cantLibros;
	}

	// Se pueda agregar un libro indicando su título, autor, Genero y cantidad de
	// páginas,
	// siempre y cuando haya lugar en la Biblioteca.
	public void agregarLibro(String titulo, String autor, Genero genero, int paginas) {
		if (this.cantLibros >= this.libros.length)
			throw new Error("No hay mas lugar chabón");
		Libro l = new Libro(titulo, autor, genero, paginas);
		libros[this.cantLibros] = l;
		this.cantLibros++;
	}

	// Devuelva el título de un libro a partir de la posición.
	public String libroEnLaPosicion(int posicion) {
		if (posicion < 1 || posicion > this.cantLibros)
			throw new Error("Posición fuera de rango");
		return libros[posicion - 1].getTitulo();
	}

	// Devuelva el libro con más cantidad de páginas.
	public Libro libroConMasPaginas() {
		int libroConMasPaginas = 0;

		for (int i = 1; i < this.cantLibros; i++) {
			if (libros[i].getPaginas() > libros[libroConMasPaginas].getPaginas())
				libroConMasPaginas = i;
		}
		return libros[libroConMasPaginas];

	}

	// Se pueda consultar cuantos libros hay de determinado autor.
	public int cuantosLibrosDelAutor(String autor) {
		int contador = 0;

		for (int i = 0; i < this.cantLibros; i++) {
			if (libros[i].getAutor().equals(autor))
				contador++;
		}

		return contador;

	}

	// Devuelva un arreglo con todos los Libros de un autor que se pasa por
	// parámetro.
	public Libro[] librosDelAutor(String autor) {
		int tam = this.cuantosLibrosDelAutor(autor);
		if (tam == 0)
			return null;
		Libro[] aux = new Libro[tam];
		int pos = 0;

		for (int i = 0; i < this.cantLibros; i++) {
			if (libros[i].getAutor().equals(autor)) {
				aux[pos] = this.libros[i];
				pos++;
			}
		}
		return aux;
	}

	// Calcule el tiempo (en minutos) que llevaría leer todos los libros, asumiendo
	// que se tarda 1 minuto por página.
	public int tiempoEnLeetTodosLosLibros() {
		int minutos = 0;
		for (int i = 0; i < this.cantLibros; i++) {
			minutos += libros[i].getPaginas();
		}
		return minutos;

	}

	// Informe por pantalla la cantidad de libros que hay por cada Genero literario.
	public String librosPorGeneroLiterario() {

		Genero generos[] = Genero.values();
		int acumuladores[] = new int[generos.length];
		String cadena = "";

		for (int i = 0; i < this.cantLibros; i++) {
			acumuladores[libros[i].getGenero().ordinal()]++;
		}
		for (int i = 0; i < generos.length; i++) {
			cadena += generos[i] + "\t" + acumuladores[i] + "\n";
		}
		
		return cadena;

	}
}