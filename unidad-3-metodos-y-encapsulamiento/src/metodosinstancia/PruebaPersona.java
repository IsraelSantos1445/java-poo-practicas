package metodosinstancia;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona Luis=new Persona();
        Luis.nombre="Luis";
        Luis.edad=20;
        System.out.println("Datos de Luis ");
        System.out.println("Nombre: "+Luis.nombre);
        System.out.println("Edad: "+Luis.edad);
        Luis.saludar();
        Luis.cumplirAnios();
        System.out.println("Datos de Luis ");
        System.out.println("Nombre: "+Luis.nombre);
        System.out.println("Edad: "+Luis.edad);
    }
}
