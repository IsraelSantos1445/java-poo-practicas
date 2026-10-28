package practicas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Celular {
    private String marca;
    private String modelo;
    private float tamanoDisplay;
    private int capacidad;
    private String color;

    public Celular(String marca, String modelo, float tamanoDisplay, int capacidad, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanoDisplay = tamanoDisplay;
        this.capacidad = capacidad;
        this.color = color;
    }

    // Getters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getTamanoDisplay() {
        return tamanoDisplay;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getColor() {
        return color;
    }
    
}
