package paquete1;
public class Clase1 {
    public int atributoPublico = 1;
    int atributoDefault = 2;
    protected int atributoProtegido = 3;
    private int atributoPrivado = 4;

    public void metodoPublico() {
        System.out.println("Método público en Clase1");
    }

    void metodoDefault() {
        System.out.println("Método default en Clase1");
    }

    protected void metodoProtegido() {
        System.out.println("Método protegido en Clase1");
    }

    private void metodoPrivado() {
        System.out.println("Método privado en Clase1");
    }
}
