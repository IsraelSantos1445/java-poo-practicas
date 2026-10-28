package clasesabstractas;

/**
 * Polimorfismo con una clase abstracta: cada animal responde de forma distinta
 * al mismo mensaje {@code hacerSonido()}.
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaAnimales {

    public static void main(String[] args) {
        Animal[] animales = {new Perro(), new Gato(), new Vaca()};
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
