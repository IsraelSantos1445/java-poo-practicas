package clasesabstractas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaEmpleado {

    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleado1 =new EmpleadoTiempoCompleto(15000, "Ana");
        EmpleadoPorHoras empleado2 =new EmpleadoPorHoras(40, 120, "Carlos");
        empleado1.mostrarInfo();
        empleado2.mostrarInfo();
    }
}
