/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u5p_10;
import java.security.SecureRandom;
/**
 *
 * @author alfre
 */
public class U5P_10 {

    public static void main(String[] args) {
        int longitudContraseña = 12;

        // Generar y mostrar una contraseña aleatoria
        String contraseñaGenerada = generarContraseña(longitudContraseña);
        System.out.println("Contraseña generada: " + contraseñaGenerada);
    }

    // Función para generar una contraseña aleatoria
    private static String generarContraseña(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";

        SecureRandom random = new SecureRandom();
        StringBuilder contraseña = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            contraseña.append(caracterAleatorio);
        }

        return contraseña.toString();
    }
}
