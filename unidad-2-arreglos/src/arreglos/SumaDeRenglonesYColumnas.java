package arreglos;

import java.util.Random;

/**
 *14)	Elaborar un programa que llene una matriz de 7 * 7. 
 * Calcular  la suma de cada renglón 
 * y almacenarla en un vector, 
 * la suma de cada columna y almacenarla en otro vector.
 * @author Israel de Jesús Santos Alvarado
 */
public class SumaDeRenglonesYColumnas {

    public static void main(String[] args) {
        int matriz[][]=new int [7][7];
        int vectorA[]=new int [matriz.length];//vector
        int vectorB[]=new int[matriz[0].length];
        int sumaren=0,sumacol=0;
        Random ran =new Random();
        for(int r=0;r<matriz.length;r++){
            for(int c=0;c<matriz[0].length;c++){
                matriz[r][c]=ran.nextInt(10)+1;
            System.out.print(matriz[r][c]+"\t");
                sumaren+=matriz[r][c];
            }
            vectorA[r]=sumaren;
            sumaren=0;
            System.out.println(vectorA[r]);
        }
        //ciclo para obtener la suma de cada columna y asignarla al vector B
        for(int c=0;c<matriz[0].length;c++){
            for(int r=0;r<matriz.length;r++){
                sumacol+=matriz[r][c];
            }
            vectorB[c]=sumacol;
            sumacol=0;
            System.out.print(vectorB[c]+"\t");
        }
        System.out.println();
    }

}
