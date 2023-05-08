package bibliotecaConList;

import java.util.Objects;

//Un libro de define por su título, autor, Genero y cantidad de páginas.

public class Libro {
	private String titulo;
	private String autor;
	private Genero genero;
	private int paginas;

	/*
	 * La clase deberá contener: un constructor con parámetros. los métodos set y
	 * get respectivos. el método toString().
	 */
	public Libro(String titulo, String autor, Genero genero, int paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.paginas = paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", paginas=" + paginas + "]";
	}
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(autor, genero, paginas, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && genero == other.genero && paginas == other.paginas
				&& Objects.equals(titulo, other.titulo);
	}

	public static void main(String[] args) {

		Libro otraVueltaDeTuerca = new Libro("Otra vuelta de tuerca", "Henry James", Genero.Suspenso, 155);
		System.out.println(otraVueltaDeTuerca);
	}

}
