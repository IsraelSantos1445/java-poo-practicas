package clasesabstractas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Perro extends Animal{
    @Override
    public void hacerSonido(){
        nombre="Perro";
        System.out.println("El "+nombre+" hace guau guau");
    }
}
