/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u4p_3;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U4P_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        String input = scanner.nextLine();

        try {
            int celsius = Integer.parseInt(input);

            int kelvin = celsius + 273;
            int fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Temperatura en grados Kelvin: " + kelvin);
            System.out.println("Temperatura en grados Fahrenheit: " + fahrenheit);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un valor válido en grados Celsius.");
        } finally {
            // Cerrar el escáner
            scanner.close();
        }
    }
}