# Prácticas de Programación Orientada a Objetos en Java

Selección de las prácticas que hice en la materia de Programación Orientada a Objetos en mi segundo semestre de Ingeniería Informatica, ordenadas por unidad. El código está en Java y cada carpeta de unidad se puede compilar y ejecutar por separado.

## Contenido

| Unidad | Tema | Carpeta |
|---|---|---|
| 1 | Fundamentos: ciclos, condicionales y menús | [unidad-1-fundamentos](unidad-1-fundamentos) |
| 2 | Arreglos y matrices | [unidad-2-arreglos](unidad-2-arreglos) |
| 3 | Métodos, sobrecarga y encapsulamiento | [unidad-3-metodos-y-encapsulamiento](unidad-3-metodos-y-encapsulamiento) |
| 4 | Clases, objetos, constructores y excepciones | [unidad-4-clases-y-objetos](unidad-4-clases-y-objetos) |
| 5 | Herencia, clases abstractas, interfaces y polimorfismo | [unidad-5-herencia-y-polimorfismo](unidad-5-herencia-y-polimorfismo) |

## Requisitos

- JDK 8 o superior (probado compilando con `--release 8`)
- Terminal, o un IDE como NetBeans, IntelliJ IDEA o VS Code

## Cómo compilar y ejecutar

Cada unidad tiene una carpeta `src` con los paquetes. Desde la carpeta de la unidad:

```
javac -d out $(find src -name '*.java')
java -cp out paquete.NombreDeLaClase
```

Por ejemplo, en la unidad 5:

```
cd unidad-5-herencia-y-polimorfismo
javac -d out $(find src -name '*.java')
java -cp out clasesabstractas.PruebaAnimales
```

Varios programas piden los datos con ventanas (`JOptionPane`), así que necesitan entorno gráfico. También puedes abrir la carpeta `src` de una unidad directamente en tu IDE.

## Nota

Las prácticas originales se llamaban `Practica1`, `Practica2`, etc. Aquí tienen nombres descriptivos y paquetes en minúsculas. Corregí errores de lógica que tenían (ciclos infinitos, totales que no se acumulaban, mensajes equivocados) y quité código incompleto. No incluí las prácticas más básicas de cada tema para que el repositorio sea fácil de recorrer.
