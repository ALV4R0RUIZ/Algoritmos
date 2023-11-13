/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_4;

/**
 *
 * @author alfre
 */
public class U4P_4 {

    public static void main(String[] args) {
        int[] numeros = { 5, -2, 0, -8, 10, -4, 7, -1 };

        // Contador para almacenar el total de números negativos
        int totalNegativos = 0;
        for (int numero : numeros) {
            if (numero < 0) {
                totalNegativos++;
            }
        }
        System.out.println("El total de números negativos en el arreglo es: " + totalNegativos);
    }
}
