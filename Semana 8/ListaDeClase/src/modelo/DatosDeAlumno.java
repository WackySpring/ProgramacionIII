package modelo;

public class DatosDeAlumno {
    private DatosPersonales datosPersonales;
    private Direccion direccion;

    public DatosDeAlumno(DatosPersonales datosPersonales, Direccion direccion) {
        this.datosPersonales = datosPersonales;
        this.direccion = direccion;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return String.format("%s | Dirección: %s", datosPersonales, direccion);
    }
}
