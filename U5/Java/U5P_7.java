/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u5p_7;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U5P_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el precio y la cantidad de productos
        System.out.print("Ingrese el precio unitario del producto: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = scanner.nextInt();

        //  Subtotal
        double subtotal = calcularSubtotal(precioUnitario, cantidad);

        // IVA
        double iva = calcularIVA(subtotal);

        // Total
        double total = calcularTotal(subtotal, iva);

        // resultados
        System.out.println("\nDetalles de la Factura:");
        System.out.println("Precio Unitario: $" + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (16%): $" + iva);
        System.out.println("Total: $" + total);
    }

    // Subtotal
    private static double calcularSubtotal(double precioUnitario, int cantidad) {
        return precioUnitario * cantidad;
    }

    //  IVA (16%)
    private static double calcularIVA(double subtotal) {
        final double PORCENTAJE_IVA = 0.16;
        return subtotal * PORCENTAJE_IVA;
    }

    // Función para calcular el Total
    private static double calcularTotal(double subtotal, double iva) {
        return subtotal + iva;
    }
}
