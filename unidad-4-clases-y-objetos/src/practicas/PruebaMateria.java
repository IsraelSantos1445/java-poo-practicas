package practicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaMateria {
    public static void main(String[] args) {
        // Usando constructor con parámetros
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de la materia:");
        String clave = JOptionPane.showInputDialog("Ingrese clave:");
        int creditos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de créditos:"));
        String profesor = JOptionPane.showInputDialog("Ingrese nombre del profesor:");
        String horario = JOptionPane.showInputDialog("Ingrese horario:");

        Materia m1 = new Materia(nombre, clave, creditos, profesor, horario);

        // Usando constructor vacío
        Materia m2 = new Materia();

        JOptionPane.showMessageDialog(null,
            "--- Materia 1 ---\nNombre: " + m1.getNombre() +
            "\nClave: " + m1.getClave() +
            "\nCréditos: " + m1.getNumeroCreditos() +
            "\nProfesor: " + m1.getProfesor() +
            "\nHorario: " + m1.getHorario() +
            "\n\n--- Materia 2 (constructor vacío) ---\nNombre: " + m2.getNombre() +
            "\nClave: " + m2.getClave() +
            "\nCréditos: " + m2.getNumeroCreditos() +
            "\nProfesor: " + m2.getProfesor() +
            "\nHorario: " + m2.getHorario());
    }
}
