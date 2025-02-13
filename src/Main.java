import Ejercicios.GrupoPersonas;
import Ejercicios.MinimoDeOperaciones;
import Ejercicios.VectorMatriz;

import java.util.Arrays;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		
		String cajas = "001011";
		int[] resultado = MinimoDeOperaciones.JuegoCajas(cajas);
		
		//Imprimo el resultado con Arrays.toString()
        System.out.println(Arrays.toString(resultado));
        
        int[] personasGrupos = {3, 3, 3, 3, 3, 1, 3};
        
        //Llamo bien gallo el metodo
        List<List<Integer>> grupos = GrupoPersonas.GrupoDePersonas(personasGrupos);
        //Imprimimos los grupos
        System.out.println(grupos);
        
        //Llamo bien chilero a mi metodazo
        int[] numeros = {1,3,4,1,2,3,1};
        List<List<Integer>> matrix = VectorMatriz.CrearMatriz(numeros);
        for(List<Integer> fila : matrix) {
        	System.out.println(fila);
        }
        
      
       
	}

}
