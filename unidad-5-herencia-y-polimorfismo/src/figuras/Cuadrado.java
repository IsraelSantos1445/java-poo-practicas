package figuras;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Cuadrado extends Figura{
    @Override
    public double area(){
       nombre="Cuadrado";
        double lado;
        System.out.println("Aqui calcularemos el area del "+nombre);
        lado=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el lado del cuadrado"));
        area=lado*lado;
        return area;
    }
}
