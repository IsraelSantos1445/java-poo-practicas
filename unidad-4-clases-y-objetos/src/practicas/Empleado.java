package practicas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Empleado {
    private String nombre;
    private String apellidos;
    private int numeroEmpleado;
    private boolean estadoCivil;

    public Empleado(String nombre, String apellidos, int numeroEmpleado, boolean estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroEmpleado = numeroEmpleado;
        this.estadoCivil = estadoCivil;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public int getNumeroEmpleado() { return numeroEmpleado; }
    public void setNumeroEmpleado(int numeroEmpleado) { this.numeroEmpleado = numeroEmpleado; }

    public boolean isEstadoCivil() { return estadoCivil; }
    public void setEstadoCivil(boolean estadoCivil) { this.estadoCivil = estadoCivil; }
}
