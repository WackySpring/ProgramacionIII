package modelo;

import java.io.*;
import java.util.List;

public class ArchivoUtil {

    public static void exportarAHTML(String archivo, List<Factura> facturas) {
        StringBuilder tabla = new StringBuilder();
        tabla.append("<table border='1'><tr><th>Concepto</th><th>Descuento</th><th>Fecha</th><th>Importe</th><th>NIF</th><th>Cliente</th><th>Dirección</th><th>IVA</th></tr>");
        for (Factura factura : facturas) {
            tabla.append("<tr><td>").append(factura.toString().replace("\t", "</td><td>")).append("</td></tr>");
        }
        tabla.append("</table>");

        String html = """
                <!DOCTYPE html>
                <html>
                <head><title>Facturas</title></head>
                <body>
                <h1>Listado de Facturas</h1>
                %%TABLA%%
                </body>
                </html>
                """.replace("%%TABLA%%", tabla);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            writer.write(html);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exportarACSV(String archivo, List<Factura> facturas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Factura factura : facturas) {
                writer.write(factura.toString().replace("\t", ",") + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cargarDesdeTSV(String archivo, ListaFacturas listaFacturas) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\t");
                if (datos.length == 8) {
                    String concepto = datos[0];
                    double descuento = Double.parseDouble(datos[1]);
                    String fecha = datos[2];
                    double importe = Double.parseDouble(datos[3]);
                    String nif = datos[4];
                    String cliente = datos[5];
                    String direccion = datos[6];
                    double iva = Double.parseDouble(datos[7]);

                    Factura factura = new Factura(concepto, descuento, fecha, importe, nif, cliente, direccion, iva);
                    listaFacturas.agregarFactura(factura);
                } else {
                    System.err.println("Línea mal formateada: " + linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + archivo);
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error en el formato numérico de algún dato.");
            e.printStackTrace();
        }
    }
}
