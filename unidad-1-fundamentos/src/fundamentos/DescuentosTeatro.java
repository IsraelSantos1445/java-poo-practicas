package fundamentos;

import javax.swing.JOptionPane;

/**
 * Teatro: se captura el costo de la entrada y la edad de cada cliente. Según la
 * edad se aplica un descuento y se acumula el descuento total de cada categoría:
 * <pre>
 *   Menores de 5 años   no pueden entrar
 *   Categoría 1: 5 a 14 años    35 %
 *   Categoría 2: 15 a 19 años   25 %
 *   Categoría 3: 20 a 45 años   10 %
 *   Categoría 4: 46 a 65 años   25 %
 *   Categoría 5: 66 años o más  35 %
 * </pre>
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class DescuentosTeatro {

    public static void main(String[] args) {
        float costoEntrada = Float.parseFloat(JOptionPane.showInputDialog("Costo de la entrada"));
        float descuentoCat1 = 0, descuentoCat2 = 0, descuentoCat3 = 0, descuentoCat4 = 0, descuentoCat5 = 0;
        boolean continuar = true;

        while (continuar) {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del cliente"));

            if (edad < 5) {
                JOptionPane.showMessageDialog(null, "¡No puede entrar al teatro!");
            } else if (edad <= 14) {
                descuentoCat1 += costoEntrada * 0.35f;
            } else if (edad <= 19) {
                descuentoCat2 += costoEntrada * 0.25f;
            } else if (edad <= 45) {
                descuentoCat3 += costoEntrada * 0.10f;
            } else if (edad <= 65) {
                descuentoCat4 += costoEntrada * 0.25f;
            } else {
                descuentoCat5 += costoEntrada * 0.35f;
            }

            String respuesta;
            do {
                respuesta = JOptionPane.showInputDialog("¿Deseas continuar? (si/no)");
                if (respuesta == null) {
                    respuesta = "no"; // si cierra la ventana se toma como "no"
                }
                if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                    JOptionPane.showMessageDialog(null, "Teclea si o no");
                }
            } while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
            continuar = respuesta.equalsIgnoreCase("si");
        }

        JOptionPane.showMessageDialog(null,
                "Descuento en categoría 1: " + descuentoCat1
                + "\nDescuento en categoría 2: " + descuentoCat2
                + "\nDescuento en categoría 3: " + descuentoCat3
                + "\nDescuento en categoría 4: " + descuentoCat4
                + "\nDescuento en categoría 5: " + descuentoCat5);
    }
}
