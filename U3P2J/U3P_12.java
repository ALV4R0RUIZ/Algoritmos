/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p_12;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3P_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);//p1
        int c, total, num; //p2
        System.out.println("Escribe el total de numero a procesar");
        total= sc.nextInt();//p4
        for(c=1; c<=total; c++){
        System.out.println("Escribe un numero");
        num= sc.nextInt(); //5
        if(num%2 == 0)
            System.out.println("Es par");
    else
             System.out.println("Impar");
        }
    }
}
