package practicas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Materia {
    private String nombre;
    private String clave;
    private int numeroCreditos;
    private String profesor;
    private String horario;

    // Constructor con parámetros
    public Materia(String nombre, String clave, int numeroCreditos, String profesor, String horario) {
        this.nombre = nombre;
        this.clave = clave;
        this.numeroCreditos = numeroCreditos;
        this.profesor = profesor;
        this.horario = horario;
    }

    // Constructor vacío
    public Materia() {
        this.nombre = "";
        this.clave = "";
        this.numeroCreditos = 0;
        this.profesor = "";
        this.horario = "";
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public String getProfesor() {
        return profesor;
    }

    public String getHorario() {
        return horario;
    }
   
}
