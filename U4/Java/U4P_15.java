/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_15;
import java.util.Random;
/**
 *
 * @author alfre
 */
public class U4P_15 {

    public static void main(String[] args) {
        int[][] matriz = generarMatriz(3, 4);

        // Imprimir la matriz
        imprimirMatriz(matriz);

        // Calcular y mostrar la media de cada fila
        calcularMediaPorFila(matriz);
    }

    static int[][] generarMatriz(int filas, int columnas) {
        Random random = new Random();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        return matriz;
    }

    // Método para imprimir la matriz
    static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Método para calcular y mostrar la media de cada fila
    static void calcularMediaPorFila(int[][] matriz) {
        System.out.println("\nMedia de cada fila:");

        for (int i = 0; i < matriz.length; i++) {
            double suma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }

            double media = suma / matriz[i].length;
            System.out.printf("Fila %d: %.2f\n", i + 1, media);
        }
    }
}
