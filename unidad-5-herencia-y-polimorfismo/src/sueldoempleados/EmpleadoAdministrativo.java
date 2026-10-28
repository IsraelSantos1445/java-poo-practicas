package sueldoempleados;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class EmpleadoAdministrativo extends Empleado{
    String departamento;

    public EmpleadoAdministrativo(String nombre, int edad, double sueldoBase, String departamento){
        super(nombre, edad, sueldoBase);
        this.departamento = departamento;
    }

    @Override
    public void calculoSueldoNeto(){
        // Ejemplo: descuento del 10% por impuestos
        double sueldoNeto = sueldoBase * 0.9;
        JOptionPane.showMessageDialog(null, 
            "Empleado Administrativo\nNombre: " + nombre + 
            "\nEdad: " + edad + 
            "\nDepartamento: " + departamento + 
            "\nSueldo Neto: " + sueldoNeto);
    }
}
