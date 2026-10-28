package figurasabstractas;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class CirculoAbstracto extends FiguraAbstracta{

    float radio;

    public CirculoAbstracto(float radio){
        this.radio = radio;
    }

    @Override
    void calcularArea(){
        float area = (float)(Math.PI * Math.pow(radio, 2));
        JOptionPane.showMessageDialog(null, "Área del Círculo: " + area);
    }
}
