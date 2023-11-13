/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_5;

/**
 *
 * @author alfre
 */
public class U4P_5 {

    public static void main(String[] args) {
        String[] frutas = { "Manzana", "Banana", "Naranja", "Uva", "Pera" };
        String[] frutasAlReves = new String[frutas.length];
        for (int i = 0; i < frutas.length; i++) {
            frutasAlReves[i] = frutas[frutas.length - 1 - i];
        }
        System.out.println("Frutas originales:");
        imprimirFrutas(frutas);
        System.out.println("\nFrutas al revés:");
        imprimirFrutas(frutasAlReves);
    }

    static void imprimirFrutas(String[] arreglo) {
        for (String fruta : arreglo) {
            System.out.println(fruta);
        }
    }
}