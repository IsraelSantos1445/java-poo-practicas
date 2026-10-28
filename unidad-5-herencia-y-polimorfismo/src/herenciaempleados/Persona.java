package herenciaempleados;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Persona {

String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + edad);
    
}
}
