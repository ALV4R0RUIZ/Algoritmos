/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_8;
import java.util.Arrays;
/**
 *
 * @author alfre
 */
public class U4P_8 {

    public static void main(String[] args) {
       int[] numeros = { 5, 2, 8, 1, 3 };

        // Clasificar los números en pares e impares
        int[] pares, impares;
        clasificarNumeros(numeros, pares = new int[numeros.length], impares = new int[numeros.length]);

        System.out.println("Arreglo de números:");
        imprimirArreglo(numeros);
        System.out.println("\nNúmeros pares:");
        imprimirArreglo(pares);
        System.out.println("\nNúmeros impares:");
        imprimirArreglo(impares);
    }

    static void clasificarNumeros(int[] arreglo, int[] pares, int[] impares) {
        int indicePares = 0;
        int indiceImpares = 0;

        for (int numero : arreglo) {
            if (numero % 2 == 0) {
                pares[indicePares++] = numero;
            } else {
                impares[indiceImpares++] = numero;
            }
        }

        // Redimensionar los arreglos para eliminar los elementos no utilizados
        pares = Arrays.copyOf(pares, indicePares);
        impares = Arrays.copyOf(impares, indiceImpares);
    }

    static void imprimirArreglo(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
