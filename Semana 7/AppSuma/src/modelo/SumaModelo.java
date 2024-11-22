package modelo;

public class SumaModelo {
    private int numero1;
    private int numero2;

    public void setNumeros(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int calcularSuma() {
        return numero1 + numero2;
    }
}
