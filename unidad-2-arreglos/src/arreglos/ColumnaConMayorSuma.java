package arreglos;

/**
 *15)	Elaborar un programa que llene una matriz de 20 * 20.
 * Sumar las columnas e imprimir que columna tuvo la máxima suma
 * y la suma de esa columna.

 * @author Israel de Jesús Santos Alvarado
 */
public class ColumnaConMayorSuma {

    public static void main(String[] args) {
        int[][] matriz = new int[20][20];
        int[] sumaColumnas = new int[20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
        for (int j = 0; j < 20; j++) {
            for (int i = 0; i < 20; i++) {
                sumaColumnas[j] += matriz[i][j];
            }
        }
        int maxCol = 0;
        for (int j = 1; j < 20; j++) {
            if (sumaColumnas[j] > sumaColumnas[maxCol]) {
                maxCol = j;
            }
        }

        System.out.println("La columna con mayor suma es: " + (maxCol + 1));
        System.out.println("La suma de esa columna es: " + sumaColumnas[maxCol]);
    }
}
