public class Person {
    private String nombre;
    private double altura;
    private double peso;

    public Person() {
        this.nombre = "Desconocido";
        this.altura = 0.0;
        this.peso = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getIMC() {
        if (altura <= 0 || peso <= 0) {
            System.err.println("La altura y el peso deben ser mayores que 0");
            return -1;
        }
        return peso / (altura * altura);
    }
}
