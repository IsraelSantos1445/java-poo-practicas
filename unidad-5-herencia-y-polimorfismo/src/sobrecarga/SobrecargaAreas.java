package sobrecarga;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class SobrecargaAreas {

    static String nombre;
    static double area;

    public static void main(String[] args) {
        while (true) {
            int opcion;
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú de opciones: "
                    + "\n1.Calcular Area del Triangulo"
                    + "\n2.Calcular area del Circulo"
                    + "\n3.Calcular el area del cuadrado"
                    + "\n4.Salir"));
            switch (opcion) {
                case 1:
                    nombre = "Triangulo";
                    double base,altura;
                    System.out.println("Aqui calcularemos el area del " + nombre);
                    base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del triangulo"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del triangulo"));
                    JOptionPane.showMessageDialog(null, "El area del triangulo es: " + area(base, altura));
                    break;
                case 2:
                    nombre = "Circulo";
                    double radio;
                    System.out.println("Aqui calcularemos el area del " + nombre);
                    radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del circulo"));
                    JOptionPane.showMessageDialog(null, "El area del circulo es: " + area(radio));
                    break;
                case 3:
                    nombre = "Cuadrado";
                    float lado;
                    System.out.println("Aqui calcularemos el area del " + nombre);
                    lado = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el lado del cuadrado"));
                    JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + area(lado));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcion invalida");
            }
        }
    }
    public static double area(double radio) {
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public static double area(float lado) {
        area = lado * lado;
        return area;
    }

    public static double area(double base, double altura) {
        area = base * altura / 2;
        return area;
    }
}
