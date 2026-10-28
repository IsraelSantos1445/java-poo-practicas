package fundamentos;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class VentaDeNaranjas {

    public static void main(String[] args) {
        double totalTienda = 0; // acumulador de lo que percibe la tienda

        for (int i = 1; i <= 15; i++) {
            // Entrada de datos para cada cliente
            String kilosStr = JOptionPane.showInputDialog("Cliente " + i + 
                ": Ingrese la cantidad de kilos de naranjas comprados:");
            double kilos = Double.parseDouble(kilosStr);

            String precioStr = JOptionPane.showInputDialog("Cliente " + i + 
                ": Ingrese el precio por kilo de naranjas:");
            double precioPorKilo = Double.parseDouble(precioStr);

            // Calcular total sin descuento
            double totalCompra = kilos * precioPorKilo;

            // Determinar descuento
            double descuento = 0;
            if (kilos > 10) {
                descuento = 0.15; // 15% de descuento
            }

            // Calcular total con descuento
            double dineroDescontado = totalCompra * descuento;
            double totalPagar = totalCompra - dineroDescontado;

            // Acumular lo que percibe la tienda
            totalTienda += totalPagar;

            // Mostrar resultado para cada cliente
            String mensaje = "Cliente " + i +
                             "\nKilos comprados: " + kilos +
                             "\nPrecio por kilo: $" + precioPorKilo +
                             "\nTotal sin descuento: $" + totalCompra +
                             "\nDescuento aplicado: " + (descuento * 100) + "%" +
                             "\nDinero descontado: $" + dineroDescontado +
                             "\nTotal a pagar: $" + totalPagar;

            JOptionPane.showMessageDialog(null, mensaje);
        }

        // Mostrar lo que percibe la tienda al final
        JOptionPane.showMessageDialog(null, "La tienda percibirá en total: $" + totalTienda);
    }
}
