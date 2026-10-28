package metodos;

import java.util.Scanner;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PagoDeObreros {
    public static double calcularPago(int horas, double pagoHora) {
        if (horas <= 40) return horas * pagoHora;
        int extras = horas - 40;
        if (extras <= 8) return 40 * pagoHora + extras * pagoHora * 2;
        return 40 * pagoHora + 8 * pagoHora * 2 + (extras - 8) * pagoHora * 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de obreros: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Horas trabajadas obrero " + (i+1) + ": ");
            int h = sc.nextInt();
            System.out.print("Pago por hora: ");
            double ph = sc.nextDouble();
            System.out.println("Pago semanal: " + calcularPago(h, ph));
        }
    }
}
