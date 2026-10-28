package herenciaempleados;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaPersona {

    public static void main(String[] args) {
        Persona p = new Persona("Juan", 25);
        EmpleadoAdministrativo ea = new EmpleadoAdministrativo("Ana", 30, "Recursos Humanos");
        EmpleadoOperativo eo = new EmpleadoOperativo("Luis", 28, "Producción");

        p.mostrarDatos();
        ea.mostrarDatos();
        eo.mostrarDatos();
    }
}
