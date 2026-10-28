package interfaces;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class ArrancaInterfaz {

    public static void main(String[] args) {
        Persona p =new Persona();
        Canario can=new Canario();
        p.cantar();
        hacerCantar(p);
        can.cantar();
        hacerCantar(can);
    }
    private static void hacerCantar(Cantante c){
        c.cantar();
    }
}
