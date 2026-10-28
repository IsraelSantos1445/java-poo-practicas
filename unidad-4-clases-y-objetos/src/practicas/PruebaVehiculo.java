package practicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaVehiculo {
    public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog("Ingrese la marca:");
        String submarca = JOptionPane.showInputDialog("Ingrese la submarca:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo:");
        int cilindros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de cilindros:"));
        String color = JOptionPane.showInputDialog("Ingrese el color:");

        Vehiculo v1 = new Vehiculo(marca, submarca, modelo, cilindros, color);

        JOptionPane.showMessageDialog(null,
            "Vehículo:\nMarca: " + v1.getMarca() +
            "\nSubmarca: " + v1.getSubmarca() +
            "\nModelo: " + v1.getModelo() +
            "\nCilindros: " + v1.getNumeroCilindros() +
            "\nColor: " + v1.getColor());
    }
}
