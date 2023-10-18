/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_8j;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class P_8J {

    public static void main(String[] args) {
        float A, P;
		Scanner H = new Scanner(System.in);
		
		System.out.println("Ingresa el valor del lado: ");
		float l = H.nextFloat();
		P = l * 6;
		System.out.println("Ingresa el valor del apotema: ");
		float a = H.nextFloat();
		A = (P * a) / 2;
		System.out.println("El perimetro es igual a: "+P);
		System.out.println("El valor del área es igual a: "+A);
    }
}
