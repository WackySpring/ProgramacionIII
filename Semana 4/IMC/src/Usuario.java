public class Usuario {
    private String nombre;
    private double peso;
    private double altura;

    public Usuario(String nombre, double peso, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public static Usuario crearDesdeArray(String[] datos) {
        if (datos.length != 3) {
            System.err.println("Error: Debes proporcionar exactamente 3 argumentos: nombre, peso y altura.");
        }

        String nombre = datos[0];
        double peso = Double.parseDouble(datos[1]);
        double altura = Double.parseDouble(datos[2]);

        if (peso <= 0 || altura <= 0) {
            System.err.println("Error: Peso y altura deben ser mayores que cero.");
        }

        return new Usuario(nombre, peso, altura);
    }
}
