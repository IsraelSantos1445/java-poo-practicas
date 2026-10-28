package figuras;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Triangulo extends Figura{
    @Override
    public double area(){
        nombre="Triangulo";
        double base,altura;
        System.out.println("Aqui calcularemos el area del "+nombre);
        base=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del triangulo"));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del triangulo"));
        area=base*altura/2;
        return area;
    }
}
