/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p_9;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U3P_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la hora de entrada: ");
        int horaEntrada = sc.nextInt();

        System.out.print("Ingrese la hora de salida: ");
        int horaSalida = sc.nextInt();

        int horasEstacionamiento = horaSalida - horaEntrada;

        double costoTotal = 0.0;

        if (horasEstacionamiento <= 2) {
            costoTotal = horasEstacionamiento * 5.0;
        } else if (horasEstacionamiento <= 5) {
            costoTotal = (2 * 5.0) + ((horasEstacionamiento - 2) * 4.0);
        } else if (horasEstacionamiento <= 10) {
            costoTotal = (2 * 5.0) + (3 * 4.0) + ((horasEstacionamiento - 5) * 3.0);
        } else {
            costoTotal = (2 * 5.0) + (3 * 4.0) + (5 * 3.0) + ((horasEstacionamiento - 10) * 2.0);
        }

        System.out.println("Horas de estacionamiento: " + horasEstacionamiento);
        System.out.println("El costo total es de: $" + costoTotal);
    }
}
