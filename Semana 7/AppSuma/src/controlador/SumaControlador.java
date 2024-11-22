package controlador;

import modelo.SumaModelo;
import vista.SumaVista;

public class SumaControlador {
    private SumaModelo modelo;
    private SumaVista vista;
    private int suma;

    public SumaControlador(SumaModelo modelo, SumaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.suma = 0;
    }

    public void iniciar() {
        String opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.leerOpcion();

            switch (opcion) {
                case "1":
                    int numero1 = vista.leerNumero("Ingrese el primer número: ");
                    int numero2 = vista.leerNumero("Ingrese el segundo número: ");
                    modelo.setNumeros(numero1, numero2);
                    vista.mostrarMensaje("Números leídos correctamente.");
                    break;

                case "2":
                    suma = modelo.calcularSuma();
                    vista.mostrarMensaje("Suma calculada.");
                    break;

                case "3":
                    vista.mostrarResultado(suma);
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
