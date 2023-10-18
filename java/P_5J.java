/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_5j;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class P_5J {

    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
		double f;
		
		System.out.println("Ingresa los metros a convertir: ");
		double m = M.nextDouble();
		f = m * 3.281;
		System.out.println(m+"m son iguales a: "+f+"ft");
    }
}
