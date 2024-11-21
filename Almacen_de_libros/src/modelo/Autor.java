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

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    public String isPremioPlaneta() {
        if(premioPlaneta){
            return "Sí";
        }
        return "No";
    }
}
