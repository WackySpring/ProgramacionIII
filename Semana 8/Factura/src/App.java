import controlador.ControladorFacturas;
import modelo.ArchivoUtil;
import modelo.ListaFacturas;
import vista.VistaFacturas;

public class App {
    public static void main(String[] args) {
        ListaFacturas listaFacturas = new ListaFacturas();
        VistaFacturas vista = new VistaFacturas();
        ControladorFacturas controlador = new ControladorFacturas(listaFacturas, vista);

        ArchivoUtil.cargarDesdeTSV("facturas.tsv", listaFacturas);

        controlador.iniciar();
    }
}
