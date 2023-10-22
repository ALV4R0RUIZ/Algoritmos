/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_7;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U3_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura;

        System.out.print("Ingresa la temperatura actual en grados Celsius: ");
        temperatura = sc.nextDouble();

        if (temperatura > 27) {
            System.out.println("Hace calor.");
        } else if (temperatura > 20) {
            System.out.println("Clima agradable.");
        } else {
            System.out.println("Clima fresco o frío.");
        }
    }
}
