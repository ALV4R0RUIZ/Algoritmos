/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_12j;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class P_12J {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese la temperatura actual en grados Celsius: ");
        double temperatura = scanner.nextDouble();

        if (temperatura > 27) {
            System.out.println("Hace calor.");
        } else if (temperatura > 20 && temperatura <= 27) {
            System.out.println("Clima agradable.");
        } else {
            System.out.println("Clima fresco o frío.");
        }

        scanner.close();
    }
}
