import java.util.Scanner; 

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        scanner.close();
    }
}
