package personalidad;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class EjemploPersonalidad {

    public static void main(String[] args) {
        EjemploPersonalidad obj = new EjemploPersonalidad();
        ObjetoPersonalidad personalidad = new ObjetoPersonalidad();
        ObjetoPesimista pesimista = new ObjetoPesimista();
        ObjetoOptimista optimista = new ObjetoOptimista();
        ObjetoIntrovertido introvertido = new ObjetoIntrovertido();
        ObjetoExtrovertido extrovertido = new ObjetoExtrovertido();

        // la sustituibilidad permite hacer lo siguiente
        ObjetoPersonalidad[] personalidades = new ObjetoPersonalidad[5];
        personalidades[0] = personalidad;
        personalidades[1] = pesimista;
        personalidades[2] = optimista;
        personalidades[3] = introvertido;
        personalidades[4] = extrovertido;
        // el polimorfismo hace que el ObjetoPersonalidad parezca tener muchos comportamientos distintos
        System.out.println("El ObjetoPersonalidad[0] habla: " + personalidades[0].hablar());
        System.out.println("El ObjetoPersonalidad[1] habla: " + personalidades[1].hablar());
        System.out.println("El ObjetoPersonalidad[2] habla: " + personalidades[2].hablar());
        System.out.println("El ObjetoPersonalidad[3] habla: " + personalidades[3].hablar());
        System.out.println("El ObjetoPersonalidad[4] habla: " + personalidades[4].hablar());
        //LLamado a los metodos HaceHablar
        obj.haceHablar(pesimista);
        obj.haceHablar(optimista);
        obj.haceHablar(introvertido);
        obj.haceHablar(extrovertido);
        
	}
    public void haceHablar ( ObjetoPersonalidad obj ) {
      	System.out.println( obj.hablar());
    }
}
