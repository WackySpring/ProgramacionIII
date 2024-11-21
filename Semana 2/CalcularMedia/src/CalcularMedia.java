import com.coti.tools.Esdia;

public class CalcularMedia {
    public static void main(String[] args) {
        int N = 0;
        while (true) {
            N = Esdia.readInt("Introduce el numero de elementos: ");
            if (N <= 0) {
                System.err.println("El número debe ser mayor que cero");
            } else {
                break;  // Si N es válido, salimos del bucle
            }
        }

        double suma = 0.0;
        for (int i = 1; i <= N; i++) {
            double numero = 0.0;
            while (true) {
                numero = Esdia.readDouble("Introduce el numero flotante" + i + ": ");
                break;
            }
            suma += numero;
        }

        double media = suma / N;
        System.out.printf("La media aritmética es: %.2f%n", media);
    }
}
