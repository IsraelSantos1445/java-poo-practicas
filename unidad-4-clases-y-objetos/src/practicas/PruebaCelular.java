package practicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaCelular {

    public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog("Ingrese la marca:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo:");
        float display = Float.parseFloat(JOptionPane.showInputDialog("Ingrese tamaño del display (pulgadas):"));
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese capacidad (GB):"));
        String color = JOptionPane.showInputDialog("Ingrese el color:");

        Celular cel1 = new Celular(marca, modelo, display, capacidad, color);

        JOptionPane.showMessageDialog(null,
            "Celular:\nMarca: " + cel1.getMarca() +
            "\nModelo: " + cel1.getModelo() +
            "\nDisplay: " + cel1.getTamanoDisplay() + " pulgadas" +
            "\nCapacidad: " + cel1.getCapacidad() + " GB" +
            "\nColor: " + cel1.getColor());
    }
}
