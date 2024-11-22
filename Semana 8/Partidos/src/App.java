import controlador.ControladorQuiniela;
import modelo.Quiniela;
import vista.VistaQuiniela;

public class App {
    public static void main(String[] args) {
        Quiniela quiniela = new Quiniela();
        VistaQuiniela vista = new VistaQuiniela();
        ControladorQuiniela controlador = new ControladorQuiniela(quiniela, vista);

        String rutaArchivo = System.getProperty("user.home") + "/Escritorio/equipos.txt";

        controlador.cargarPartidosDesdeArchivo(rutaArchivo);

        controlador.iniciar();
    }
}
