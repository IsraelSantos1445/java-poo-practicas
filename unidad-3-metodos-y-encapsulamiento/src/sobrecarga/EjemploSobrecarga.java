package sobrecarga;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class EjemploSobrecarga {

    static int n;

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    public static int suma(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        n = suma(1, 2);
        System.out.println("La suma es: " + n);
        n = suma(1, 2, 3);
        System.out.println("La suma es: " + n);
        n = suma(1, 2, 3, 4);
        System.out.println("La suma es: " + n);
    }

}
