package figuras;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaAreas {

    public static void main(String[] args) {
        Figura fig =new Figura();
        Triangulo tri= new Triangulo();
        Cuadrado cua =new Cuadrado();
        Circulo cir=new Circulo();
        llamaArea(fig);
        llamaArea(tri); 
        llamaArea(cua);
        llamaArea(cir);
    }
        //Metodo para llamar al metodo que calcula el area de cada figura
        public static void llamaArea(Figura obj){
            JOptionPane.showMessageDialog(null, "El area del " + obj.nombre + " es: "+obj.area());
        }

}
