package clasesabstractas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class EmpleadoTiempoCompleto extends Empleado {

    double salariomensual;
//Constructor de la clase EmpleadoTiempoCompleto
    public EmpleadoTiempoCompleto(double salariomensual, String nombre) {
        super(nombre);
        this.salariomensual = salariomensual;
    }
//Metodo calcularSalario sobreescrito
    @Override
    double calcularSalario() {
        return salariomensual;
    }

}
