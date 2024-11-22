package modelo;

public class Autor {
    private String nombre;
    private String apellidos;
    private boolean premioPlaneta;

    public Autor(String nombre, String apellidos, boolean premioPlaneta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.premioPlaneta = premioPlaneta;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    public boolean isPremioPlaneta() {
        return premioPlaneta;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setPremioPlaneta(boolean premioPlaneta) {
        this.premioPlaneta = premioPlaneta;
    }

    @Override
    public String toString() {
        return getNombreCompleto() + " (Premio Planeta: " + (premioPlaneta ? "Sí" : "No") + ")";
    }
}
