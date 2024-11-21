import java.io.Console;

public class CalcularEdadConConsole {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("Consola no disponible");
            return;
        }

        String añoNacimientoStr = console.readLine("Introduce tu año de nacimiento: ");
        String añoActualStr = console.readLine("Introduce el año actual: ");

        int añoNacimiento = Integer.parseInt(añoNacimientoStr);
        int añoActual = Integer.parseInt(añoActualStr);

        int edad = añoActual - añoNacimiento;

        System.out.printf("Tu edad es: %d años%n", edad);
    }
}
