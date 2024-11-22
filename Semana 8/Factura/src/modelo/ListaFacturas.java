package modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaFacturas {
    private List<Factura> facturas;

    public ListaFacturas() {
        facturas = new ArrayList<>();
    }

    public void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public List<Factura> filtrarPorValorMinimo(double valorMinimo) {
        List<Factura> resultado = new ArrayList<>();
        for (Factura factura : facturas) {
            if (factura.calcularValorFinal() > valorMinimo) {
                resultado.add(factura);
            }
        }
        return resultado;
    }
}
