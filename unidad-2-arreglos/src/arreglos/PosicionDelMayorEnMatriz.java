package arreglos;

import java.util.Scanner;

/**
 *
13)	Elaborar un programa que llene una matriz de 10 * 10 y determine la posición [renglon ,columna]
* del numero mayor almacenado en la matriz. Los números son diferentes.

 * @author Israel de Jesús Santos Alvarado
 */
public class PosicionDelMayorEnMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[10][10];

        // Lectura de la matriz
        System.out.println("Ingrese los 100 elementos de la matriz (10x10):");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // Inicializamos el mayor con el primer elemento
        int mayor = matriz[0][0];
        int filaMayor = 0;
        int columnaMayor = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                }
            }
        }

        // Resultado
        System.out.println("El número mayor es: " + mayor);
        System.out.println("Se encuentra en la posición: [" + filaMayor + ", " + columnaMayor + "]");

        sc.close();
    }
}
