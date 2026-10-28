package excepciones;

import java.io.FileReader;
import java.io.IOException;

/**
 * Ejemplos de manejo de excepciones: bloques try/catch para distintos tipos de
 * error, un método que declara una excepción con {@code throws} y otro que la
 * lanza con {@code throw}.
 *
 * @author Israel de Jesús Santos Alvarado
 */
public class ExcepcionThrows {

    public static void main(String[] args) {
        // 1. Excepción verificada: el archivo no existe
        try {
            leerArchivo("inexistente.txt");
        } catch (IOException err) {
            System.out.println("Error de archivo: " + err);
        }

        // 2. NullPointerException: se usa una referencia nula
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (NullPointerException err) {
            System.out.println("Se presentó un error de tipo: " + err);
        }

        // 3. ClassCastException: conversión inválida entre tipos
        try {
            Object obj = "Hola";
            Integer num = (Integer) obj;
            System.out.println(num);
        } catch (ClassCastException err) {
            System.out.println("Se presentó un error de tipo ClassCastException");
        }

        // 4. Excepción lanzada con throw
        try {
            validarEdad(-5);
        } catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
        }
    }

    // "throws" avisa que el método puede lanzar una IOException
    public static void leerArchivo(String ruta) throws IOException {
        try (FileReader lector = new FileReader(ruta)) {
            System.out.println("Archivo abierto: " + ruta + " (" + lector.getEncoding() + ")");
        }
    }

    // "throw" lanza la excepción cuando el dato no es válido
    public static void validarEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
    }
}
