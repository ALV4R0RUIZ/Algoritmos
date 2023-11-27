/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_18;
import java.util.Random;

/**
 *
 * @author alfre
 */
public class U4P_18 {

    public static void main(String[] args) {
         int tamanoMatriz = 3;

        int[][] matrizCuadrada = new int[tamanoMatriz][tamanoMatriz];
        inicializarMatriz(matrizCuadrada);

        // Imprimir la matriz
        System.out.println("Matriz Cuadrada:");
        imprimirMatriz(matrizCuadrada);

        // Calcular y mostrar la suma de los elementos de la matriz
        int sumaElementos = calcularSumaMatriz(matrizCuadrada);
        System.out.println("\nLa suma de los elementos de la matriz es: " + sumaElementos);
    }

    static void inicializarMatriz(int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10) + 1; // Números aleatorios entre 1 y 10
            }
        }
    }

    // Método para calcular la suma de los elementos de la matriz
    static int calcularSumaMatriz(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        return suma;
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
