package fundamentos;

import javax.swing.JOptionPane;

/**
 * 22) En un centro de verificación de automóviles se desea saber el promedio de
 * puntos contaminantes de los primeros 25 automóviles que lleguen. Asimismo, se
 * desea saber los puntos contaminantes del carro que menos contaminó y del que
 * más contaminó.
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class VerificacionDeAutos {

    public static void main(String[] args) {
        final int TOTAL_AUTOS = 25;
        float sumaPuntos = 0;
        float masContamino = Float.NEGATIVE_INFINITY;
        float menosContamino = Float.POSITIVE_INFINITY;

        for (int x = 1; x <= TOTAL_AUTOS; x++) {
            float puntos = Float.parseFloat(
                    JOptionPane.showInputDialog("Puntos contaminantes del auto " + x));
            sumaPuntos += puntos;
            if (puntos > masContamino) {
                masContamino = puntos;
            }
            if (puntos < menosContamino) {
                menosContamino = puntos;
            }
        }

        float promedio = sumaPuntos / TOTAL_AUTOS;
        JOptionPane.showMessageDialog(null,
                "Promedio de puntos contaminantes: " + promedio
                + "\nAuto que más contaminó: " + masContamino
                + "\nAuto que menos contaminó: " + menosContamino);
    }
}
