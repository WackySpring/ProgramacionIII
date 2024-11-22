package controlador;

import modelo.BibliotecaModelo;
import modelo.Libro;
import vista.BibliotecaVista;

public class BibliotecaControlador {
    private BibliotecaModelo modelo;
    private BibliotecaVista vista;

    public BibliotecaControlador(BibliotecaModelo modelo, BibliotecaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        String opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.leerOpcion();

            switch (opcion) {
                case "1": // Agregar libro
                    Libro nuevoLibro = vista.leerDatosLibro();
                    if (modelo.agregarLibro(nuevoLibro)) {
                        vista.mostrarMensaje("Libro agregado exitosamente.");
                    } else {
                        vista.mostrarMensaje("El ISBN ya existe. No se puede agregar el libro.");
                    }
                    break;

                case "2": // Buscar libro
                    String isbnBuscar = vista.leerISBN();
                    vista.mostrarLibro(modelo.buscarLibro(isbnBuscar));
                    break;

                case "3": // Actualizar libro
                    String isbnActualizar = vista.leerISBN();
                    if (modelo.buscarLibro(isbnActualizar) != null) {
                        Libro libroActualizado = vista.leerDatosLibro();
                        if (modelo.actualizarLibro(isbnActualizar, libroActualizado)) {
                            vista.mostrarMensaje("Libro actualizado correctamente.");
                        }
                    } else {
                        vista.mostrarMensaje("El libro con el ISBN indicado no existe.");
                    }
                    break;

                case "4": // Eliminar libro
                    String isbnEliminar = vista.leerISBN();
                    if (modelo.eliminarLibro(isbnEliminar)) {
                        vista.mostrarMensaje("Libro eliminado correctamente.");
                    } else {
                        vista.mostrarMensaje("No se encontró el libro con ese ISBN.");
                    }
                    break;

                case "5": // Listar todos los libros
                    vista.listarLibros(modelo.obtenerTodosLosLibros());
                    break;

                case "q": // Salir
                    vista.mostrarMensaje("Saliendo del programa...");
                    break;

                default:
                    vista.mostrarMensaje("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        } while (!opcion.equalsIgnoreCase("q"));
    }
}
