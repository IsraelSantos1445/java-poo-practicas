package clasesabstractas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public abstract class Empleado {
    String nombre;
    //Constructor

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    //Metodo abstracto
    abstract double calcularSalario();
    //metodo normal
    void mostrarInfo(){
        System.out.println("Empleado: "+nombre);
        System.out.println("Salario: "+calcularSalario());
    }
}
