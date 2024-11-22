package vista;

import java.util.Scanner;
import modelo.ListaPersonas;
import modelo.Persona;

public class VistaPersona {
    private Scanner scanner;

    public VistaPersona() {
        this.scanner = new Scanner(System.in);
    }

    public String solicitarRutaFichero() {
        System.out.print("Introduce el nombre del fichero en el escritorio: ");
        return System.getProperty("user.home") + "/Desktop/" + scanner.nextLine();
    }

    public void mostrarPersonas(ListaPersonas listaPersonas) {
        if (listaPersonas.estaVacia()) {
            System.out.println("No hay personas registradas.");
        } else {
            System.out.println(Persona.getCabecera());
            for (Persona persona : listaPersonas.getPersonas()) {
                System.out.println(persona.toFila());
            }
        }
    }

    public boolean confirmarSalida() {
        System.out.print("¿Está seguro de que desea salir? (S/N): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();
        return respuesta.equals("s");
    }

    public int mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Importar datos desde un fichero TSV.");
        System.out.println("2. Mostrar datos.");
        System.out.println("3. Salir.");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }
}
