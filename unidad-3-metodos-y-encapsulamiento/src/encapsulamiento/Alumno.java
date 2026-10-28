package encapsulamiento;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Alumno {

    private String nombre, matricula;
    private double calificacion;

    public boolean aprobo() {
        if (calificacion >= 70) {
            return true;
        } else {
            return false;
        }
    }
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 100.0) {
            this.calificacion = calificacion;
        } else {
            System.out.println("Calificación no valida. Debe estar entre 0 y 100");

        }

    }
}
