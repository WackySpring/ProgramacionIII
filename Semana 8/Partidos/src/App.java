import controlador.ControladorQuiniela;
import modelo.Quiniela;
import vista.VistaQuiniela;

public class App {
    public static void main(String[] args) {
        // Crear los objetos principales de la aplicación
        Quiniela quiniela = new Quiniela();
        VistaQuiniela vista = new VistaQuiniela();
        ControladorQuiniela controlador = new ControladorQuiniela(quiniela, vista);

        // Ruta al archivo de equipos.txt (en la carpeta "datos" del escritorio del usuario)
        String rutaArchivo = System.getProperty("user.home") + "/Escritorio/equipos.txt";

        // Intentar cargar los partidos desde el archivo
        controlador.cargarPartidosDesdeArchivo(rutaArchivo);

        // Iniciar el programa interactivo
        controlador.iniciar();
    }
}
