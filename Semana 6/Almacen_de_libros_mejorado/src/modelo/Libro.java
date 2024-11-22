package modelo;

public class Libro {
    private Autor autor;
    private String titulo;
    private int ano;
    private int paginas;
    private float precio;

    public Libro(Autor autor, String titulo, int ano, int paginas, float precio) {
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;
        this.paginas = paginas;
        this.precio = precio;
    }

    // Getters
    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public int getPaginas() {
        return paginas;
    }

    public float getPrecio() {
        return precio;
    }

    // Setters
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Año: " + ano + ", Páginas: " + paginas + ", Precio: $" + precio + 
               ", Autor: " + autor.toString();
    }
}
