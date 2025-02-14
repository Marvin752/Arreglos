package Ejercicios;

public class Burbujin {

    public static int[] ordenaBurbujas(int[] numeros) {
        int n = numeros.length;
        int[] frecuencias = new int[n];

        // Primero calculamos la frecuencia de los números
        for (int i = 0; i < n; i++) {
            int contador = 0;
            for (int j = 0; j < n; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }
            frecuencias[i] = contador; // Guardamos las veces que se repitió
        }

        // Ahora vamos a ordenar numeros[] según frecuencias[] en orden descendente
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (frecuencias[j] < frecuencias[j + 1]) {
                    // Intercambio en numeros[]
                    int tempNum = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = tempNum;

                    // Intercambio en frecuencias[]
                    int tempFreq = frecuencias[j];
                    frecuencias[j] = frecuencias[j + 1];
                    frecuencias[j + 1] = tempFreq;
                }
            }
        }

        return numeros;
    }
}
