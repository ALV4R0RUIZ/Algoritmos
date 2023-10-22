/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p1;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class P1 {

    public static void main(String[] args) {
      Scanner dato = new Scanner(System.in);
      int n;
      System.out.println("ingrese su edad: ");
      n = dato.nextInt();
      
      if(n>=18){
          System.out.println("es mayor de edad");
      }
      else{
          System.out.println("es menor de edad");
      }
    }
}
