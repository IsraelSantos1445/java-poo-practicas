package clasesabstractas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class EmpleadoPorHoras extends Empleado{
    int horasTrabajadas;
    double pagoPorHora;
    //Constructor de la clase EmpleadoPorHoras

    public EmpleadoPorHoras(int horasTrabajadas, double pagoPorHora, String nombre) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }
    @Override
    double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }
}
