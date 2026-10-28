package practicas;

import java.util.Scanner;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("CURP: ");
        String curp = sc.nextLine();
        System.out.print("Sexo (H/M): ");
        char sexo = sc.next().charAt(0);
        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        Persona p1 = new Persona(nombre, edad, curp, sexo, peso, altura);

        System.out.println("\n--- Información de la Persona ---");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());
        System.out.println("CURP: " + p1.getCURP());
        System.out.println("Sexo: " + p1.getSexo());
        System.out.println("Peso: " + p1.getPeso());
        System.out.println("Altura: " + p1.getAltura());
    }
}
