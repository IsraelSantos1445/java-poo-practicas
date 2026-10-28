package herenciaempleados;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class EmpleadoAdministrativo extends Persona{
    String departamento;

    public EmpleadoAdministrativo(String nombre, int edad, String departamento){
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Empleado Administrativo\nNombre: " + nombre + 
                "\nEdad: " + edad + "\nDepartamento: " + departamento);
    }
}
