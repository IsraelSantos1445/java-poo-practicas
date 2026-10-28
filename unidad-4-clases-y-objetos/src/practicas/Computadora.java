package practicas;

/**
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class Computadora {

    private String marca;
    private String modelo;
    private int velocidadProcesador;
    private int capacidadGb;

    public Computadora(String marca, String modelo, int velocidadProcesador, int capacidadGb) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadProcesador = velocidadProcesador;
        this.capacidadGb = capacidadGb;
    }

    // Getters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadProcesador() {
        return velocidadProcesador;
    }

    public int getCapacidadGb() {
        return capacidadGb;
    }
    
}
