/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u3p_21;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U3P_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            int cubo = numero * numero * numero;
            System.out.println("El cubo de " + numero + " es: " + cubo);
        }
    }
}
