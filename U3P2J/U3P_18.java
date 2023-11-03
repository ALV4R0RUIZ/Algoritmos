/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p_18;

/**
 *
 * @author alfre
 */
public class U3P_18 {

    public static void main(String[] args) {
        double salarioInicial = 1500.0;
        double incrementoAnual = 0.10;
        int numeroAnios = 6;

        System.out.println("Salario inicial: $" + salarioInicial);

        double salarioTotal = salarioInicial;
        
        for (int anio = 1; anio <= numeroAnios; anio++) {
            double salarioAnual = salarioTotal * (1 + incrementoAnual);
            salarioTotal = salarioAnual;
            System.out.println("Salario en el año " + anio + ": $" + salarioAnual);
        }
        
        System.out.println("Salario al cabo de " + numeroAnios + " años: $" + salarioTotal);
    }
}
