package fundamentos;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 * combinacion de uso de un while infinito y switch
 */
public class MenuConWhile {

    public static void main(String[] args) {
        int opcion;
        //ciclo While infinito
        while(true){
            //menu de opciones
            opcion=Integer.parseInt(JOptionPane.showInputDialog("menu de opciones"+
                  "\n1.Opcion 1"+
                    "\n2. opcion 2"+
                    "\n3. Opcion 3"+
                    "\n4. Opcion 4"+
                    "\n5.Salir"+
                    "\n Selecciona una opcion"
                    ));
            switch (opcion){
                case 1:
                    JOptionPane.showMessageDialog(null, "Seleccionaste la opcion 1");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Seleccionaste la opcion 2");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Seleccionaste la opcion 3");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Seleccionaste la opcion 4");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Seleccionaste la opcion salir");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
    
}
