package clasesabstractas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Vaca extends Animal {

    @Override
    public void hacerSonido() {
        nombre = "Lola";
        System.out.println("La vaca " + nombre + " hace muu muu");
    }
}
