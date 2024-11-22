import modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    private static int menu() {
        System.out.println("|-------------------------------------------------------|");
        System.out.println("| MIS LIBROS                                            |");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("1) Crear nuevo almacen de libros");
        System.out.println("2) Establecer el ritmo de lectura (páginas por minuto)");
        System.out.println("3) Añadir libro al almacen");
        System.out.println("4) Mostrar información actual de los libros");
        System.out.println("5) Actualizar información de un libro");
        System.out.println("6) Eliminar un libro del almacen");
        System.out.println("7) Salir");
        System.out.println("|-------------------------------------------------------|");
        System.out.print("Introduzca una opción (1-7): ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        return opcion;
    }

    public static void main(String[] args) throws Exception {
        int opcion = menu();
        int ritmo = 1;
        Almacen almacen = null;

        while (opcion != 7) {
            switch (opcion) {
                case 1:
                    almacen = new Almacen();
                    System.out.println("Nuevo almacen creado.");
                    break;
                case 2:
                    ritmo = establecerRitmo();
                    break;
                case 3:
                    crearLibro(almacen);
                    break;
                case 4:
                    mostrarLibros(ritmo, almacen);
                    break;
                case 5:
                    actualizarLibro(almacen);
                    break;
                case 6:
                    eliminarLibro(almacen);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            opcion = menu();
        }
        System.out.println("Saliendo...");
    }

    private static int establecerRitmo() {
        System.out.print("Introduzca el ritmo de lectura en páginas por minuto (1 por defecto): ");
        return scanner.nextInt();
    }

    private static void crearLibro(Almacen almacen) {
        if (almacen == null) {
            System.err.println("Primero debe crear un almacen de libros (presione Enter para continuar)");
            scanner.nextLine();
            return;
        }
        System.out.print("Introduzca el nombre del autor: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduzca los apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("¿Ha ganado el premio Planeta? (true/false): ");
        boolean planeta = scanner.nextBoolean();
        scanner.nextLine(); // Limpiar el buffer
        Autor autor = new Autor(nombre, apellidos, planeta);
        System.out.print("Introduzca el título: ");
        String titulo = scanner.nextLine();
        System.out.print("Introduzca el año de lanzamiento: ");
        int ano = scanner.nextInt();
        System.out.print("Introduzca el número de paginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Introduzca el precio: ");
        float precio = scanner.nextFloat();
        almacen.addLibro(new Libro(autor, titulo, ano, paginas, precio));
    }

    private static void mostrarLibros(int ritmo, Almacen almacen) {
        if (almacen == null || almacen.getLibros().isEmpty()) {
            System.err.println("No hay libros en el almacen (presione Enter para continuar)");
            scanner.nextLine();
            return;
        }

        String lineaSeparacion = "|" + "-".repeat(150) + "|";
        int paginasTotales = 0;
        float precioTotal = 0;

        System.out.println(lineaSeparacion);
        System.out.println("| LIBROS EN EL ALMACÉN " + " ".repeat(128) + "|");
        System.out.println(lineaSeparacion);
        System.out.printf("| %-25s | %-15s | %-25s | %-15s | %-10s | %-22s | %-18s |%n", "Título", "Año Publicación", "Autor", "Premio Planeta", "Páginas", "Tiempo lectura minutos", "Precio");

        for (Libro libro : almacen.getLibros()) {
            paginasTotales += libro.getPaginas();
            precioTotal += libro.getPrecio();
            Autor autor = libro.getAutor();
            System.out.printf("| %-25s | %-15d | %-25s | %-15s | %-10d | %-22d | %-18.2f |%n", libro.getTitulo(), libro.getAno(), autor.getNombreCompleto(), autor.isPremioPlaneta(), libro.getPaginas(), libro.getPaginas() * ritmo, libro.getPrecio());
        }

        System.out.println(lineaSeparacion);
        System.out.printf("| Total de páginas: %-10d | Tiempo total lectura: %-10d min | Precio total: %.2f EUR |%n", paginasTotales, ritmo * paginasTotales, precioTotal);
        System.out.println(lineaSeparacion);
    }

    private static void actualizarLibro(Almacen almacen) {
        if (almacen == null || almacen.getLibros().isEmpty()) {
            System.err.println("No hay libros para actualizar.");
            return;
        }

        System.out.print("Introduzca el título del libro que desea actualizar: ");
        String titulo = scanner.nextLine();
        Libro libro = almacen.buscarLibro(titulo);

        if (libro == null) {
            System.err.println("Libro no encontrado.");
            return;
        }

        System.out.print("Introduzca el nuevo título (deje vacío para no cambiar): ");
        String nuevoTitulo = scanner.nextLine();
        if (!nuevoTitulo.isEmpty()) libro.setTitulo(nuevoTitulo);

        System.out.print("Introduzca el nuevo precio (deje vacío para no cambiar): ");
        String nuevoPrecio = scanner.nextLine();
        if (!nuevoPrecio.isEmpty()) libro.setPrecio(Float.parseFloat(nuevoPrecio));

        System.out.println("Libro actualizado con éxito.");
    }

    private static void eliminarLibro(Almacen almacen) {
        if (almacen == null || almacen.getLibros().isEmpty()) {
            System.err.println("No hay libros para eliminar.");
            return;
        }

        System.out.print("Introduzca el título del libro que desea eliminar: ");
        String titulo = scanner.nextLine();

        if (almacen.eliminarLibro(titulo)) {
            System.out.println("Libro eliminado con éxito.");
        } else {
            System.err.println("Libro no encontrado.");
        }
    }
}
