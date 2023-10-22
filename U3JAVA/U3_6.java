/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_6;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U3_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Ingresa un número entero positivo: ");
        numero = sc.nextInt();

        if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }
        } else {
            System.out.println("El número ingresado no es un entero positivo.");
        }    
    }
}
