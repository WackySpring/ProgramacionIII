import java.util.Scanner;
import modelo.*;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n|----------------------------|");
            System.out.println("|  GESTIÓN DE BIBLIOTECA     |");
            System.out.println("|----------------------------|");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Actualizar libro");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    biblioteca.agregarLibro();
                    break;
                case 2:
                    biblioteca.mostrarLibros();
                    break;
                case 3:
                    biblioteca.actualizarLibro();
                    break;
                case 4:
                    biblioteca.eliminarLibro();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}