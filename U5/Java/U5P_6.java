/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u5p_6;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U5P_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de términos en la secuencia Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Secuencia Fibonacci de " + n + " términos:");
        imprimirFibonacci(n);
    }

    // Función para generar la secuencia Fibonacci
    private static void imprimirFibonacci(int n) {
        int primero = 0, segundo = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(primero + " ");

            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}
