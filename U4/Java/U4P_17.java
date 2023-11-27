/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_17;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U4P_17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas = 3;
        int columnas = 3;

        // Crear las matrices
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        int[][] resultado = new int[filas][columnas];

        // Solicitar valores para la matriz A
        System.out.println("Ingrese los valores para la Matriz A:");
        solicitarValoresMatriz(matrizA, scanner);

        // Solicitar valores para la matriz B
        System.out.println("Ingrese los valores para la Matriz B:");
        solicitarValoresMatriz(matrizB, scanner);

        // Realizar la multiplicación
        multiplicarMatrices(matrizA, matrizB, resultado);

        // Imprimir las matrices y el resultado
        System.out.println("\nMatriz A:");
        imprimirMatriz(matrizA);

        System.out.println("\nMatriz B:");
        imprimirMatriz(matrizB);

        System.out.println("\nResultado de la Multiplicación:");
        imprimirMatriz(resultado);

        // Cerrar el scanner
        scanner.close();
    }

    // Método para solicitar valores para una matriz
    static void solicitarValoresMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + (i + 1) + "," + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para realizar la multiplicación de dos matrices
    static void multiplicarMatrices(int[][] matrizA, int[][] matrizB, int[][] resultado) {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                int suma = 0;

                for (int k = 0; k < matrizA[0].length; k++) {
                    suma += matrizA[i][k] * matrizB[k][j];
                }

                resultado[i][j] = suma;
            }
        }
    }

    // Método para imprimir una matriz
    static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
