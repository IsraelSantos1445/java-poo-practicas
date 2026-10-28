package sobrecarga;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class SobrecargaSuma {
    public static void main(String[] args) {
        long a=1,b=5;
        double c=2.4,d=5.3;
        System.out.println("Suma: "+suma(1, 2));
        System.out.println("Suma: "+suma(c, d));
        System.out.println("Suma: "+suma(1f, 2f));
        System.out.println("Suma: "+suma(a, b));
    }
    public static int suma(int a, int b){
        System.out.println("Se ejecuto la suma de 2 enteros");
        return a+b;
    }
    public static float suma(float a, float b){
        System.out.println("Se ejecuto la suma de 2 flotantes");
        return a+b;
    }
    public static double suma(double a, double b){
        System.out.println("Se ejecuto la suma de 2 doubles");
        return a+b;
    }
    public static long suma(long a, long b){
        System.out.println("Se ejecuto la suma de 2 long");
        return a+b;
    }
}
