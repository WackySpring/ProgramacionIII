package controlador;

import modelo.AlmacenModelo;
import vista.AlmacenVista;

public class AlmacenControlador {
    private AlmacenModelo modelo;
    private AlmacenVista vista;
    private boolean datosCargados;

    public AlmacenControlador(AlmacenModelo modelo, AlmacenVista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.datosCargados = false;
    }

    public void iniciar() {
        String opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.leerOpcion();

            switch (opcion) {
                case "1":
                    modelo.setVentas(vista.leerVentas());
                    datosCargados = true;
                    vista.mostrarMensaje("Ventas registradas.");
                    break;

                case "2":
                    modelo.setPrecios(vista.leerPrecios());
                    vista.mostrarMensaje("Precios registrados.");
                    break;

                case "3":
                    if (!datosCargados) {
                        vista.mostrarMensaje("Primero debe cargar las ventas.");
                    } else {
                        double ingresos = modelo.calcularIngresos();
                        vista.mostrarMensaje("Ingresos calculados: " + ingresos);
                    }
                    break;

                case "4":
                    if (!datosCargados) {
                        vista.mostrarMensaje("Primero debe cargar las ventas.");
                    } else {
                        vista.mostrarResultados(modelo.getVentas(), modelo.getPrecios(), modelo.calcularIngresos());
                    }
                    break;

                case "q":
                    vista.mostrarMensaje("Saliendo del programa...");
                    break;

                default:
                    vista.mostrarMensaje("Opción no válida.");
                    break;
            }
        } while (!opcion.equals("q"));
    }
}
