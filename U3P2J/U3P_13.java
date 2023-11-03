/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p_13;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U3P_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cantidadPositivos = 0;
        int cantidadNegativos = 0;
        
        for (int i = 1; i <= 100; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero > 0) {
                cantidadPositivos++;
            } else if (numero < 0) {
                cantidadNegativos++;
            }
        }
        
        System.out.println("Cantidad de números positivos: " + cantidadPositivos);
        System.out.println("Cantidad de números negativos: " + cantidadNegativos);
        
        scanner.close();
    }
}
