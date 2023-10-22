/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p_10;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U3P_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();

        System.out.print("Ingrese el pago por hora: ");
        double pagoPorHora = sc.nextDouble();

        double sueldoSemanal;

        if (horasTrabajadas <= 40) {
            sueldoSemanal = horasTrabajadas * pagoPorHora;
        } else {
            // Las primeras 40 horas se pagan normalmente
            sueldoSemanal = 40 * pagoPorHora;

            // Horas extras se pagan al doble
            int horasExtras = horasTrabajadas - 40;
            sueldoSemanal += horasExtras * (pagoPorHora * 2);
        }

        System.out.println("El sueldo semanal es: $" + sueldoSemanal);
    }
}
