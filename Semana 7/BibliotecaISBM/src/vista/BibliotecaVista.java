package vista;

import java.util.HashMap;
import java.util.Scanner;
import modelo.Libro;

public class BibliotecaVista {
    private Scanner scanner;

    public BibliotecaVista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\n1.- Agregar libro");
        System.out.println("2.- Buscar libro");
        System.out.println("3.- Actualizar libro");
        System.out.println("4.- Eliminar libro");
        System.out.println("5.- Listar todos los libros");
        System.out.println("q.- Salir");
        System.out.print("Seleccione una opción: ");
    }

    public Libro leerDatosLibro() {
        System.out.print("Ingrese el ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Ingrese el título: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el año de publicación: ");
        int anoPublicacion = scanner.nextInt();
        System.out.print("Ingrese el número de páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        return new Libro(isbn, titulo, autor, anoPublicacion, paginas);
    }

    public String leerISBN() {
        System.out.print("Ingrese el ISBN del libro: ");
        return scanner.nextLine();
    }

    public void mostrarLibro(Libro libro) {
        if (libro == null) {
            System.out.println("El libro no existe.");
        } else {
            System.out.println(libro.toString());
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void listarLibros(HashMap<String, Libro> libros) {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("\nLibros en la biblioteca:");
            for (Libro libro : libros.values()) {
                System.out.println(libro.toString());
            }
        }
    }

    public String leerOpcion() {
        return scanner.nextLine();
    }
}
