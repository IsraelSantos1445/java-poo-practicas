package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Persona {
    //Atributos
    public String nombre,rfc,curp,direccion,telefono;
    public int edad;
    //metodos 
    public void agregaRegistro(){
        nombre=JOptionPane.showInputDialog("Nombre: ");
        rfc=JOptionPane.showInputDialog("RFC: ");
        curp=JOptionPane.showInputDialog("CURP: ");
        direccion=JOptionPane.showInputDialog("Direccion: ");
        telefono=JOptionPane.showInputDialog("Telefono: ");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
    } 
    public void imprimeRegistro(){
        JOptionPane.showMessageDialog(null, "Datos de la persona: "+
                "\nNombre: "+nombre+
                "\nRFC: "+rfc+
                "\nCURP: "+curp+
                "\nDireccion: "+direccion+
                "\nTelefono: "+telefono+
                "\nEdad: "+edad);
    }
}
