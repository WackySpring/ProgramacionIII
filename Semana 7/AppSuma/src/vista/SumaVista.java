package vista;

import java.util.Scanner;

public class SumaVista {
    private Scanner scanner;

    public SumaVista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\n1.- Leer los números");
        System.out.println("2.- Calcular la suma");
        System.out.println("3.- Mostrar el resultado");
        System.out.println("q.- Salir");
        System.out.print("Seleccione una opción: ");
    }

    public int leerNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public void mostrarResultado(int resultado) {
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public String leerOpcion() {
        return scanner.next();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
