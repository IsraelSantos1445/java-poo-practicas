package practicas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Carlos", "Ramírez", 12345, true);
        System.out.println("Empleado: " + e1.getNombre() + " " + e1.getApellidos());
        System.out.println("Número: " + e1.getNumeroEmpleado());
        System.out.println("Estado civil: " + e1.isEstadoCivil());
    }
}
