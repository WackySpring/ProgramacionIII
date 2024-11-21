import java.util.Scanner;

import modelo.*;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    private static int menu() {
        System.out.println("|-------------------------------------------------------|");
        System.out.println("| MIS LIBROS                                            |");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("1) Nuevo almacen de libros");
        System.out.println("2) Establecer el ritmo de lectura (páginas por minuto)");
        System.out.println("3) Añadir libro al almacen");
        System.out.println("4) Mostrar información actual de los libros");
        System.out.println("5) Salir (se perderán los datos)");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("");
        System.out.print("Introduzca una opción (1-5): ");
        int opcion= scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        return opcion;
    }

    public static void main(String[] args) throws Exception {
        int opcion = menu();
        int ritmo = 1;
        Almacen almacen = null;
        Libro[] libros = null;
        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    almacen = CrearAlmacen();
                    libros = almacen.getLibros();
                    break;
                case 2:
                    ritmo = establecerRitmo();
                    break;
                case 3:
                    crearLibro(almacen);
                    break;
                case 4:
                    mostrarLibros(ritmo, libros);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            // Volver a mostrar el menú
            opcion = menu();
        }
        System.out.println("Saliendo...");
    }

    private static Almacen CrearAlmacen() {
        // Establecer el número de libros
        System.out.print("Introduzca el número de libros: ");
        int numeroLibros =  scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        Almacen almacen = new Almacen(numeroLibros);
        return almacen;
    }

    private static int establecerRitmo() {
        // Establecer el ritmo de lectura
        System.out.print("Introduzca el ritmo de lectura en páginas por minuto (1 por defecto): ");
        return scanner.nextInt();
    }

    private static void crearLibro(Almacen almacen) {
        // Crear un libro
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
        float precio = Float.parseFloat(scanner.nextLine());
        almacen.addLibro(new Libro(autor, titulo, ano, paginas, precio));
    }

    private static void mostrarLibros(int ritmo, Libro[] libros) {
        if (libros == null) {
            System.err.println("No hay libros en el almacen (presione Enter para continuar)");
            scanner.nextLine();
            return;
        }
        String lineaSeparacion = "|" + "-".repeat(150) + "|";
        int paginas = 0;
        float precioTotal = 0;

        System.out.println(lineaSeparacion);
        System.out.println("| LIBROS EN EL ALMACÉN "+ " ".repeat(128) +"|");
        System.out.println(lineaSeparacion);
        System.out.printf("| %-25s | %-15s | %-25s | %-15s | %-10s | %-22s | %-18s |%n", "Título", "Año Publicación", "Autor", "Premio Planeta", "Páginas", "Tiempo lectura minutos", "Precio");
        for (Libro libro : libros) {
            if (libro != null) {
                paginas += libro.getPaginas();
                precioTotal += libro.getPrecio();
                Autor autor = libro.getAutor();
                System.out.printf("| %-25s | %-15d | %-25s | %-15s | %-10d | %-22d | %-18.2f |%n", libro.getTitulo(), libro.getAno(), autor.getNombre() + " " + autor.getApellidos(), autor.isPremioPlaneta(), libro.getPaginas(), (libro.getPaginas() * ritmo), libro.getPrecio());
            }
        }
        System.out.println(lineaSeparacion);
        System.out.println("| Tiempo de lectura total el almacén: "+ " ".repeat(80) + (ritmo*paginas)+ " min  |" + " ".repeat(23)  +"|");
        System.out.println("| Precio total del almacén: "+ " ".repeat(90) + (precioTotal)+ " EUR |" + " ".repeat(23)  +"|");
        System.out.println(lineaSeparacion);
        System.out.println("");
        System.out.println("Presione Enter para continuar");
        scanner.nextLine();
    }

}
