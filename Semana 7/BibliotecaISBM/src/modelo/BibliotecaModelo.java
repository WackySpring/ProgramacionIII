package modelo;

import java.util.HashMap;

public class BibliotecaModelo {
    private HashMap<String, Libro> libros;

    public BibliotecaModelo() {
        libros = new HashMap<>();
    }

    // Operaciones CRUD
    public boolean agregarLibro(Libro libro) {
        if (libros.containsKey(libro.getIsbn())) {
            return false; // Ya existe un libro con el mismo ISBN
        }
        libros.put(libro.getIsbn(), libro);
        return true;
    }

    public Libro buscarLibro(String isbn) {
        return libros.get(isbn);
    }

    public boolean eliminarLibro(String isbn) {
        if (libros.containsKey(isbn)) {
            libros.remove(isbn);
            return true;
        }
        return false;
    }

    public boolean actualizarLibro(String isbn, Libro libroActualizado) {
        if (libros.containsKey(isbn)) {
            libros.put(isbn, libroActualizado);
            return true;
        }
        return false;
    }

    public HashMap<String, Libro> obtenerTodosLosLibros() {
        return libros;
    }
}
