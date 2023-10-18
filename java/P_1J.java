/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_1j;
import java.util.Scanner;

/**
 *
 * @author alfre
 */
public class P_1J {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumaCalificaciones = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Ingrese la calificación #" + i + ": ");
            double calificacion = scanner.nextDouble();
            sumaCalificaciones += calificacion;
        }

        double promedio = sumaCalificaciones / 6;
        System.out.println("El promedio de las calificaciones es: " + promedio);

        scanner.close();
    }
}
