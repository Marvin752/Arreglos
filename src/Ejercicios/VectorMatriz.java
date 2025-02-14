package Ejercicios;
import java.util.*;

public class VectorMatriz {

    public static List<List<Integer>> crearMatriz(int[] numeros) {
        
        // Aquí voy a contar la frecuencia de cada número
        Map<Integer, Integer> frecuencia = new HashMap<>();

        for (int numero : numeros) {
            frecuencia.put(numero, frecuencia.getOrDefault(numero, 0) + 1);
        }

        // Vamos a determinar el mínimo de filas necesarias
        int filas = Collections.max(frecuencia.values());

        // Inicializo la matriz con la cantidad de filas necesarias
        List<List<Integer>> matriz = new ArrayList<>();
        for (int i = 0; i < filas; i++) {
            matriz.add(new ArrayList<>());
        }

        // Pongo los números en cada fila
        Map<Integer, Integer> indiceFila = new HashMap<>();
        for (int numero : numeros) {
            int fila = indiceFila.getOrDefault(numero, 0);
            matriz.get(fila).add(numero);
            indiceFila.put(numero, fila + 1);
        }

        return matriz;
    }
}
