package figuras;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Figura {
    String nombre;
    double area;
    
    public double area(){
        System.out.println("Aqui calcularemos el area de cada figura");
        return area;
    }
    public void calcularArea(){
        area();
        System.out.println("El area del " + nombre + " es: "+area);
    }
}
