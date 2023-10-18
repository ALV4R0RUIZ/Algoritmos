/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_11j;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class P_11J {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }
        } else {
            System.out.println("El número ingresado no es un entero positivo.");
        }

        scanner.close();
    }
}
