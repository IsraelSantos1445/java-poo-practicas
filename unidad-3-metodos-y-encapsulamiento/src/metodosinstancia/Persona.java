package metodosinstancia;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Persona {

    //atributos
    String nombre;
    int edad;

    public void saludar() {
        System.out.println("Hola, mi nombre es: " + nombre);
    }

    public void cumplirAnios() {
        edad++;
    }

}
