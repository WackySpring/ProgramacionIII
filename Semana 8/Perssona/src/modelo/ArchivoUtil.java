package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoUtil {
    public static void cargarDesdeTSV(String ruta, ListaPersonas listaPersonas) {
        File archivo = new File(ruta);
        if (!archivo.exists()) {
            System.out.println("Archivo no encontrado: " + ruta);
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\t");
                if (datos.length == 3) {
                    String nombre = datos[0];
                    String telefono = datos[1];
                    double peso = Double.parseDouble(datos[2]);
                    listaPersonas.agregarPersona(new Persona(nombre, telefono, peso));
                } else {
                    System.out.println("Línea mal formateada: " + linea);
                }
            }
            System.out.println("Datos cargados desde: " + ruta);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al cargar datos: " + e.getMessage());
        }
    }
}
