/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_14;

/**
 *
 * @author alfre
 */
public class U4P_14 {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calcular la suma de todos los elementos de la matriz
        int suma = calcularSumaMatriz(matriz);

        // Imprimir la matriz y la suma
        imprimirMatriz(matriz);
        System.out.println("\nLa suma de todos los elementos de la matriz es: " + suma);
    }

    // Método para calcular la suma de todos los elementos de la matriz
    static int calcularSumaMatriz(int[][] matriz) {
        int suma = 0;

        // Iterar sobre cada elemento de la matriz y sumarlos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        return suma;
    }

    // Método para imprimir la matriz
    static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
