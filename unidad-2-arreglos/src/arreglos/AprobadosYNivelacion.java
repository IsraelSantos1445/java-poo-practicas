package arreglos;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class AprobadosYNivelacion {

    public static void main(String[] args) {
        int alumnos = 50, parciales = 5;
        int[][] M = new int[alumnos][parciales];
        int aprobados = 0, nivelacion = 0;
        int maxCalif = Integer.MIN_VALUE;

        // Simulación de calificaciones
        for (int i = 0; i < alumnos; i++) {
            int suma = 0;
            for (int j = 0; j < parciales; j++) {
                M[i][j] = (int)(Math.random() * 100);
                suma += M[i][j];
            }
            int promedio = suma / parciales;

            if (promedio >= 70) aprobados++;
            else if (promedio >= 60) nivelacion++;

            if (promedio > maxCalif) maxCalif = promedio;
        }

        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos con derecho a nivelación: " + nivelacion);
        System.out.println("Máxima calificación final: " + maxCalif);

        System.out.println("Alumnos con máxima calificación:");
        for (int i = 0; i < alumnos; i++) {
            int suma = 0;
            for (int j = 0; j < parciales; j++) suma += M[i][j];
            int promedio = suma / parciales;
            if (promedio == maxCalif) System.out.println("Alumno " + (i+1));
        }
    }
}
