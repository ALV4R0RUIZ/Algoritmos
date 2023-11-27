/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_19;
import java.util.Random;
/**
 *
 * @author alfre
 */
public class U4P_19 {

    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;

        // Crear una matriz
        int[][] matriz = new int[filas][columnas];

        inicializarMatriz(matriz);

        // Imprimir la matriz
        System.out.println("Matriz:");
        imprimirMatriz(matriz);
        contarParesEImpares(matriz);
    }

    static void inicializarMatriz(int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100) + 1; // Números aleatorios entre 1 y 100
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

    // Método para contar la cantidad de números pares e impares en la matriz
    static void contarParesEImpares(int[][] matriz) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
