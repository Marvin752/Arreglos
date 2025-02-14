package Ejercicios;

public class MinimoDeOperaciones {

    public static int[] juegoCajas(String cajas) {
        int n = cajas.length();
        int[] respuesta = new int[n];

        int movimientos = 0; // Contará cada uno de los movimientos necesarios
        int cantidadPelotas = 0; // Esto será la cantidad de bolas encontradas

        // Un recorrido de izquierda a derecha
        for (int i = 0; i < n; i++) {
            respuesta[i] += movimientos; // Acá guardo cuántos movimientos van
            cantidadPelotas += (cajas.charAt(i) == '1') ? 1 : 0; // Si hay bola, aumentará el conteo
            movimientos += cantidadPelotas; // Vamos contando los movimientos
        }

        movimientos = 0;
        cantidadPelotas = 0;

        // Un recorrido de derecha a izquierda
        for (int i = n - 1; i >= 0; i--) {
            respuesta[i] += movimientos; // Acá guardo cuántos movimientos van
            cantidadPelotas += (cajas.charAt(i) == '1') ? 1 : 0; // Si hay bola, aumentará el conteo
            movimientos += cantidadPelotas; // Vamos contando los movimientos
        }

        return respuesta;
    }
}
