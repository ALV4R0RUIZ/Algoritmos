/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_12;

/**
 *
 * @author alfre
 */
public class U4P_12 {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir la matriz
        imprimirMatriz(matriz);
    }

    // Método para imprimir la matriz
    static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
