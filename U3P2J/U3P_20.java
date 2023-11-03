/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u3p_20;

/**
 *
 * @author alfre
 */
public class U3P_20 {

    public static void main(String[] args) {
        int diasDelAnio = 365; // Suponiendo un año no bisiesto
        double ahorroDiario = 3.0; // Ahorro inicial el 1 de enero
        double ahorroAnual = 0.0;

        for (int dia = 1; dia <= diasDelAnio; dia++) {
            ahorroAnual += ahorroDiario;
            System.out.println("Día " + dia + ": Ahorro diario = $" + ahorroDiario);
            ahorroDiario *= 3; // Triplica el ahorro para el siguiente día
        }

        System.out.println("Ahorro anual: $" + ahorroAnual);
    }
}
