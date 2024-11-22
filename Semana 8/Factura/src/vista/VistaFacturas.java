package vista;

import java.util.List;
import java.util.Scanner;
import modelo.Factura;

public class VistaFacturas {
    private Scanner scanner;

    public VistaFacturas() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\n--- Menú Facturas ---");
        System.out.println("1. Listar todas las facturas");
        System.out.println("2. Filtrar por valor mínimo");
        System.out.println("3. Exportar a HTML");
        System.out.println("4. Exportar a CSV");
        System.out.println("5. Salir");
    }

    public int solicitarOpcion() {
        System.out.print("Elige una opción: ");
        return scanner.nextInt();
    }

    public double solicitarValorMinimo() {
        System.out.print("Introduce el valor mínimo: ");
        return scanner.nextDouble();
    }

    public void mostrarFacturas(List<Factura> facturas) {
        for (Factura factura : facturas) {
            System.out.println(factura);
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
