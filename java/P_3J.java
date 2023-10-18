/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_3j;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class P_3J {

    public static void main(String[] args) {
        Scanner AP = new Scanner(System.in);
		float A, P;
		
		System.out.println("Ingresa el valor de la altura: ");
		float h = AP.nextFloat();
		System.out.println("Ingresa el valor de la base: ");
		float b = AP.nextFloat();
		System.out.println("Ingresa el valor del lado 1: ");
		float l1 = AP.nextFloat();
		System.out.println("Ingresa el valor del lado 2: ");
		float l2 = AP.nextFloat();
		A = (b * h) / 2;
		P = b + l1 + l2;
		System.out.println("El area es igual a: "+A);
		System.out.println("El perimetro es igual a: "+P);
    }
}
