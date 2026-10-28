package sobrecarga;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaAreas {
    public static void main(String[] args) {
        double area;
        while(true){
            int opcion;
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Menú"+
                    "\n1.Area del circulo"+
                    "\n2.Area del Cuadrado"+
                    "\n3.Area del Triangulo"+
                    "\n4.Salir"));
            switch(opcion){
                case 1:
                    double radio;
                    radio=Double.parseDouble(JOptionPane.showInputDialog("Ingresa radio"));
                    Circulo obj=new Circulo();
                    JOptionPane.showMessageDialog(null,"El area del circulo es: "+obj.area(radio));
                    break;
                case 2:
                    float lado;
                    lado=Float.parseFloat(JOptionPane.showInputDialog("Ingresa lado"));
                    Cuadrado cua=new Cuadrado();
                    JOptionPane.showMessageDialog(null, "El area del cuadrado es: "+cua.area(lado));
                    break;
                case 3:
                    float base, altura;
                    altura=Float.parseFloat(JOptionPane.showInputDialog("ingresa altura"));
                    base=Float.parseFloat(JOptionPane.showInputDialog("ingresa base"));
                    Triangulo tri=new Triangulo();
                    JOptionPane.showMessageDialog(null, "El Area del triangulo es: "+ tri.area(base,altura));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcion incorrecta");
            }
        }
    }
    
}
