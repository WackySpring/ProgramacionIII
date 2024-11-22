package modelo;

import java.util.HashMap;
import java.util.Scanner;

public class Biblioteca {
    private HashMap<String, Libro> libros;
    private Scanner scanner;

    public Biblioteca() {
        libros = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    // Crear libro
    public void agregarLibro() {
        System.out.print("Introduzca el ISBN: ");
        String isbn = scanner.nextLine();
        if (libros.containsKey(isbn)) {
            System.out.println("El libro con ISBN " + isbn + " ya existe.");
            return;
        }

        System.out.print("Introduzca el título: ");
        String titulo = scanner.nextLine();
        System.out.print("Introduzca el autor: ");
        String autor = scanner.nextLine();
        System.out.print("Introduzca el año de publicación: ");
        int ano = scanner.nextInt();
        System.out.print("Introduzca el número de páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        libros.put(isbn, new Libro(isbn, titulo, autor, ano, paginas));
        System.out.println("Libro agregado con éxito.");
    }

    // Leer libros
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }

        System.out.println("Libros en la biblioteca:");
        libros.forEach((isbn, libro) -> System.out.println(libro));
    }

    // Actualizar libro
    public void actualizarLibro() {
        System.out.print("Introduzca el ISBN del libro que desea actualizar: ");
        String isbn = scanner.nextLine();

        Libro libro = libros.get(isbn);
        if (libro == null) {
            System.out.println("No se encontró un libro con ese ISBN.");
            return;
        }

        System.out.println("Información actual: " + libro);
        System.out.print("Introduzca el nuevo título (deje vacío para no cambiar): ");
        String nuevoTitulo = scanner.nextLine();
        if (!nuevoTitulo.isEmpty()) libro.setTitulo(nuevoTitulo);

        System.out.print("Introduzca el nuevo autor (deje vacío para no cambiar): ");
        String nuevoAutor = scanner.nextLine();
        if (!nuevoAutor.isEmpty()) libro.setAutor(nuevoAutor);

        System.out.print("Introduzca el nuevo año (0 para no cambiar): ");
        int nuevoAno = scanner.nextInt();
        if (nuevoAno != 0) libro.setAno(nuevoAno);

        System.out.print("Introduzca el nuevo número de páginas (0 para no cambiar): ");
        int nuevasPaginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        if (nuevasPaginas != 0) libro.setPaginas(nuevasPaginas);

        System.out.println("Libro actualizado con éxito.");
    }

    // Eliminar libro
    public void eliminarLibro() {
        System.out.print("Introduzca el ISBN del libro que desea eliminar: ");
        String isbn = scanner.nextLine();

        if (libros.remove(isbn) != null) {
            System.out.println("Libro eliminado con éxito.");
        } else {
            System.out.println("No se encontró un libro con ese ISBN.");
        }
    }
}
