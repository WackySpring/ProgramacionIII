package modelo;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int ano;
    private int paginas;

    public Libro(String isbn, String titulo, String autor, int ano, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.paginas = paginas;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public int getPaginas() {
        return paginas;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Título: " + titulo + ", Autor: " + autor + 
               ", Año: " + ano + ", Páginas: " + paginas;
    }
}
