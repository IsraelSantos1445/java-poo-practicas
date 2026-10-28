package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Alumno extends Persona{
    String nombre,ncontrol,semestre,carrera;
    
    @Override
    public void imprimeRegistro(){
        JOptionPane.showMessageDialog(null, "Datos del alumno: "+
                "\nNombre alumno: "+nombre+
                "\nNombre Persona: "+super.nombre+
                "\nNumero de control: "+ncontrol+
                "\nCarrera: "+carrera+
                "\nSemestre: "+semestre+
                "\nTelefono: "+telefono+
                "\nEdad: "+edad);
        super.imprimeRegistro();
    }
}
