package modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaDeClase {
    private List<DatosDeAlumno> alumnos;

    public ListaDeClase() {
        this.alumnos = new ArrayList<>();
        generarListaAleatoria();
    }

    public void generarListaAleatoria() {
        alumnos.clear();
        for (int i = 0; i < 20; i++) {
            DatosPersonales dp = DatosPersonales.factoryDatosPersonales();
            Direccion dir = Direccion.factoryDireccion();
            alumnos.add(new DatosDeAlumno(dp, dir));
        }
    }

    public List<DatosDeAlumno> getAlumnos() {
        return alumnos;
    }

    public void exportarDatosPersonalesCSV(String ruta) {
        try (java.io.PrintWriter writer = new java.io.PrintWriter(ruta)) {
            writer.println("Nombre,Apellidos,Edad,NIF");
            for (DatosDeAlumno alumno : alumnos) {
                DatosPersonales dp = alumno.getDatosPersonales();
                writer.printf("%s,%s,%d,%s%n", dp.getNombre(), dp.getApellidos(), dp.getEdad(), dp.getNif());
            }
            System.out.println("Datos personales exportados a " + ruta);
        } catch (Exception e) {
            System.err.println("Error al exportar datos personales: " + e.getMessage());
        }
    }

    public void exportarDireccionesCSV(String ruta) {
        try (java.io.PrintWriter writer = new java.io.PrintWriter(ruta)) {
            writer.println("Calle,Numero,Piso,Letra");
            for (DatosDeAlumno alumno : alumnos) {
                Direccion dir = alumno.getDireccion();
                writer.printf("%s,%d,%d,%s%n", dir.getCalle(), dir.getNumero(), dir.getPiso(), dir.getLetra());
            }
            System.out.println("Direcciones exportadas a " + ruta);
        } catch (Exception e) {
            System.err.println("Error al exportar direcciones: " + e.getMessage());
        }
    }
}
