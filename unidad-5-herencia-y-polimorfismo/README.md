# Unidad 5: Herencia y polimorfismo

| Paquete | Qué muestra |
|---|---|
| `herencia` | Herencia simple: `Alumno` extiende `Persona` y sobrescribe `imprimeRegistro()`. |
| `otropaquete` | Una subclase en un paquete distinto al de su clase padre. |
| `clasesabstractas` | Clases abstractas `Animal` y `Empleado` con sus subclases, y polimorfismo. |
| `figuras` | Polimorfismo con `Figura`, `Circulo`, `Cuadrado` y `Triangulo`. |
| `figurasabstractas` | Clase abstracta `FiguraAbstracta` y sus subclases. |
| `interfaces` | La interfaz `Cantante` implementada por clases distintas. |
| `personalidad` | Sustituibilidad y polimorfismo con una jerarquía de objetos. |
| `herenciaempleados` y `sueldoempleados` | Jerarquías de empleados con métodos sobrescritos. |
| `sobrecarga` | Sobrecarga de métodos (áreas y sumas). |

## Cómo ejecutarlo

Desde esta carpeta:

```
javac -d out $(find src -name '*.java')
java -cp out clasesabstractas.PruebaAnimales
```
