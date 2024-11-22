package modelo;

import java.util.ArrayList;

public class Almacen {
    private ArrayList<Libro> libros;

    public Almacen() {
        this.libros = new ArrayList<>();
    }

    public void addLibro(Libro libro) {
        libros.add(libro);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String titulo) {
        return libros.removeIf(libro -> libro.getTitulo().equalsIgnoreCase(titulo));
    }
}
