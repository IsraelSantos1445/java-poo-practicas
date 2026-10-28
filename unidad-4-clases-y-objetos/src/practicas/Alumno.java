package practicas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Alumno {
    private String nombre;
    private String direccion;
    private int numeroControl;
    private String carrera;
    private int semestre;

    // Constructor por defecto
    public Alumno() {
        this.nombre = "";
        this.direccion = "";
        this.numeroControl = 0;
        this.carrera = "";
        this.semestre = 0;
    }

    // Constructor con parámetros
    public Alumno(String nombre, String direccion, int numeroControl, String carrera, int semestre) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroControl = numeroControl;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public int getNumeroControl() { return numeroControl; }
    public void setNumeroControl(int numeroControl) { this.numeroControl = numeroControl; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }
}
