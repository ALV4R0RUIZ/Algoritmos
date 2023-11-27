/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_13;

/**
 *
 * @author alfre
 */
public class U4P_13 {

    public static void main(String[] args) {
        double[][] celsiusMatriz = {
            {0.0, 10.0, 20.0},
            {15.0, 25.0, 30.0},
            {5.0, 12.0, 18.0}
        };

        // Crear una segunda matriz para almacenar temperaturas en grados Fahrenheit
        double[][] fahrenheitMatriz = new double[3][3];

        // Convertir temperaturas de Celsius a Fahrenheit y almacenar en la segunda matriz
        convertirACelsiusAFahrenheit(celsiusMatriz, fahrenheitMatriz);

        // Imprimir ambas matrices
        System.out.println("Matriz de Temperaturas en Celsius:");
        imprimirMatriz(celsiusMatriz);

        System.out.println("\nMatriz de Temperaturas en Fahrenheit:");
        imprimirMatriz(fahrenheitMatriz);
    }

    // Método para convertir temperaturas de Celsius a Fahrenheit y almacenar en la segunda matriz
    static void convertirACelsiusAFahrenheit(double[][] celsiusMatriz, double[][] fahrenheitMatriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Fórmula de conversión de Celsius a Fahrenheit: (Celsius * 9/5) + 32
                fahrenheitMatriz[i][j] = (celsiusMatriz[i][j] * 9 / 5) + 32;
            }
        }
    }

    // Método para imprimir una matriz de temperaturas
    static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(String.format("%.2f", matriz[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
