package encapsulamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class PruebaAlumno {

    public static void main(String[] args) {
        Alumno alumno=new Alumno();
        String nom,matricula;
        double calificacion;
        nom=(JOptionPane.showInputDialog("Ingresa tu nombre"));
        matricula=(JOptionPane.showInputDialog("Ingresa tu matricula"));
        calificacion=(Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu Calificación")));
        
        //asignacion mediante setters
        alumno.setNombre(nom);
        alumno.setMatricula(matricula);
        alumno.setCalificacion(calificacion);
        //mostrarinformacion
        System.out.println("nombre: "+alumno.getNombre());
        System.out.println("Matricula: "+alumno.getMatricula());
        System.out.println("Calificación: "+alumno.getCalificacion());
        //Evaluación
        if(alumno.aprobo()){
            System.out.println("El alumno aprobó");
        }else{
            System.out.println("El alumno reprobó");
        }
        
    }

}
