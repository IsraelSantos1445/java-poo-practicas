package metodos;

import java.util.Scanner;

/**
 *7.	Elaborar un programa con una función que determine si un número introducido
 * por el teclado es primo o no lo es.
 * @author Israel de Jesús Santos Alvarado
 */
public class NumeroPrimo {

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println(esPrimo(num) ? "Es primo" : "No es primo");
    }
}
