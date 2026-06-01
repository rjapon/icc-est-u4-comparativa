import java.util.concurrent.Callable;

import Controllers.SortPersonaMethods;
import Models.Persona;
import Models.Resultado;
import Utils.Benchmarking;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] size = {10000, 50000, 100000};
        Persona[] arreglos = new Persona[size.length];
        Persona[] insertionCopy = new Persona[size.length];
        Persona[] quickCopy = new Persona[size.length];

        SortPersonaMethods sortMethods = new SortPersonaMethods();

        Callable<Void> insertionSort = () -> {
            sortMethods.insertionSort(insertionCopy);
            return null;
        };
    
        Resultado[] resultadosInsertion = Benchmarking.medirTiempo(insertionSort, "Insertion Sort", "Personas", size);



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
