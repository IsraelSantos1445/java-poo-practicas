package personalidad;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class ObjetoFeliz extends ObjetoEnojado{
        // redefine el estado de ánimo de la clase
    protected String getEstadoAnimo() {
		return "feliz";
    }
    
    // especialización
    public void reir() {
        	System.out.println("jaja jeje jiji jojo juju");
    }

}
