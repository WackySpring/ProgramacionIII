package modelo;

import java.util.Random;

public class Direccion {
    private String calle;
    private int numero;
    private int piso;
    private String letra;

    public Direccion(String calle, int numero, int piso, String letra) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.letra = letra;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getPiso() {
        return piso;
    }

    public String getLetra() {
        return letra;
    }

    public static Direccion factoryDireccion() {
        Random random = new Random();
        String[] calles = {"Calle Mayor", "Avenida Central", "Calle de la Paz", "Avenida del Sol", "Calle Luna"};
        String[] letras = {"A", "B", "C", "D", "E"};

        String calle = calles[random.nextInt(calles.length)];
        int numero = random.nextInt(100) + 1; // Número entre 1 y 100
        int piso = random.nextInt(10); // Piso entre 0 y 9
        String letra = letras[random.nextInt(letras.length)];

        return new Direccion(calle, numero, piso, letra);
    }

    @Override
    public String toString() {
        return String.format("%s, %d, Piso %d, %s", calle, numero, piso, letra);
    }
}
