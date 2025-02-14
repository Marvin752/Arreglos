package Ejercicios;
import java.util.*;

public class GrupoPersonas {

    public static List<List<Integer>> grupoDePersonas(int[] tamanoGrupo) {
        // Con esto almaceno los grupos por tamaño
        Map<Integer, List<Integer>> grupos = new HashMap<>();
        List<List<Integer>> resultado = new ArrayList<>();

        // Recorro la lista de tamanoGrupo
        for (int i = 0; i < tamanoGrupo.length; i++) {
            int grupoTamano = tamanoGrupo[i];

            // Si el tamaño del grupo no existe, lo creamos
            if (!grupos.containsKey(grupoTamano)) {
                grupos.put(grupoTamano, new ArrayList<>());
            }

            // Agrego a la persona al grupo que le toca
            grupos.get(grupoTamano).add(i);

            // En caso de que el grupo tenga el tamaño deseado, lo agregamos al resultado
            if (grupos.get(grupoTamano).size() == grupoTamano) {
                resultado.add(new ArrayList<>(grupos.get(grupoTamano)));
                grupos.get(grupoTamano).clear(); // Reinicio el grupo
            }
        }
        return resultado;
    }
}
