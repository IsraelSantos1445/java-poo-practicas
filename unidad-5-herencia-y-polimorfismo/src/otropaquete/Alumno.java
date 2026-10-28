package otropaquete;

import herencia.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Alumno extends Persona {

    String ncontrol, semestre, carrera;

    @Override
    public void imprimeRegistro() {
        JOptionPane.showMessageDialog(null, "Datos del alumno: "
                + "\nNombre: " + nombre
                + "\nNumero de control: " + ncontrol
                + "\nCarrera: " + carrera
                + "\nSemestre: " + semestre
                + "\nTelefono: " + telefono
                + "\nEdad: " + edad);
    }

}
