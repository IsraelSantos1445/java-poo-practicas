package practicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaComputadora {

    public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog("Ingrese la marca:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo:");
        int velocidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad del procesador (GHz):"));
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese capacidad en GB:"));

        Computadora c1 = new Computadora(marca, modelo, velocidad, capacidad);

        JOptionPane.showMessageDialog(null,
            "Computadora:\nMarca: " + c1.getMarca() +
            "\nModelo: " + c1.getModelo() +
            "\nVelocidad: " + c1.getVelocidadProcesador() + " GHz" +
            "\nCapacidad: " + c1.getCapacidadGb() + " GB");
    }
}
