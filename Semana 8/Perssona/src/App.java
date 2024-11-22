import controlador.ControladorPersona;
import modelo.ListaPersonas;
import vista.VistaPersona;

public class App {
    public static void main(String[] args) {
        ListaPersonas listaPersonas = new ListaPersonas();
        VistaPersona vista = new VistaPersona();
        ControladorPersona controlador = new ControladorPersona(listaPersonas, vista);

        controlador.iniciar();
    }
}
