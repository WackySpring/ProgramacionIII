import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person persona1 = new Person();
        Person persona2 = new Person();
        Person persona3 = new Person();

        System.out.println("Ingrese los datos de la segunda persona:");
        System.out.print("Nombre: ");
        persona2.setNombre(scanner.nextLine());
        System.out.print("Altura (en metros): ");
        persona2.setAltura(scanner.nextDouble());
        System.out.print("Peso (en kilogramos): ");
        persona2.setPeso(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("\nIngrese los datos de la tercera persona:");
        System.out.print("Nombre: ");
        persona3.setNombre(scanner.nextLine());
        System.out.print("Altura (en metros): ");
        persona3.setAltura(scanner.nextDouble());
        System.out.print("Peso (en kilogramos): ");
        persona3.setPeso(scanner.nextDouble());

        Person personaAlta = persona1;
        if (persona2.getAltura() > personaAlta.getAltura()) {
            personaAlta = persona2;
        }
        if (persona3.getAltura() > personaAlta.getAltura()) {
            personaAlta = persona3;
        }


        Person personaPesada = persona1;
        if (persona2.getPeso() > personaPesada.getPeso()) {
            personaPesada = persona2;
        }
        if (persona3.getPeso() > personaPesada.getPeso()) {
            personaPesada = persona3;
        }

        System.out.println("\nLa persona más alta es: " + personaAlta.getNombre() + " con una altura de " + personaAlta.getAltura() + " metros.");
        System.out.println("La persona que más pesa es: " + personaPesada.getNombre() + " con un peso de " + personaPesada.getPeso() + " kg.");

        scanner.close();
    }
}
