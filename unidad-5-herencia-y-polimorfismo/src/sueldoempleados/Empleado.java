package sueldoempleados;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Empleado {
    String nombre;
    int edad;
    double sueldoBase;

    public Empleado(String nombre, int edad, double sueldoBase){
        this.nombre = nombre;
        this.edad = edad;
        this.sueldoBase = sueldoBase;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nSueldo Base: " + sueldoBase);
    }

    public void calculoSueldoNeto(){
        double sueldoNeto = sueldoBase; // por defecto igual al sueldo base
        System.out.println("Sueldo Neto de " + nombre + ": " + sueldoNeto);
    
}
}
