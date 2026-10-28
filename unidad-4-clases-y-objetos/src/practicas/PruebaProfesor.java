package practicas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaProfesor {
    public static void main(String[] args) {
        // Usando constructor con parámetros
        Profesor p1 = new Profesor("Ana", "López", 40, true, true);

        // Usando constructor vacío
        Profesor p2 = new Profesor();

        System.out.println("--- Profesor 1 ---");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Apellidos: " + p1.getApellidos());
        System.out.println("Edad: " + p1.getEdad());
        System.out.println("Casado: " + p1.isCasado());
        System.out.println("Especialista: " + p1.isEspecialista());

        System.out.println("\n--- Profesor 2 ---");
        System.out.println("Nombre: " + p2.getNombre());
        System.out.println("Apellidos: " + p2.getApellidos());
        System.out.println("Edad: " + p2.getEdad());
        System.out.println("Casado: " + p2.isCasado());
        System.out.println("Especialista: " + p2.isEspecialista());
    }
}
