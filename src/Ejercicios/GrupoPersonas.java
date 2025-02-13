package Ejercicios;
import java.util.*;

public class GrupoPersonas {

	public static List<List<Integer>> GrupoDePersonas(int[] tamanoGrupo){
		//Con esto almaceno los grupos por tamaño
		Map<Integer, List<Integer>> map = new HashMap<>();
		List<List<Integer>> resultado = new ArrayList<>();
		
		//Aca recorro la lista de tamanoGrupo
		
		for(int i = 0; i < tamanoGrupo.length; i++)
		{
			int grupoTamano = tamanoGrupo[i];
			
			//Si el tamaño del grupo no existe, lo creamos
			if(!map.containsKey(grupoTamano)) {
				map.put(grupoTamano, new ArrayList<>());
			}
			
			//Con esto agrego a la persona al grupo que le toca
			map.get(grupoTamano).add(i);
			
			//En caso que el grupo tenga el tamaño deseado, lo agregamos a la respuesta
			if(map.get(grupoTamano).size() == grupoTamano)
			{
				resultado.add(new ArrayList<>(map.get(grupoTamano)));
				map.get(grupoTamano).clear(); //Reinicio el grupo
			}
				
		}
		return resultado;
	}
	
}
