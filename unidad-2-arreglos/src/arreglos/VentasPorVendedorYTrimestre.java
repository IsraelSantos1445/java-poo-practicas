package arreglos;

import java.util.Random;

/**
 * Matriz de ventas de 5 vendedores en 4 trimestres (valores aleatorios).
 * Se muestra la venta de cada trimestre, el total anual de cada vendedor, el
 * total de cada trimestre y el total general.
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class VentasPorVendedorYTrimestre {

    public static void main(String[] args) {
        String[] nombres = {"Juan", "Tadeo", "Abraham", "Pedro", "Alex"};
        int[][] ventas = new int[5][4];
        int[] ventaAnual = new int[ventas.length];
        int[] ventaTrimestral = new int[ventas[0].length];
        int totalGeneral = 0;
        Random ran = new Random();

        System.out.println("Nombre\tTrim1\tTrim2\tTrim3\tTrim4\tAnual");
        for (int r = 0; r < ventas.length; r++) {
            System.out.print(nombres[r] + "\t");
            for (int c = 0; c < ventas[0].length; c++) {
                ventas[r][c] = ran.nextInt(95000) + 5000;
                ventaAnual[r] += ventas[r][c];
                ventaTrimestral[c] += ventas[r][c];
                System.out.print(ventas[r][c] + "\t");
            }
            System.out.println(ventaAnual[r]);
            totalGeneral += ventaAnual[r];
        }

        System.out.print("Total\t");
        for (int c = 0; c < ventaTrimestral.length; c++) {
            System.out.print(ventaTrimestral[c] + "\t");
        }
        System.out.println(totalGeneral);
    }
}
