# Práctica  de Tiempos

### Estudiante: Richard Japón

## Resultados obtenidos

### Tabla 1. Escenario 1: arreglo completamente desordenado.

    | Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido |                   Observación                   |
    |-------------------|------------------|------------------|----------------------|-------------------------------------------------|
    | 10.000            | 241.9594 ms      | 3.3767 ms        | QuickSort            | QuickSort es mas rapido en listas desordenadas  |
    |-------------------|------------------|------------------|----------------------|------------------------------------------------ |
    | 50.000            | 9423.0822 ms     | 21.8176 ms       | QuickSort            | QuickSort sigue siendo rapido en arreglos mas   |
    |                   |                  |                  |                      | grandes                                         |
    |-------------------|------------------|------------------|----------------------|-------------------------------------------------|
    | 100.000           | 39746.125 ms     | 59.8854 ms       | QuickSort            | QuickSort predomina en ordenar arreglos muy     |
    |                   |                  |                  |                      | grandes                                         |

### Tabla 2. Escenario 2: arreglo ordenado más una nueva persona.    

    | Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido |                   Observación                   |
    |-------------------|------------------|------------------|----------------------|-------------------------------------------------|
    | 10.001            | 0.2331 ms        | 1.1733 ms        | Inserción            | Inserción es más rapido porque aprovecha que    |
    |                   |                  |                  |                      | el arreglo esta casi ordenado                   |
    |-------------------|------------------|------------------|----------------------|-------------------------------------------------|
    | 50.001            | 2.3962 ms        | 18.8054 ms       | Inserción            | Inserción sigue siendo rapido porque hace       |
    |                   |                  |                  |                      | menos esfuerzo                                  |
    |-------------------|------------------|------------------|----------------------|-------------------------------------------------|
    | 100.001           | 2.1237 ms        | 50.984 ms        | Inserción            | Inserción es más rapido en arreglos casi        |
    |                   |                  |                  |                      | ordenados                                       |
    
## Imagenes de las pruebas

![img-prueba-1](<src/Images/Captura de pantalla 2026-06-02 181356.png>)
![img-prueba-2](<src/Images/Captura de pantalla 2026-06-02 181827.png>)
![img-prueba-3](<src/Images/Captura de pantalla 2026-06-02 182343.png>)

## Análisis Requerido

### ¿Que algoritmo fue mas rápido en el escenario desordenado?


