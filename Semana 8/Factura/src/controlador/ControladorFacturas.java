package controlador;

import java.util.List;
import modelo.ArchivoUtil;
import modelo.Factura;
import modelo.ListaFacturas;
import vista.VistaFacturas;

public class ControladorFacturas {
    private ListaFacturas listaFacturas;
    private VistaFacturas vista;

    public ControladorFacturas(ListaFacturas listaFacturas, VistaFacturas vista) {
        this.listaFacturas = listaFacturas;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.solicitarOpcion();
            procesarOpcion(opcion);
        } while (opcion != 5);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> listarFacturas();
            case 2 -> filtrarPorValorMinimo();
            case 3 -> exportarAHTML();
            case 4 -> exportarACSV();
            case 5 -> vista.mostrarMensaje("¡Hasta luego!");
            default -> vista.mostrarMensaje("Opción no válida.");
        }
    }

    private void listarFacturas() {
        vista.mostrarFacturas(listaFacturas.getFacturas());
    }

    private void filtrarPorValorMinimo() {
        double valorMinimo = vista.solicitarValorMinimo();
        List<Factura> facturasFiltradas = listaFacturas.filtrarPorValorMinimo(valorMinimo);
        vista.mostrarFacturas(facturasFiltradas);
    }

    private void exportarAHTML() {
        ArchivoUtil.exportarAHTML("facturas.html", listaFacturas.getFacturas());
        vista.mostrarMensaje("Facturas exportadas a facturas.html");
    }

    private void exportarACSV() {
        ArchivoUtil.exportarACSV("facturas.csv", listaFacturas.getFacturas());
        vista.mostrarMensaje("Facturas exportadas a facturas.csv");
    }
}
