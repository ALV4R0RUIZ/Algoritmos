/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p_17;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3P_17 {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        char opcion;
        do{
        System.out.println("Bienvenido a una sola ejecucion");
        System.out.println("¡¡¡Escribe n para salir!!!");
        opcion=sc.next().charAt(0);//1 CARACTER
        }while(opcion !='n');
    }
}
