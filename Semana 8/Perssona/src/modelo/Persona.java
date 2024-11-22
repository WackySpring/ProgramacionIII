package modelo;

public class Persona {
    private String nombre;
    private String telefono;
    private double peso;

    public Persona(String nombre, String telefono, double peso) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getPeso() {
        return peso;
    }

    public static String getCabecera() {
        return String.format("%-20s %-15s %-10s", "Nombre", "Teléfono", "Peso");
    }

    public String toFila() {
        return String.format("%-20s %-15s %-10.2f", nombre, telefono, peso);
    }
}
