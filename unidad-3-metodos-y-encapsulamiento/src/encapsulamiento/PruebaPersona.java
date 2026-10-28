package encapsulamiento;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaPersona {

    public static void main(String[] args) {
        Persona obj=new Persona();//creo objeto de la clase persona
        obj.setEdad(25);
        obj.setNombre("Pedro");
        System.out.println("Nombre: "+obj.getNombre());
        System.out.println("Edad: "+obj.getEdad());
    }

}
