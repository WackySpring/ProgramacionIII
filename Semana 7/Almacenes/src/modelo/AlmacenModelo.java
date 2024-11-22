package modelo;

public class AlmacenModelo {
    private int[][] ventas; // 5 almacenes x 2 productos
    private double[] precios; // Precios de los dos productos

    public AlmacenModelo() {
        ventas = new int[5][2];
        precios = new double[2];
    }

    public void setVentas(int[][] ventas) {
        this.ventas = ventas;
    }

    public void setPrecios(double[] precios) {
        this.precios = precios;
    }

    public double calcularIngresos() {
        double ingresosTotales = 0;
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                ingresosTotales += ventas[i][j] * precios[j];
            }
        }
        return ingresosTotales;
    }

    public int[][] getVentas() {
        return ventas;
    }

    public double[] getPrecios() {
        return precios;
    }
}
