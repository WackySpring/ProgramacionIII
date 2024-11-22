package modelo;

import java.util.Random;

public class DatosPersonales {
    private String nombre;
    private String apellidos;
    private int edad;
    private String nif;

    public DatosPersonales(String nombre, String apellidos, int edad, String nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getNif() {
        return nif;
    }

    public static DatosPersonales factoryDatosPersonales() {
        Random random = new Random();
        String[] nombres = {"Juan", "Marta", "Luis", "Ana", "Pedro"};
        String[] apellidos = {"Pérez", "López", "García", "Torres", "Sánchez"};

        String nombre = nombres[random.nextInt(nombres.length)];
        String apellido = apellidos[random.nextInt(apellidos.length)];
        int edad = random.nextInt(50) + 18; // Edad entre 18 y 67
        String nif = "NIF" + (random.nextInt(900000) + 100000); // Genera un NIF único

        return new DatosPersonales(nombre, apellido, edad, nif);
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d años, NIF: %s", nombre, apellidos, edad, nif);
    }
}
