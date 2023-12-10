/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u5p_5;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U5P_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase o texto:");
        String texto = scanner.nextLine();

        int cantidadPalabras = contarPalabras(texto);

        System.out.println("La cantidad de palabras en el texto es: " + cantidadPalabras);
    }

    // Contar palabras
    private static int contarPalabras(String texto) {
        // Utilizamos el método split para dividir el texto en palabras
        String[] palabras = texto.split("\\s+");

        return palabras.length;
    }
}
