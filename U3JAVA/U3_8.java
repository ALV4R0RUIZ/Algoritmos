/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_8;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U3_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;

        System.out.print("Ingresa el primer número: ");
        numero1 = sc.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        numero2 = sc.nextDouble();

        if (numero1 > numero2) {
            System.out.println("El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ").");
        } else if (numero2 > numero1) {
            System.out.println("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ").");
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}
