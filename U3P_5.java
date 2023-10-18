/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p_5;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3P_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p1, p2, p3, total;
        System.out.print("Esceibe el precio 1:");
        p1=sc.nextDouble();  //paso4
        System.out.print("Esceibe el precio 2:");
        p2=sc.nextDouble();  //paso4
        System.out.print("Esceibe el precio 3:");
        p3=sc.nextDouble();  //paso4
        total = p1 +p2 +p3;  //paso 5
        if (total>=1500){
            total = total - (total * 0.30);
            System.out.println("El total (30%):"+total);
        }else if (total<1500 && total>=1000){
            total = total - (total * 0.20);
            System.out.println("El total (20%):"+total);
        }else if (total<1000 && total<=700) { // paso 8
            total = total - (total * 0.10);
            System.out.println("El total (10%):"+total);
        } else{ // paso 9
            System.out.println("El total (sin descuento):"+total);
        }
    }
}
