package modelo;

public class Factura {
    private String concepto;
    private double descuento;
    private String fecha;
    private double importe;
    private String nif;
    private String cliente;
    private String direccion;
    private double iva;

    public Factura(String concepto, double descuento, String fecha, double importe, String nif, String cliente, String direccion, double iva) {
        this.concepto = concepto;
        this.descuento = descuento;
        this.fecha = fecha;
        this.importe = importe;
        this.nif = nif;
        this.cliente = cliente;
        this.direccion = direccion;
        this.iva = iva;
    }

    public double calcularValorFinal() {
        return importe * (1 - descuento) * (1 + iva);
    }

    public String getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return concepto + "\t" + descuento + "\t" + fecha + "\t" + importe + "\t" + nif + "\t" + cliente + "\t" + direccion + "\t" + iva;
    }
}
