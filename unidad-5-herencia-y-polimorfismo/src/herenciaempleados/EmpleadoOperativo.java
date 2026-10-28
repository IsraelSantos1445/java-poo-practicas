package herenciaempleados;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class EmpleadoOperativo extends Persona{
    String area;

    public EmpleadoOperativo(String nombre, int edad, String area){
        super(nombre, edad);
        this.area = area;
    }

    @Override
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Empleado Operativo\nNombre: " + nombre + 
                "\nEdad: " + edad + "\nÁrea: " + area);
    }
}
