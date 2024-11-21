import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu año de nacimiento: ");
        int añoNacimiento = scanner.nextInt();
        System.out.print("Introduce el año actual: ");
        int añoActual = scanner.nextInt();

        int edad = añoActual - añoNacimiento;
        System.out.printf("Tu edad es: %d años%n", edad); // Con println pondria solo el salto de linea

        scanner.close();
    }
}
