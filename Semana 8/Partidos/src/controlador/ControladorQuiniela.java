package controlador;

import java.io.*;
import modelo.*;
import vista.*;

public class ControladorQuiniela {
    private Quiniela quiniela;
    private VistaQuiniela vista;

    public ControladorQuiniela(Quiniela quiniela, VistaQuiniela vista) {
        this.quiniela = quiniela;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.pedirOpcion();
            procesarOpcion(opcion);
        } while (opcion != 4);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                vista.mostrarPartidos(quiniela.getPartidos());
                break;
            case 2:
                introducirResultado();
                break;
            case 3:
                vista.mostrarPartidos(quiniela.getPartidos());
                break;
            case 4:
                vista.mostrarMensaje("¡Hasta luego!");
                break;
            default:
                vista.mostrarMensaje("Opción no válida.");
        }
    }

    private void introducirResultado() {
        vista.mostrarPartidos(quiniela.getPartidos());
        int indice = vista.pedirIndicePartido();
        if (indice >= 0 && indice < quiniela.getPartidos().size()) {
            String resultado = vista.pedirResultado();
            quiniela.getPartidos().get(indice).setResultado(resultado);
        } else {
            vista.mostrarMensaje("Índice no válido.");
        }
    }

    public void cargarPartidosDesdeArchivo(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] equipos = linea.split("-");
                Equipo local = new Equipo(equipos[0].trim());
                Equipo visitante = new Equipo(equipos[1].trim());
                quiniela.agregarPartido(new Partido(local, visitante));
            }
        } catch (IOException e) {
            vista.mostrarMensaje("Error al leer el archivo: " + e.getMessage());
        }
    }
}
