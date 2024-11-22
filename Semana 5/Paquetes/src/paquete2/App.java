package paquete2;

import paquete1.Clase1;
// import paquete1.Clase2; // No se puede importar Clase2 porque no es pública

public class App {
    public static void main(String[] args) {
        // Crear un objeto de Clase1
        Clase1 obj1 = new Clase1();

        // Acceso a los atributos
        System.out.println("Atributo público: " + obj1.atributoPublico); // Accesible
        // System.out.println("Atributo default: " + obj1.atributoDefault); // No accesible
        // System.out.println("Atributo protegido: " + obj1.atributoProtegido); // No accesible
        // System.out.println("Atributo privado: " + obj1.atributoPrivado); // No accesible

        // Acceso a los métodos
        obj1.metodoPublico(); // Accesible
        // obj1.metodoDefault(); // No accesible
        // obj1.metodoProtegido(); // No accesible
        // obj1.metodoPrivado(); // No accesible

        // Clase2 no puede ser importada porque no es pública
        // Clase2 obj2 = new Clase2(); // Esto generará un error
    }
}
