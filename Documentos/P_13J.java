/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_13j;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class P_13J {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumaCalificaciones = 0;
        int numeroCalificaciones = 6;

        for (int i = 1; i <= numeroCalificaciones; i++) {
            System.out.print("Ingrese la calificación #" + i + ": ");
            double calificacion = scanner.nextDouble();
            sumaCalificaciones += calificacion;
        }

        double promedio = sumaCalificaciones / numeroCalificaciones;

        System.out.println("El promedio de las calificaciones es: " + promedio);

        if (promedio >= 70) {
            System.out.println("Aprobó la materia.");
        } else {
            System.out.println("Reprobó la materia.");
        }

        scanner.close();
    }
}
