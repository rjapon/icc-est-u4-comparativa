import java.util.concurrent.Callable;

import Controllers.SortPersonaMethods;
import Models.Persona;
import Models.Resultado;
import Utils.Benchmarking;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] size = {10000,50000, 100000};
        Persona[] arreglos = generarPersonas(size[0]);
        Persona[] insertionCopy = arreglos.clone();
        Persona[] quickCopy = arreglos.clone();

        // SortPersonaMethods sortMethods = new SortPersonaMethods();

        // Callable<Void> insertionSort = () -> {
        //     sortMethods.insertionSort(insertionCopy);
        //     return null;
        // };
    
        // Resultado resultadosInsertion = Benchmarking.medirTiempo(insertionSort, "Insertion Sort", "Personas", size[0]);
        // System.out.println(resultadosInsertion.getAlgoritmo() + ": " + resultadosInsertion.getTiempoMillis() + " ms");

        // Callable<Void> quickSort = () -> {
        //     sortMethods.quickSort(quickCopy, 0, quickCopy.length - 1);
        //     return null;
        // };

        // Resultado resultadosQuick = Benchmarking.medirTiempo(quickSort, "Quick Sort", "Personas", size[0]);
        // System.out.println(resultadosQuick.getAlgoritmo() + ": " + resultadosQuick.getTiempoMillis() + " ms");

    }

    public static void ejecutarEscenarioDesordenado(){
        // Implementar el escenario desordenado
    }
    
    public static Persona[] generarPersonas(int cantidad){
        Persona[] personas = new Persona[cantidad];

        for(int i = 0; i < cantidad; i++){
            String nombre = "Persona" + (i + 1);
            int edad = (int) (Math.random() * 101);
            personas[i] = new Persona(nombre, edad);
        }
        return personas;
    }

}
