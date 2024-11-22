package modelo;

import java.util.ArrayList;

public class Quiniela {
    private ArrayList<Partido> partidos;

    public Quiniela() {
        partidos = new ArrayList<>();
    }

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }
}
