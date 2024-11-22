import controlador.BibliotecaControlador;
import modelo.BibliotecaModelo;
import vista.BibliotecaVista;

public class AppBiblioteca {
    public static void main(String[] args) {
        BibliotecaModelo modelo = new BibliotecaModelo();
        BibliotecaVista vista = new BibliotecaVista();
        BibliotecaControlador controlador = new BibliotecaControlador(modelo, vista);

        controlador.iniciar();
    }
}
