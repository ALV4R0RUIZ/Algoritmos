/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.u5p_3;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class U5P_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar menú
            System.out.println("\nMenú de Convertidor:");
            System.out.println("1. Convertir Temperatura");
            System.out.println("2. Convertir Longitud");
            System.out.println("3. Convertir Peso");
            System.out.println("4. Salir");

            // Leer la opción 
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirTemperatura();
                    break;
                case 2:
                    convertirLongitud();
                    break;
                case 3:
                    convertirPeso();
                    break;
                case 4:
                    System.out.println("Gracias por usar el convertidor. ¡Hasta luego!");
                    System.exit(0);  // Salir 
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    // Método para convertir temperatura
    private static void convertirTemperatura() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();

        // Fórmula de conversión de Celsius a Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit + " °F");
    }

    // Método para convertir longitud
    private static void convertirLongitud() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud en metros: ");
        double metros = scanner.nextDouble();

        // Fórmula de conversión de metros a pulgadas
        double pulgadas = metros * 39.37;

        System.out.println("La longitud en pulgadas es: " + pulgadas + " in");
    }

    // Método para convertir peso
    private static void convertirPeso() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso en kilogramos: ");
        double kilogramos = scanner.nextDouble();

       
        double libras = kilogramos * 2.20462;

        System.out.println("El peso en libras es: " + libras + " lb");
    }
}
