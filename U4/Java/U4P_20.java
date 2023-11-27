/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_20;

/**
 *
 * @author alfre
 */
public class U4P_20 {

    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;

        // Crear una matriz original
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrizCopia = new int[filas][columnas];
        copiarYElevarAlCuadrado(matrizOriginal, matrizCopia);

        // Imprimir las matrices
        System.out.println("Matriz Original:");
        imprimirMatriz(matrizOriginal);

        System.out.println("\nMatriz Copia (elevada al cuadrado):");
        imprimirMatriz(matrizCopia);
    }

    // Método para copiar los datos y elevar al cuadrado
    static void copiarYElevarAlCuadrado(int[][] matrizOriginal, int[][] matrizCopia) {
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                // Copiar el valor
                matrizCopia[i][j] = matrizOriginal[i][j];

                // Elevar al cuadrado
                matrizCopia[i][j] *= matrizCopia[i][j];
            }
        }
    }

    // Método para imprimir la matriz
    static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
