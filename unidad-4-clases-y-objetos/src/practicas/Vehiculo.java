package practicas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Vehiculo {
    private String marca;
    private String submarca;
    private String modelo;
    private int numeroCilindros;
    private String color;

    public Vehiculo(String marca, String submarca, String modelo, int numeroCilindros, String color) {
        this.marca = marca;
        this.submarca = submarca;
        this.modelo = modelo;
        this.numeroCilindros = numeroCilindros;
        this.color = color;
    }

    // Getters

    public String getMarca() {
        return marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumeroCilindros() {
        return numeroCilindros;
    }

    public String getColor() {
        return color;
    }
    
}
