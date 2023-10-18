/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_15j;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class P_15J {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del primer artículo: ");
        double precio1 = scanner.nextDouble();

        System.out.print("Ingrese el precio del segundo artículo: ");
        double precio2 = scanner.nextDouble();

        System.out.print("Ingrese el precio del tercer artículo: ");
        double precio3 = scanner.nextDouble();

        double totalCompra = precio1 + precio2 + precio3;
        double descuento = 0;

        if (totalCompra > 1500) {
            descuento = totalCompra * 0.30;
        } else if (totalCompra >= 1000 && totalCompra <= 1499) {
            descuento = totalCompra * 0.20;
        } else if (totalCompra >= 700 && totalCompra <= 999) {
            descuento = totalCompra * 0.10;
        }

        double totalAPagar = totalCompra - descuento;

        System.out.println("Total de la compra: $" + totalCompra);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalAPagar);

        scanner.close();
    }
}
