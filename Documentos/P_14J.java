/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_14j;
import java.util.Scanner;

/**
 *
 * @author alfre
 */
public class P_14J {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Por favor, ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero1 > numero2) {
            System.out.println("El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ").");
        } else if (numero2 > numero1) {
            System.out.println("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ").");
        } else {
            System.out.println("Ambos números son iguales (" + numero1 + ").");
        }

        scanner.close();
    }
}
