import controlador.AlmacenControlador;
import modelo.AlmacenModelo;
import vista.AlmacenVista;

public class AppAlmacen {
    public static void main(String[] args) {
        AlmacenModelo modelo = new AlmacenModelo();
        AlmacenVista vista = new AlmacenVista();
        AlmacenControlador controlador = new AlmacenControlador(modelo, vista);
        controlador.iniciar();
    }
}
