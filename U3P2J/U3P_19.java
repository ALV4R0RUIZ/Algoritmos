/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p_19;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U3P_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números (N): ");
        int N = scanner.nextInt();

        int cantCero = 0;
        int cantMayoresCero = 0;
        int cantMenoresCero = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();

            if (numero == 0) {
                cantCero++;
            } else if (numero > 0) {
                cantMayoresCero++;
            } else {
                cantMenoresCero++;
            }
        }

        System.out.println("Cantidad de números iguales a cero: " + cantCero);
        System.out.println("Cantidad de números mayores a cero: " + cantMayoresCero);
        System.out.println("Cantidad de números menores a cero: " + cantMenoresCero);
    }
}
