import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[5];

        System.out.println("Introduce 5 cadenas de texto:");
        for (int i = 0; i < strings.length; i++) {
            System.out.print("Cadena " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        System.out.println("\nCadenas antes de ordenar:");
        for (String s : strings) {
            System.out.println(s);
        }

        Arrays.sort(strings);
        System.out.println("\nCadenas ordenadas alfabeticamente:");
        for (String s : strings) {
            System.out.println(s);
        }

        scanner.close();
    }
}
