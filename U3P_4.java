/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p_4;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3P_4 {

    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        int mes; //p2
        System.out.println("Escribe el dia del mes numerico");
        mes=sc.nextInt(); // p4
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;    
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
            case 8:
                System.out.println("Agosto");
            case 9:
                System.out.println("Septiembre");
            case 10:
                System.out.println("Octubre");
            case 11:
                System.out.println("Noviembre");
            case 12:
                System.out.println("Diciembre");    
                break;
                default:
        }            
    }
}
