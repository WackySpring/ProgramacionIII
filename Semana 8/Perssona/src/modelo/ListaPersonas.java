package modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {
    private List<Persona> personas;

    public ListaPersonas() {
        this.personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public boolean estaVacia() {
        return personas.isEmpty();
    }
}
