/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_4j;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class P_4J {

    public static void main(String[] args) {
        Scanner G = new Scanner(System.in);
		double gf;
		
		System.out.println("Ingresa los grados celcius a convertir: ");
		double gc = G.nextFloat();
		gf = (gc * 1.8) + 32;
		System.out.println(gc+"°C son iguales a: "+gf+"°F.");
    }
}
