/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_6j;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class P_6J {

    public static void main(String[] args) {
        double T = 0, ST = 0;
	final double IVA = 0.16;
	Scanner P = new Scanner(System.in);
		
	System.out.println("Ingresa el valor del primer producto: ");
	double P1 = P.nextDouble();
	System.out.println("Ingresa el valor del segundo numero: ");
	double P2 = P.nextDouble();
	System.out.println("Ingresa el valor del tercer numero: ");
	double P3 = P.nextDouble();
	T = P1 + P2 + P3;
	ST = T - (T * IVA);
	System.out.println("El precio total es: "+T);
	System.out.println("El subtotal es: "+ST);
    }
}
