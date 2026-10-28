package metodos;

import javax.swing.JOptionPane;

/**
 * 4. Elaborar un programa con una función o método que reciba como entrada un
 * número y que regrese como resultado el factorial del número recibido. Usar
 * las variables locales necesarias.
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Factorial {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "El factorial no está definido para números negativos");
        } else {
            JOptionPane.showMessageDialog(null,
                    "El factorial de " + numero + " es: " + factorial(numero));
        }
    }

    // Regresa el factorial de un número no negativo (0! = 1)
    public static double factorial(int numero) {
        double resultado = 1;
        for (int x = 2; x <= numero; x++) {
            resultado *= x;
        }
        return resultado;
    }
}
