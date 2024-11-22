import controlador.SumaControlador;
import modelo.SumaModelo;
import vista.SumaVista;

public class AppSuma {
    public static void main(String[] args) {
        SumaModelo modelo = new SumaModelo();
        SumaVista vista = new SumaVista();
        SumaControlador controlador = new SumaControlador(modelo, vista);
        controlador.iniciar();
    }
}
