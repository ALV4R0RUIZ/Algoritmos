/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_9;

/**
 *
 * @author alfre
 */
public class U4P_9 {

    public static void main(String[] args) {
        String[] nombres = { "Juan", "María", "Pedro" };
        String[] apellidos = { "Pérez", "Gómez", "López" };

        // Concatenar los arreglos
        String[] nombresCompletos = concatenarArreglos(nombres, apellidos);

        System.out.println("Arreglo de nombres completos:");
        imprimirArreglo(nombresCompletos);
    }

    static String[] concatenarArreglos(String[] arreglo1, String[] arreglo2) {
        String[] resultado = new String[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i] + " " + arreglo2[i];
        }

        return resultado;
    }

    static void imprimirArreglo(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.println(elemento);
        }
    }
}
