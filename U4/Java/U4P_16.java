/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_16;

/**
 *
 * @author alfre
 */
public class U4P_16 {

    public static void main(String[] args) {
        char[][] matrizCaracteres = {
            {'A', 'B', 'C', 'D'},
            {'E', 'F', 'G', 'H'},
            {'I', 'J', 'K', 'L'}
        };

        // Imprimir la matriz original
        System.out.println("Matriz Original:");
        imprimirMatriz(matrizCaracteres);

        // Imprimir la matriz al revés
        System.out.println("\nMatriz al Revés:");
        imprimirMatrizAlReves(matrizCaracteres);
    }

    // Método para imprimir la matriz de caracteres
    static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para imprimir la matriz de caracteres al revés
    static void imprimirMatrizAlReves(char[][] matriz) {
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
