package personalidad;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class ObjetoEnojado {
    //devuelve el estado de animo
    protected String getEstadoAnimo(){
        return "enojado";
    }
    //Pregunta al objeto como se siente 
    public void preguntaEstadoAnimo() {
        	System.out.println("¡Hoy me siento " + getEstadoAnimo() + "!");

}
}
