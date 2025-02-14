import Ejercicios.Burbujin;
import Ejercicios.GrupoPersonas;
import Ejercicios.MinimoDeOperaciones;
import Ejercicios.VectorMatriz;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                // Menú de opciones
                System.out.println("===== MENÚ =====");
                System.out.println("1 - Calcular movimientos de cajas");
                System.out.println("2 - Agrupar personas por tamaño de grupo");
                System.out.println("3 - Crear matriz 2D con enteros distintos");
                System.out.println("4 - Ordenar por frecuencia con burbuja");
                System.out.println("5 - Salir \n");
                System.out.print("Elige una opción: ");
                opcion = scanner.nextInt();

                if (opcion != 5) {
                    switch (opcion) {
                        case 1:
                            // Opción 1: Calcular movimientos de cajas
                            String cajas = "001011";  // Cadena de cajas ya inicializada
                            int[] resultadoCajas = MinimoDeOperaciones.juegoCajas(cajas);
                            System.out.println("\n" + "Movimientos: " + Arrays.toString(resultadoCajas));
                            break;

                        case 2:
                            // Opción 2: Agrupar personas por tamaño de grupo
                            int[] personasGrupos = {3, 3, 3, 3, 3, 1, 3};
                            List<List<Integer>> grupos = GrupoPersonas.grupoDePersonas(personasGrupos);
                            System.out.println("\n" + "Grupos formados: " + grupos);
                            break;

                        case 3:
                            // Opción 3: Crear matriz 2D con enteros distintos
                            int[] numeros = {1, 3, 4, 1, 2, 3, 1};
                            List<List<Integer>> matriz = VectorMatriz.crearMatriz(numeros);
                            System.out.println();
                            System.out.println("Matriz generada:");
                            for (List<Integer> fila : matriz) {
                                System.out.println(fila);
                            }
                            break;
                            
                        case 4:
                            // Opción 4: Ordenar por frecuencia con burbuja
                            int[] nums = {4, 3, 1, 6, 3, 4, 4, 6};
                            int[] resultadoNums = Burbujin.ordenaBurbujas(nums);
                            System.out.println("\n" + "Ordenado por frecuencia: " + Arrays.toString(resultadoNums));
                            break;

                        default:
                            System.out.println("\nOpción no válida\n");
                            break;
                    }
                    
                    // Esperar a que el usuario presione ENTER antes de continuar
                    System.out.println("\nPresiona ENTER para volver al menú.");
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    scanner.nextLine(); // Esperar el Enter
                }

            } catch (Exception e) {
                System.out.println("\nOpción no válida\n");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        } while (opcion != 5);

        System.out.println("\nGracias por usar el programa");
        scanner.close();
    }
}