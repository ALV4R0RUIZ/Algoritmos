/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_7;
import java.util.Arrays;
/**
 *
 * @author alfre
 */
public class U4P_7 {

    public static void main(String[] args) {
         double[] numeros = { 5, 2, 8, 1, 3 };
        double media = calcularMedia(numeros);
        double mediana = calcularMediana(numeros);
        System.out.println("Arreglo de números:");
        imprimirArreglo(numeros);
        System.out.println("\nMedia: " + media);
        System.out.println("Mediana: " + mediana);
    }

    static double calcularMedia(double[] arreglo) {
        double suma = 0;
        for (double numero : arreglo) {
            suma += numero;
        }
        return suma / arreglo.length;
    }

    static double calcularMediana(double[] arreglo) {
        // Crear una copia del arreglo para no alterar el original
        double[] arregloOrdenado = Arrays.copyOf(arreglo, arreglo.length);

        // Ordenar el arreglo para calcular la mediana
        Arrays.sort(arregloOrdenado);

        int n = arregloOrdenado.length;

        // Calcular la mediana
        if (n % 2 == 0) {
            return (arregloOrdenado[(n / 2) - 1] + arregloOrdenado[n / 2]) / 2.0;
        } else {
            return arregloOrdenado[n / 2];
        }
    }

    static void imprimirArreglo(double[] arreglo) {
        for (double numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
