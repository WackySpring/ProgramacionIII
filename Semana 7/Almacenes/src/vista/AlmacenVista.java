package vista;

import java.util.Scanner;

public class AlmacenVista {
    private Scanner scanner;

    public AlmacenVista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\n1.- Leer tabla de ventas");
        System.out.println("2.- Leer tabla de precios");
        System.out.println("3.- Calcular ingresos totales");
        System.out.println("4.- Mostrar resultados");
        System.out.println("q.- Salir");
        System.out.print("Seleccione una opción: ");
    }

    public int[][] leerVentas() {
        int[][] ventas = new int[5][2];
        for (int i = 0; i < 5; i++) {
            System.out.println("Almacén " + (i + 1));
            for (int j = 0; j < 2; j++) {
                System.out.print("Ingrese las ventas del producto " + (j + 1) + ": ");
                ventas[i][j] = scanner.nextInt();
            }
        }
        return ventas;
    }

    public double[] leerPrecios() {
        double[] precios = new double[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }
        return precios;
    }

    public void mostrarResultados(int[][] ventas, double[] precios, double ingresosTotales) {
        System.out.println("Ventas por almacén:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Almacén " + (i + 1) + ": Producto 1: " + ventas[i][0] + ", Producto 2: " + ventas[i][1]);
        }
        System.out.println("Precios: Producto 1: " + precios[0] + ", Producto 2: " + precios[1]);
        System.out.println("Ingresos Totales: " + ingresosTotales);
    }

    public String leerOpcion() {
        return scanner.next();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
