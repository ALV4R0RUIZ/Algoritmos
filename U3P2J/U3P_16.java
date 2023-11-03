/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p_16;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3P_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=1, horas, pago, sueldo;
        
        System.out.println("captura las oras trabajadas");
        horas= sc.nextInt();
        System.out.println("captura el pago x por hora");
        pago= sc.nextInt();
        sueldo=horas*pago;
        System.out.println("tu sueldo es:"+sueldo);
        c++;
    }
}
