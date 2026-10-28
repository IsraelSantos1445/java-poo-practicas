# Unidad 2: Arreglos y matrices

Arreglos de una, dos y tres dimensiones, con acumuladores por renglón, por columna y totales.

| Clase | Qué hace |
|---|---|
| `VentasPorVendedorYTrimestre` | Matriz de ventas de 5 vendedores en 4 trimestres, con totales por vendedor, por trimestre y general. |
| `VentasPorSucursal` | Arreglo tridimensional de ventas (vendedor, trimestre, sucursal) con totales por sucursal y general. |
| `PosicionDelMayorEnMatriz` | Lee una matriz de 10x10 y encuentra la posición del número mayor. |
| `SumaDeRenglonesYColumnas` | Matriz de 7x7 con vectores de la suma de cada renglón y de cada columna. |
| `ColumnaConMayorSuma` | Matriz de 20x20 y columna con la máxima suma. |
| `VentasPorTiendaYDeporte` | Ventas de 50 tiendas por 20 deportes, con totales por tienda y por deporte. |
| `AprobadosYNivelacion` | Calificaciones de 50 alumnos en 5 parciales: aprobados, nivelación y máxima calificación. |

## Cómo ejecutarlo

Desde esta carpeta:

```
javac -d out $(find src -name '*.java')
java -cp out arreglos.VentasPorSucursal
```
