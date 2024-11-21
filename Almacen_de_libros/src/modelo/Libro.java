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
}