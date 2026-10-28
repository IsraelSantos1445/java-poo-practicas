package metodos;

import javax.swing.JOptionPane;

/**
 *1.	Elaborar un programa en java que contenga 2 métodos para llevar a cabo lo siguiente
a)	transformar pesos a dólares
b)	obtener el área de un triángulo (base*altura/2)

 * @author Israel de Jesús Santos Alvarado
 */
public class ConversionYAreaTriangulo {
    //metodo main
    public static void main(String[] args) {
        float pesos,dolares;//datos para el primer metodo
        float base,altura,area;//datos para el segundo metodo
        pesos=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad de pesos"));
        dolares=pesosDolares(pesos,17.7f);
        JOptionPane.showMessageDialog(null, "El equivalente de " + pesos + " pesos es: " + dolares + " dólares");
        base=Float.parseFloat(JOptionPane.showInputDialog("ingresa la base"));
        altura=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la altura"));
        area=areaTriangulo(base,altura);
        JOptionPane.showMessageDialog(null, "El area del triangulo es: "+area);
    }
    //metodo de clase(static)para calcular el area de un triangulo
    public static float areaTriangulo(float base, float altura){
        float area=base*altura/2;
        return area;
    }
    //metodo de clase(static)para covertir pesos a dolares
    public static float pesosDolares(float pesos, float tipocambio){
        float dolares=pesos/tipocambio;
        return dolares;
    }

}
