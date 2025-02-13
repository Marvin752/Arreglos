package Ejercicios;
import java.util.*;

public class VectorMatriz {

	public static List<List<Integer>> CrearMatriz(int[] numeros)
	{
		
		//Aqui voy a contar la frecuencia de cada número
		Map<Integer, Integer> repeticion = new HashMap<>();
		
		for(int numero : numeros)
		{
			repeticion.put(numero, repeticion.getOrDefault(numero, 0) + 1);
		}
		
		//Vamos a determinar el minimo de filas necesarias
		int filas = Collections.max(repeticion.values());
		
		//Aca inicializo la matriz con la cantidad de filas necesarias
		
		List<List<Integer>> respuesta = new ArrayList<>();
		for(int i = 0; i < filas; i++)
		{
			respuesta.add(new ArrayList<>());
		}
		
		//Pongo los numeros en cada fila
		Map<Integer, Integer> indiceFila = new HashMap<>();
		for(int numero: numeros)
		{
			int fila = indiceFila.getOrDefault(numero, 0);
			respuesta.get(fila).add(numero);
			indiceFila.put(numero, fila + 1);
		}
		
		return respuesta;
		
	}
	
}
