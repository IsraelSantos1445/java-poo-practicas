package arreglos;

import java.util.Random;

/**
 * Arreglo tridimensional de ventas: ventas[vendedor][trimestre][sucursal].
 * Hay 3 sucursales con 5 vendedores cada una y 4 trimestres. Para cada
 * sucursal se muestra la venta de cada vendedor, el total por vendedor, el total
 * por trimestre y el total de la sucursal; al final, el total de todas.
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class VentasPorSucursal {

    public static void main(String[] args) {
        Random ran = new Random();
        String[][] vendedores = {
            {"Juan", "Pedro", "Marta", "María", "Luis"},
            {"Lili", "Lulu", "José", "Toño", "Petra"},
            {"Víctor", "Iván", "Ana", "Rosa", "Lupita"}};
        int[][][] ventas = new int[5][4][3];
        int totalGeneral = 0;

        for (int s = 0; s < ventas[0][0].length; s++) {
            System.out.println("Sucursal: " + (s + 1));
            System.out.println("Vendedor\tTrim1\tTrim2\tTrim3\tTrim4\tTotal");
            int totalSucursal = 0;
            int[] totalTrimestre = new int[ventas[0].length];

            for (int v = 0; v < ventas.length; v++) {
                int totalVendedor = 0;
                System.out.print(vendedores[s][v] + "\t\t");
                for (int t = 0; t < ventas[0].length; t++) {
                    ventas[v][t][s] = ran.nextInt(100000) + 5001;
                    totalVendedor += ventas[v][t][s];
                    totalTrimestre[t] += ventas[v][t][s];
                    System.out.print(ventas[v][t][s] + "\t");
                }
                System.out.println(totalVendedor);
                totalSucursal += totalVendedor;
            }

            System.out.print("Total\t\t");
            for (int t = 0; t < totalTrimestre.length; t++) {
                System.out.print(totalTrimestre[t] + "\t");
            }
            System.out.println(totalSucursal);
            System.out.println("Total de la sucursal " + (s + 1) + ": " + totalSucursal);
            System.out.println("----------------------------------------------------------");
            totalGeneral += totalSucursal;
        }

        System.out.println("Total de todas las sucursales: " + totalGeneral);
    }
}
