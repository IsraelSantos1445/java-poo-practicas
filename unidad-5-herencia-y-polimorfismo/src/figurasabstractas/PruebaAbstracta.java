package figurasabstractas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaAbstracta {

    public static void main(String[] args) {

        FiguraAbstracta f1 = new TrianguloAbstracto(10, 5);
        FiguraAbstracta f2 = new CirculoAbstracto(7);

        f1.calcularArea();
        f2.calcularArea();
    }
}
