/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_10;

/**
 *
 * @author alfre
 */
public class U4P_10 {

    public static void main(String[] args) {
        String[] paises = { "Argentina", "Brasil", "Chile", "México", "Perú" };
        double longitudPromedio = calcularLongitudPromedio(paises);
        System.out.println("Arreglo de nombres de países:");
        imprimirArreglo(paises);
        System.out.println("\nLongitud promedio de las palabras: " + longitudPromedio);
    }

    static double calcularLongitudPromedio(String[] arreglo) {
        int totalCaracteres = 0;
        for (String palabra : arreglo) {
            totalCaracteres += palabra.length();
        }
        return (double) totalCaracteres / arreglo.length;
    }

    static void imprimirArreglo(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}