import java.util.Scanner;
import modelo.ListaDeClase;

public class App {
    public static void main(String[] args) {
        ListaDeClase listaDeClase = new ListaDeClase();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Volver a crear la lista de alumnos");
            System.out.println("2. Mostrar tabla de alumnos");
            System.out.println("3. Exportar datos personales (CSV)");
            System.out.println("4. Exportar direcciones (CSV)");
            System.out.println("q. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    listaDeClase.generarListaAleatoria();
                    System.out.println("Lista de alumnos recreada.");
                    break;
                case "2":
                    System.out.println("Lista de Alumnos:");
                    for (var alumno : listaDeClase.getAlumnos()) {
                        System.out.println(alumno);
                    }
                    break;
                case "3":
                    listaDeClase.exportarDatosPersonalesCSV("datos_personales.csv");
                    break;
                case "4":
                    listaDeClase.exportarDireccionesCSV("direcciones.csv");
                    break;
                case "q":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        System.out.println("Programa finalizado.");
    }
}
