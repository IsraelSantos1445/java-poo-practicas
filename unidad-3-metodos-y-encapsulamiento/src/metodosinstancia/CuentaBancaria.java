package metodosinstancia;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class CuentaBancaria {
    //Atributos de instancia
    String titular;
    double saldo;
    //metodos de instancia
    public void depositar(double cantidad){
        saldo+=cantidad;
    }
    public void retirar(double cantidad){
        saldo-=cantidad;
    }
    public void mostrarSaldo(){
        JOptionPane.showMessageDialog(null, "Saldo actual: "+titular+" es: "+saldo);
    }
}
