package practicas;

import java.util.Scanner;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        System.out.print("Número de control: ");
        int numeroControl = sc.nextInt();
        sc.nextLine();
        System.out.print("Carrera: ");
        String carrera = sc.nextLine();
        System.out.print("Semestre: ");
        int semestre = sc.nextInt();

        Alumno a1 = new Alumno(nombre, direccion, numeroControl, carrera, semestre);

        System.out.println("\n--- Información del Alumno ---");
        System.out.println("Nombre: " + a1.getNombre());
        System.out.println("Dirección: " + a1.getDireccion());
        System.out.println("Número de control: " + a1.getNumeroControl());
        System.out.println("Carrera: " + a1.getCarrera());
        System.out.println("Semestre: " + a1.getSemestre());
    }
}
