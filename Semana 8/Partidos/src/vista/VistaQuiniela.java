package vista;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Partido;

public class VistaQuiniela {
    private Scanner scanner;

    public VistaQuiniela() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\n--- Quiniela ---");
        System.out.println("1. Mostrar partidos");
        System.out.println("2. Introducir resultados");
        System.out.println("3. Mostrar quiniela");
        System.out.println("4. Salir");
    }

    public int pedirOpcion() {
        System.out.print("Elige una opción: ");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarPartidos(ArrayList<Partido> partidos) {
        for (int i = 0; i < partidos.size(); i++) {
            System.out.println((i + 1) + ". " + partidos.get(i));
        }
    }

    public int pedirIndicePartido() {
        System.out.print("Introduce el número del partido: ");
        return scanner.nextInt() - 1;
    }

    public String pedirResultado() {
        System.out.print("Introduce el resultado (1, X, 2): ");
        return scanner.next();
    }
}
