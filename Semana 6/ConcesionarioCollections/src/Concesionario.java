import java.util.ArrayList;
import java.util.Scanner;

class Coche {
    String marca;
    String modelo;
    int anio;
    double precio;

    public Coche(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio + ", Precio: $" + precio;
    }
}

public class Concesionario {
    public static void main(String[] args) {
        ArrayList<Coche> stock = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú del Concesionario ---");
            System.out.println("1. Agregar coche");
            System.out.println("2. Mostrar coches");
            System.out.println("3. Actualizar coche");
            System.out.println("4. Eliminar coche");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese marca: ");
                    String marca = scanner.next();
                    System.out.print("Ingrese modelo: ");
                    String modelo = scanner.next();
                    System.out.print("Ingrese año: ");
                    int anio = scanner.nextInt();
                    System.out.print("Ingrese precio: ");
                    double precio = scanner.nextDouble();
                    stock.add(new Coche(marca, modelo, anio, precio));
                    System.out.println("Coche agregado exitosamente.");
                    break;

                case 2:
                    System.out.println("\n--- Lista de coches ---");
                    for (int i = 0; i < stock.size(); i++) {
                        System.out.println((i + 1) + ". " + stock.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el número del coche a actualizar: ");
                    int indexActualizar = scanner.nextInt() - 1;
                    if (indexActualizar >= 0 && indexActualizar < stock.size()) {
                        System.out.print("Nueva marca: ");
                        stock.get(indexActualizar).marca = scanner.next();
                        System.out.print("Nuevo modelo: ");
                        stock.get(indexActualizar).modelo = scanner.next();
                        System.out.print("Nuevo año: ");
                        stock.get(indexActualizar).anio = scanner.nextInt();
                        System.out.print("Nuevo precio: ");
                        stock.get(indexActualizar).precio = scanner.nextDouble();
                        System.out.println("Coche actualizado exitosamente.");
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el número del coche a eliminar: ");
                    int indexEliminar = scanner.nextInt() - 1;
                    if (indexEliminar >= 0 && indexEliminar < stock.size()) {
                        stock.remove(indexEliminar);
                        System.out.println("Coche eliminado exitosamente.");
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
