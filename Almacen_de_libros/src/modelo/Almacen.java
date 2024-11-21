package modelo;

import java.util.Scanner;

public class Almacen {
    private int numeroLibros = 10;
    private Libro[] libros = new Libro[numeroLibros];

    public Almacen(int numeroLibros) {
        this.numeroLibros = numeroLibros;
        libros = new Libro[numeroLibros];
    }

    public void addLibro(Libro libro) {
        boolean añadido = false;
        for (int i = 0; i < numeroLibros; i++) {
            if (libros[i] == null) {
                libros[i] = libro;
                añadido = true;
                break;
            }
        }
        if (!añadido) {
            Scanner scan = new Scanner(System.in);
            System.err.println("El almacen está lleno (presiona Enter para continuar)");
            scan.nextLine();
        }
    }

    public int getNumeroLibros() {
        return numeroLibros;
    }

    public Libro[] getLibros() {
        return libros;
    }
}