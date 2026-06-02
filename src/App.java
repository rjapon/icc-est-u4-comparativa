import java.util.concurrent.Callable;

import Controllers.SortPersonaMethods;
import Models.Persona;
import Models.Resultado;
import Utils.Benchmarking;

public class App {
    public static void main(String[] args) throws Exception {

        int[] size = { 10000, 50000, 100000 };

        for (int s : size) {
            ejecutarEscenarioDesordenado(s);
            ejecutarEscenarioOrdenado(s);
        }

    }

    // Escenario 1: Personas desordenadas
    public static void ejecutarEscenarioDesordenado(int size) {

        Persona[] base = generarPersonas(size);
        Persona[] insertionCopy = base.clone();
        Persona[] quickCopy = base.clone();

        SortPersonaMethods sortMethods = new SortPersonaMethods();

        Callable<Void> insertionSort = () -> {
            sortMethods.insertionSort(insertionCopy);
            return null;
        };
        Resultado resultadosInsertion = Benchmarking.medirTiempo(insertionSort, "Insertion Sort", "Personas", size);
        System.out.println(
                "\nDesordenado | " + resultadosInsertion.getAlgoritmo() + " | " + resultadosInsertion.getSample() + " | " + resultadosInsertion.getTiempoMillis() + " ms");

        Callable<Void> quickSort = () -> {
            sortMethods.quickSort(quickCopy, 0, quickCopy.length - 1);
            return null;
        };
        Resultado resultadosQuick = Benchmarking.medirTiempo(quickSort, "Quick Sort", "Personas", size);
        System.out.println(
                "Desordenado | " + resultadosQuick.getAlgoritmo() + " | " + resultadosQuick.getSample() + " | " + resultadosQuick.getTiempoMillis() + " ms");

    }

    public static void ejecutarEscenarioOrdenado(int size) {

        Persona[] base = generarPersonas(size);

        SortPersonaMethods sortMethods = new SortPersonaMethods();

        sortMethods.quickSort(base, 0, base.length - 1);

        Persona[] nuevoArreglo = new Persona[base.length + 1];

        for (int i = 0; i < base.length; i++) {
            nuevoArreglo[i] = base[i];
        }

        nuevoArreglo[nuevoArreglo.length - 1] = new Persona("NuevaPersona", 100);

        Persona[] insertionCopy = nuevoArreglo.clone();
        Persona[] quickCopy = nuevoArreglo.clone();

        Callable<Void> insertionSort = () -> {
            sortMethods.insertionSort(insertionCopy);
            return null;
        };

        Resultado resultadosInsertion = Benchmarking.medirTiempo(insertionSort, "Insertion Sort", "Personas",
                nuevoArreglo.length);

        System.out.println("Casi Ordenado + 1 persona | " + resultadosInsertion.getAlgoritmo() + " | " + resultadosInsertion.getSample() + " | " + resultadosInsertion.getTiempoMillis() + " ms");

        Callable<Void> quickSort = () -> {
            sortMethods.quickSort(quickCopy, 0, quickCopy.length - 1);
            return null;
        };

        Resultado resultadosQuick = Benchmarking.medirTiempo(quickSort, "Quick Sort", "Personas", nuevoArreglo.length);

        System.out.println("Casi Ordenado + 1 persona | " + resultadosQuick.getAlgoritmo() + " | " + resultadosQuick.getSample() + " | " + resultadosQuick.getTiempoMillis() + " ms");
    }

    public static Persona[] generarPersonas(int cantidad) {
        Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {
            String nombre = "Persona" + (i + 1);
            int edad = (int) (Math.random() * 101);
            personas[i] = new Persona(nombre, edad);
        }
        return personas;
    }

}
