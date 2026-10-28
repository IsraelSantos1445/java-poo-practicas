package arreglos;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class VentasPorTiendaYDeporte {

    public static void main(String[] args) {

        double[][] ventas = new double[50][20]; // tiendas x deportes
        double[] totalTiendas = new double[50];
        double[] totalDeportes = new double[20];
        double totalGeneral = 0;

        // Simulación de ventas
        for (int t = 0; t < 50; t++) {
            for (int d = 0; d < 20; d++) {
                ventas[t][d] = (Math.random() * 1000);
                totalTiendas[t] += ventas[t][d];
                totalDeportes[d] += ventas[t][d];
                totalGeneral += ventas[t][d];
            }
        }

        // Resultados
        System.out.println("VentasPorVendedorYTrimestre por tienda:");
        for (int t = 0; t < 50; t++) System.out.println("Tienda " + (t+1) + ": " + totalTiendas[t]);

        System.out.println("\nVentas por deporte:");
        for (int d = 0; d < 20; d++) System.out.println("Deporte " + (d+1) + ": " + totalDeportes[d]);

        System.out.println("\nVentas totales: " + totalGeneral);
    }
}
