package metodosinstancia;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class ManejoCuentaBancaria {

    public static void main(String[] args) {
        double deposito,retiro;
        CuentaBancaria obj = new CuentaBancaria();
        obj.titular=JOptionPane.showInputDialog("Ingresa el nombre del titular de la cuenta");
        obj.mostrarSaldo();
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar"));
        obj.depositar(deposito);
        
        retiro=Double.parseDouble(JOptionPane.showInputDialog("Cantidad a retirar"));
        obj.retirar(retiro);
        obj.mostrarSaldo();
    }
}
