/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_2;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class P_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        
        int c1, c2, c3, c4, c5, c6, prom;
        
        System.out.println("Ingresa la primer calificacion:");
        c1 = sc.nextInt();
        
        System.out.println("Ingresa la segunda calificacion:");
        c2 = sc.nextInt();
        
        System.out.println("Ingresa la tercer calificacion:");
        c3 = sc.nextInt();
        
        System.out.println("Ingresa la cuarta calificacion:");
        c4 = sc.nextInt();
        
        System.out.println("Ingresa la quinta calificacion:");
        c5 = sc.nextInt();
        
        System.out.println("Ingresa la sexta calificacion:");
        c6 = sc.nextInt();
        
        prom=(c1+c2+c3+c4+c5+c6)/6;
        
        if (prom>=70){
            System.out.println("Aprobado");
        }
        else {
            System.out.println("Reprobado");
        }
    }
}
