/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u5p_2;
import java.util.Scanner;

/**
 *
 * @author alfre
 */
public class U5P_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los coeficientes de la ecuación cuadrática
        System.out.println("Ingrese los coeficientes de la ecuación cuadrática ax^2 + bx + c = 0:");

        System.out.print("Coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Coeficiente c: ");
        double c = scanner.nextDouble();

       
        double discriminante = b * b - 4 * a * c;

        
        if (discriminante > 0) {
            // Dos raíces reales distintas
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Las raíces reales son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            
            double raiz = -b / (2 * a);

            System.out.println("La raíz doble real es: " + raiz);
        } else {
            // Raíces
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(Math.abs(discriminante)) / (2 * a);

            System.out.println("Las raíces complejas son: " + parteReal + " + " + parteImaginaria + "i y " +
                    parteReal + " - " + parteImaginaria + "i");
        }
    }
}
