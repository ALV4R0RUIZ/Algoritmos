/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u5p_9;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U5P_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el sueldo diario y el tiempo laborado en años
        System.out.print("Ingrese el sueldo diario del trabajador: ");
        double sueldoDiario = scanner.nextDouble();

        System.out.print("Ingrese el tiempo laborado en años: ");
        int tiempoLaborado = scanner.nextInt();

        // finiquito
        double finiquito = calcularFiniquito(sueldoDiario, tiempoLaborado);

        // Mostrar el resultado
        System.out.println("\nFiniquito del trabajador:");
        System.out.println("Sueldo diario: $" + sueldoDiario);
        System.out.println("Tiempo laborado: " + tiempoLaborado + " años");
        System.out.println("Finiquito: $" + finiquito);
    }

    
    private static double calcularFiniquito(double sueldoDiario, int tiempoLaborado) {
        
        final int DIAS_POR_ANO = 365;
        final int DIAS_POR_FINIQUITO = 15;

        int diasTrabajados = tiempoLaborado * DIAS_POR_ANO;
        double finiquito = sueldoDiario * DIAS_POR_FINIQUITO * tiempoLaborado;

        return finiquito;
    }
}
