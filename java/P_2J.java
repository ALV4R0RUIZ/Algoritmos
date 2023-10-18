/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_2j;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class P_2J {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
		float x;
		
		System.out.println("Ingresa el numero 'y': ");
		float y = f.nextFloat();
		System.out.println("Ingresa el numero 'a': ");
		float a = f.nextFloat();
		x = y + a + 3;
		System.out.println("La suma de los numeros es: "+x);
    }
}
