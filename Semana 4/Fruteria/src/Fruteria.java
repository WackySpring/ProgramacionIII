import java.util.Scanner;

public class Fruteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el precio por kg de las manzanas (sin IVA): ");
        double precioManzanas = scanner.nextDouble();

        System.out.print("Introduce el precio por kg de las peras (sin IVA): ");
        double precioPeras = scanner.nextDouble();

        Producto manzanas = new Producto("Manzanas", precioManzanas);
        Producto peras = new Producto("Peras", precioPeras);

        int numeroCliente = 0;

        while (true) {
            numeroCliente++;

            System.out.println("\nCliente " + numeroCliente);
            System.out.print("Cantidad de manzanas (kg): ");
            double cantidadManzanas = scanner.nextDouble();

            System.out.print("Cantidad de peras (kg): ");
            double cantidadPeras = scanner.nextDouble();

            double totalManzanas = manzanas.calcularPrecioTotal(cantidadManzanas);
            double totalPeras = peras.calcularPrecioTotal(cantidadPeras);
            double totalFactura = totalManzanas + totalPeras;

            System.out.println("\n-----------------------------------------------");
            System.out.printf("| %-8s | %d |\n", "Cliente", numeroCliente);
            System.out.println("-----------------------------------------------");
            System.out.printf("| %-10s | %6.2f kg | Precio con IVA %6.2f $ | %6.2f $ |\n",
                manzanas.getNombre(), cantidadManzanas, manzanas.getPrecioConIVA(), totalManzanas);
            System.out.printf("| %-10s | %6.2f kg | Precio con IVA %6.2f $ | %6.2f $ |\n",
                peras.getNombre(), cantidadPeras, peras.getPrecioConIVA(), totalPeras);
            System.out.println("-----------------------------------------------");
            System.out.printf("| Total con IVA: %6.2f $|\n", totalFactura);
            System.out.println("-----------------------------------------------");

            System.out.print("¿Deseas atender a otro cliente? (s/n): ");
            String continuar = scanner.next().toLowerCase();

            if (!continuar.equals("s")) {
                System.out.println("Adios");
                break;
            }
        }

        scanner.close();
    }
}
