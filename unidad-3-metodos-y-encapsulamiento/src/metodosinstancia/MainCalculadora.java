package metodosinstancia;

import javax.swing.JOptionPane;

/**
 * Menú de una calculadora que usa los métodos de instancia de la clase
 * {@link Calculadora}.
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class MainCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú"
                    + "\n1. Suma"
                    + "\n2. Resta"
                    + "\n3. Multiplicación"
                    + "\n4. División"
                    + "\n5. Salir"));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null,
                            "Resultado de la suma: " + calc.sumar(pedirEntero(1), pedirEntero(2)));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,
                            "Resultado de la resta: " + calc.restar(pedirEntero(1), pedirEntero(2)));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,
                            "Resultado de la multiplicación: " + calc.multiplicar(pedirEntero(1), pedirEntero(2)));
                    break;
                case 4:
                    double c = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el número 1"));
                    double d = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el número 2"));
                    if (d == 0) {
                        JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Resultado de la división: " + calc.dividir(c, d));
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
            }
        }
    }

    private static int pedirEntero(int numero) {
        return Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número " + numero));
    }
}
