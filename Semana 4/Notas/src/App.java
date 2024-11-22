import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de alumnos en el curso: ");
        int numeroAlumnos = scanner.nextInt();
        scanner.nextLine();

        Alumno[] alumnos = new Alumno[numeroAlumnos];

        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.println("\nAlumno " + (i + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Nota del Parcial 1: ");
            double notaParcial1 = scanner.nextDouble();

            System.out.print("Nota del Parcial 2: ");
            double notaParcial2 = scanner.nextDouble();

            System.out.print("Nota del Examen Final: ");
            double notaFinal = scanner.nextDouble();
            scanner.nextLine();

            alumnos[i] = new Alumno(nombre, notaParcial1, notaParcial2, notaFinal);
        }

        System.out.println("\n-----------------------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s%n", "Nombre", "Parcial 1", "Parcial 2", "Final", "Nota Final");
        System.out.println("-----------------------------------------------");

        double sumaParcial1 = 0;
        double sumaParcial2 = 0;
        double sumaFinal = 0;
        double sumaNotaFinal = 0;

        for (Alumno alumno : alumnos) {
            double notaFinalAlumno = alumno.calcularNotaFinal();
            sumaParcial1 += alumno.getNotaParcial1();
            sumaParcial2 += alumno.getNotaParcial2();
            sumaFinal += alumno.getNotaFinal();
            sumaNotaFinal += notaFinalAlumno;

            System.out.printf("%-15s %-10.2f %-10.2f %-10.2f %-10.2f%n",
                    alumno.getNombre(),
                    alumno.getNotaParcial1(),
                    alumno.getNotaParcial2(),
                    alumno.getNotaFinal(),
                    notaFinalAlumno);
        }

        System.out.println("-----------------------------------------------");

        double mediaParcial1 = sumaParcial1 / numeroAlumnos;
        double mediaParcial2 = sumaParcial2 / numeroAlumnos;
        double mediaFinal = sumaFinal / numeroAlumnos;
        double mediaNotaFinal = sumaNotaFinal / numeroAlumnos;
        System.out.printf("Media Parcial 1: %.2f%n", mediaParcial1);
        System.out.printf("Media Parcial 2: %.2f%n", mediaParcial2);
        System.out.printf("Media Examen Final: %.2f%n", mediaFinal);
        System.out.printf("Media Nota Final: %.2f%n", mediaNotaFinal);

        scanner.close();
    }
}
