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

public class ConcesionarioArray {
    public static void main(String[] args) {
        Coche[] stock = new Coche[100];
        int contador = 0;
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
                    if (contador < stock.length) {
                        System.out.print("Ingrese marca: ");
                        String marca = scanner.next();
                        System.out.print("Ingrese modelo: ");
                        String modelo = scanner.next();
                        System.out.print("Ingrese año: ");
                        int anio = scanner.nextInt();
                        System.out.print("Ingrese precio: ");
                        double precio = scanner.nextDouble();
                        stock[contador] = new Coche(marca, modelo, anio, precio);
                        contador++;
                        System.out.println("Coche agregado exitosamente.");
                    } else {
                        System.out.println("No hay espacio en el stock.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Lista de coches ---");
                    for (int i = 0; i < contador; i++) {
                        System.out.println((i + 1) + ". " + stock[i]);
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el número del coche a actualizar: ");
                    int indexActualizar = scanner.nextInt() - 1;
                    if (indexActualizar >= 0 && indexActualizar < contador) {
                        System.out.print("Nueva marca: ");
                        stock[indexActualizar].marca = scanner.next();
                        System.out.print("Nuevo modelo: ");
                        stock[indexActualizar].modelo = scanner.next();
                        System.out.print("Nuevo año: ");
                        stock[indexActualizar].anio = scanner.nextInt();
                        System.out.print("Nuevo precio: ");
                        stock[indexActualizar].precio = scanner.nextDouble();
                        System.out.println("Coche actualizado exitosamente.");
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el número del coche a eliminar: ");
                    int indexEliminar = scanner.nextInt() - 1;
                    if (indexEliminar >= 0 && indexEliminar < contador) {
                        for (int i = indexEliminar; i < contador - 1; i++) {
                            stock[i] = stock[i + 1];
                        }
                        contador--;
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
