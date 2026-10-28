package figurasabstractas;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class TrianguloAbstracto extends FiguraAbstracta{
    float base, altura;

    public TrianguloAbstracto(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    void calcularArea(){
        float area = base * altura / 2;
        JOptionPane.showMessageDialog(null, "Área del Triángulo: " + area);
    }
}
