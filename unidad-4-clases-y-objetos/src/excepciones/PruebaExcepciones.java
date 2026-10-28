package excepciones;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Manejo de varias excepciones con try / catch. Para provocar cada una:
 * <ul>
 *   <li>ArithmeticException: cambiar {@code a} a 0.</li>
 *   <li>NumberFormatException: escribir letras cuando pide el valor.</li>
 *   <li>ArrayIndexOutOfBoundsException: cambiar {@code <} por {@code <=} en el ciclo.</li>
 * </ul>
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaExcepciones {

    public static void main(String[] args) {
        Random ran = new Random();
        int[] arreglo = new int[10];
        int a = 1;
        int b = 5;

        try {
            int resultado = b / a;
            System.out.println("Resultado = " + resultado);

            int variable = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor: "));
            System.out.println("Valor ingresado: " + variable);

            for (int x = 0; x < arreglo.length; x++) {
                arreglo[x] = ran.nextInt(10) + 1;
                System.out.print(arreglo[x] + "\t");
            }
            System.out.println();
        } catch (ArithmeticException err) {
            System.out.println("Existe un error de división entre 0 " + err);
        } catch (NumberFormatException err) {
            System.out.println("Existe un error en la entrada de datos " + err);
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("Existe un error en el índice del arreglo " + err);
        }
    }
}
