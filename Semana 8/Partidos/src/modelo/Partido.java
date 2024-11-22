package modelo;

public class Partido {
    private Equipo local;
    private Equipo visitante;
    private String resultado;

    public Partido(Equipo local, Equipo visitante) {
        this.local = local;
        this.visitante = visitante;
        this.resultado = "Pendiente"; // Resultado por defecto
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return local + " vs " + visitante + " - Resultado: " + resultado;
    }
}