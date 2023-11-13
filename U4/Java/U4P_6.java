/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_6;
import java.util.Arrays;
/**
 *
 * @author alfre
 */
public class U4P_6 {

    public static void main(String[] args) {
        int[] numeros = { 5, 2, 8, 1, 3 };
        ordenarArreglo(numeros);
        System.out.println("Arreglo ordenado de menor a mayor:");
        imprimirArreglo(numeros);
    }

    static void ordenarArreglo(int[] arreglo) {
        int[] arregloAuxiliar = Arrays.copyOf(arreglo, arreglo.length);
        Arrays.sort(arregloAuxiliar);
        System.arraycopy(arregloAuxiliar, 0, arreglo, 0, arreglo.length);
    }

    static void imprimirArreglo(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
