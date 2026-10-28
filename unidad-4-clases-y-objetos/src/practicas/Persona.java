package practicas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Persona {
    private String nombre;
    private int edad;
    private String CURP;
    private char sexo; // 'H' hombre, 'M' mujer
    private double peso;
    private double altura;

    // Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.CURP = "";
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
    }

    // Constructor con parámetros
    public Persona(String nombre, int edad, String CURP, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.CURP = CURP;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getCURP() { return CURP; }
    public void setCURP(String CURP) { this.CURP = CURP; }

    public char getSexo() { return sexo; }
    public void setSexo(char sexo) { this.sexo = sexo; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
}
