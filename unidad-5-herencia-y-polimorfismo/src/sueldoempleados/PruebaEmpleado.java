package sueldoempleados;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaEmpleado {

    public static void main(String[] args) {
        EmpleadoAdministrativo ea = new EmpleadoAdministrativo("Ana", 30, 10000, "Recursos Humanos");
        ea.calculoSueldoNeto();
    }
}
