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
### Prueba 1
![img-prueba-1](<src/Images/Captura de pantalla 2026-06-02 181356.png>) 

### Prueba 2
![img-prueba-2](<src/Images/Captura de pantalla 2026-06-02 181827.png>) 

### Prueba 3
![img-prueba-3](<src/Images/Captura de pantalla 2026-06-02 182343.png>)

## Análisis Requerido

### ¿Que algoritmo fue más rápido en el escenario desordenado?

QuickSort, ya que este divide el arreglo original en subarreglos mas pequeños y los ordena, despues une todos los subarreglos y el arreglo original queda ordenado.

### ¿Que algoritmo fue más rápido en el escenario casi ordenado?

Inserción fue más rápido porque el arreglo estaba casi ordenado y solo tuvo que reubicar el elemento desordenado en su posición correcta.

### ¿El crecimiento del tamaño de muestra afectó por igual a los dos algoritmos?

No, el crecimiento del tamaño de muestra no afectó por igual a los dos algoritmos. En el primer caso, afectó más a Inserción, ya que este ordena comparando y desplazando elementos uno por uno, por lo que su tiempo de ejecución aumenta mucho cuando el arreglo es grande y está desordenado. En cambio, QuickSort fue más rápido porque divide el arreglo en partes más pequeñas y las ordena de manera más eficiente.
En el segundo caso, afectó más a QuickSort, ya que tuvo que seguir dividiendo y procesando un arreglo que ya estaba casi ordenado. En cambio, Inserción aprovechó que la mayoría de los elementos ya estaban en su posición correcta y solo necesitó reubicar el elemento que estaba fuera de lugar, logrando tiempos de ejecución mucho menores.

### ¿Por qué Inserción puede mejorar cuando el arreglo está casi ordenado?

Inserción mejora cuando el arreglo está casi ordenado porque no necesita mover los elementos que ya están en la posición correcta. Solo realiza comparaciones y desplazamientos en los pocos elementos que se encuentran fuera de lugar.

### ¿Por qué QuickSort suele ser mejor cuando los datos están muy desordenados?

QuickSort suele ser mejor cuando los datos están muy desordenados porque divide el arreglo en varios subarreglos, los ordena por separado y al final obtiene un arreglo completamente ordenado.

## Conclusiones

- En conclusión, se comparó el rendimiento de los algoritmos Inserción y QuickSort, observando que su eficiencia depende del estado inicial del arreglo. QuickSort fue más rápido en arreglos desordenados, mientras que Inserción destacó en arreglos casi ordenados, permitiendo determinar cuál es la mejor opción según cada caso.
- También se comprobó que el tamaño de un arreglo afecta significativamente a los tiempos de ejecución de un algoritmo 
- Además, esto permitió comprender que no existe un algoritmo eficiente para todos los casos.
