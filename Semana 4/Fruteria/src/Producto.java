public class Producto {
    private String nombre;
    private double precioSinIVA;
    private static final double IVA = 0.21;

    public Producto(String nombre, double precioSinIVA) {
        this.nombre = nombre;
        this.precioSinIVA = precioSinIVA;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioConIVA() {
        return precioSinIVA * (1 + IVA);
    }

    public double calcularPrecioTotal(double cantidadKg) {
        return getPrecioConIVA() * cantidadKg;
    }
}
