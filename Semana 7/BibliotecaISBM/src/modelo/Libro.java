package modelo;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private int paginas;

    public Libro(String isbn, String titulo, String autor, int anoPublicacion, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.paginas = paginas;
    }

    // Getters y Setters
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return String.format("ISBN: %s, Título: %s, Autor: %s, Año: %d, Páginas: %d",
                isbn, titulo, autor, anoPublicacion, paginas);
    }
}
