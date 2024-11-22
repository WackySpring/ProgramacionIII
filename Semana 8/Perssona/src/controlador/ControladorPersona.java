package controlador;

import modelo.ArchivoUtil;
import modelo.ListaPersonas;
import vista.VistaPersona;

public class ControladorPersona {
    private ListaPersonas listaPersonas;
    private VistaPersona vista;

    public ControladorPersona(ListaPersonas listaPersonas, VistaPersona vista) {
        this.listaPersonas = listaPersonas;
        this.vista = vista;
    }

    public void iniciar() {
        ArchivoUtil.cargarDesdeTSV("datos.txt", listaPersonas);

        boolean continuar = true;

        while (continuar) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    String ruta = vista.solicitarRutaFichero();
                    ArchivoUtil.cargarDesdeTSV(ruta, listaPersonas);
                    break;
                case 2:
                    vista.mostrarPersonas(listaPersonas);
                    break;
                case 3:
                    continuar = !vista.confirmarSalida();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
