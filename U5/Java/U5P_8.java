/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u5p_8;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U5P_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas veces deseas simular el lanzamiento de dados? ");
        int vecesASimular = scanner.nextInt();

        for (int i = 1; i <= vecesASimular; i++) {
            System.out.println("\nSimulación " + i + ":");
            lanzarDados();
        }
    }

   
    private static void lanzarDados() {
        Random random = new Random();

       
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;

        // resultados 
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Total: " + (dado1 + dado2));
    }
}
