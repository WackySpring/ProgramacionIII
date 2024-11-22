public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Error: Debes proporcionar el nombre, el peso y la altura como argumentos");
            return;
        }
        Usuario usuario = Usuario.crearDesdeArray(args);

        System.out.printf("%-15s %-10s %-10s %-10s%n", "Nombre", "Peso (kg)", "Altura (m)", "IMC");
        System.out.printf("%-15s %-10.2f %-10.2f %-10.2f%n", 
            usuario.getNombre(), 
            usuario.getPeso(), 
            usuario.getAltura(), 
            usuario.calcularIMC());
    }
}
