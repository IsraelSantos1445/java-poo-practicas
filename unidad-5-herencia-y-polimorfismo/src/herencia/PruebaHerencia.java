package herencia;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaHerencia {
    public static void main(String[] args) {
        Alumno obj = new Alumno();
        Persona obj1= new Persona();
        obj1.nombre="Lupita";
        obj.nombre="pepe";
        obj.imprimeRegistro();
    }
}
