# Unidad 3: Métodos, sobrecarga y encapsulamiento

| Paquete | Qué muestra |
|---|---|
| `metodos` | Métodos estáticos que reciben parámetros y regresan valores: conversión de pesos a dólares y área de un triángulo, factorial, operaciones con una matriz de 10x10, números primos y pago de obreros con horas extra. |
| `metodosinstancia` | Métodos de instancia: `Calculadora`, `CuentaBancaria` y `Persona`. |
| `sobrecarga` | Varios métodos con el mismo nombre y distintos parámetros (áreas de círculo, cuadrado y triángulo; sumas). |
| `encapsulamiento` | Atributos privados con getters y setters, y validación en los setters (edad entre 0 y 120 en `Persona`, calificación entre 0 y 100 en `Alumno`). |

## Cómo ejecutarlo

Desde esta carpeta:

```
javac -d out $(find src -name '*.java')
java -cp out metodos.MatrizMayoresYSumas
```
