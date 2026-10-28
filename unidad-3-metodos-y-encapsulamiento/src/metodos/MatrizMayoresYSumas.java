package metodos;

import java.util.Random;

/**
 * 6. Diseñe un programa en Java que llene una matriz de 10 * 10 con valores
 * numéricos entre 1 y 100 generados con Random y determine:
 * a) El número mayor almacenado en la matriz.
 * b) El número mayor almacenado en cada renglón.
 * c) La columna que tuvo la máxima suma.
 * d) El renglón que tuvo la máxima suma.
 * Se diseña un método para cada inciso.
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class MatrizMayoresYSumas {

    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random rnd = new Random();

        for (int r = 0; r < matriz.length; r++) {
            for (int c = 0; c < matriz[0].length; c++) {
                matriz[r][c] = rnd.nextInt(100) + 1;
                System.out.printf("%4d", matriz[r][c]);
            }
            System.out.println();
        }

        System.out.println("a) Número mayor de la matriz: " + mayorDeLaMatriz(matriz));
        System.out.println("b) Número mayor de cada renglón:");
        mayorPorRenglon(matriz);
        System.out.println("c) Columna con la máxima suma: " + (columnaConMaximaSuma(matriz) + 1));
        System.out.println("d) Renglón con la máxima suma: " + (renglonConMaximaSuma(matriz) + 1));
    }

    // a) El número mayor almacenado en la matriz
    public static int mayorDeLaMatriz(int[][] matriz) {
        int mayor = matriz[0][0];
        for (int[] renglon : matriz) {
            for (int valor : renglon) {
                if (valor > mayor) {
                    mayor = valor;
                }
            }
        }
        return mayor;
    }

    // b) El número mayor almacenado en cada renglón
    public static void mayorPorRenglon(int[][] matriz) {
        for (int r = 0; r < matriz.length; r++) {
            int mayorRenglon = matriz[r][0]; // se reinicia en cada renglón
            for (int c = 1; c < matriz[r].length; c++) {
                if (matriz[r][c] > mayorRenglon) {
                    mayorRenglon = matriz[r][c];
                }
            }
            System.out.println("   Renglón " + (r + 1) + ": " + mayorRenglon);
        }
    }

    // c) La columna que tuvo la máxima suma (regresa su índice, desde 0)
    public static int columnaConMaximaSuma(int[][] matriz) {
        int columnaMayor = 0;
        int sumaMayor = Integer.MIN_VALUE;
        for (int c = 0; c < matriz[0].length; c++) {
            int sumaColumna = 0; // se reinicia en cada columna
            for (int r = 0; r < matriz.length; r++) {
                sumaColumna += matriz[r][c];
            }
            if (sumaColumna > sumaMayor) {
                sumaMayor = sumaColumna;
                columnaMayor = c;
            }
        }
        return columnaMayor;
    }

    // d) El renglón que tuvo la máxima suma (regresa su índice, desde 0)
    public static int renglonConMaximaSuma(int[][] matriz) {
        int renglonMayor = 0;
        int sumaMayor = Integer.MIN_VALUE;
        for (int r = 0; r < matriz.length; r++) {
            int sumaRenglon = 0;
            for (int c = 0; c < matriz[r].length; c++) {
                sumaRenglon += matriz[r][c];
            }
            if (sumaRenglon > sumaMayor) {
                sumaMayor = sumaRenglon;
                renglonMayor = r;
            }
        }
        return renglonMayor;
    }
}
