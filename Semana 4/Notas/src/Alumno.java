public class Alumno {
    private String nombre;
    private double notaParcial1;
    private double notaParcial2;
    private double notaFinal;

    public Alumno(String nombre, double notaParcial1, double notaParcial2, double notaFinal) {
        this.nombre = nombre;
        this.notaParcial1 = notaParcial1;
        this.notaParcial2 = notaParcial2;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaParcial1() {
        return notaParcial1;
    }

    public double getNotaParcial2() {
        return notaParcial2;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public double calcularNotaFinal() {
        return (notaParcial1 * 0.10) + (notaParcial2 * 0.10) + (notaFinal * 0.80);
    }
}
