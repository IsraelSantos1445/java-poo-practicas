package figuras;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Circulo extends Figura{
    public double area(){
        nombre="Circulo";
        double radio;
        System.out.println("Aqui calcularemos el area del "+nombre);
        radio=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del circulo"));
        area=Math.PI*Math.pow(radio, 2);
        return area;
    }
}
