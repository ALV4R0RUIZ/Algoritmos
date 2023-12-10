using System;

namespace U5P_3
{
    class U5P_5
    {
        static void Main(string[] args)
        {
            while (true)
            {
                // Mostrar menú
                Console.WriteLine("\nMenú de Convertidor:");
                Console.WriteLine("1. Convertir Temperatura");
                Console.WriteLine("2. Convertir Longitud");
                Console.WriteLine("3. Convertir Peso");
                Console.WriteLine("4. Salir");

                // Leer la opción 
                Console.Write("Seleccione una opción: ");
                int opcion = Convert.ToInt32(Console.ReadLine());

                switch (opcion)
                {
                    case 1:
                        ConvertirTemperatura();
                        break;
                    case 2:
                        ConvertirLongitud();
                        break;
                    case 3:
                        ConvertirPeso();
                        break;
                    case 4:
                        Console.WriteLine("Gracias por usar el convertidor. ¡Hasta luego!");
                        Environment.Exit(0);  // Salir 
                        break;
                    default:
                        Console.WriteLine("Opción no válida. Inténtelo de nuevo.");
                        break;
                }
            }
        }

        // Método para convertir temperatura
        private static void ConvertirTemperatura()
        {
            Console.Write("Ingrese la temperatura en Celsius: ");
            double celsius = Convert.ToDouble(Console.ReadLine());

            // Fórmula de conversión de Celsius a Fahrenheit
            double fahrenheit = (celsius * 9 / 5) + 32;

            Console.WriteLine("La temperatura en Fahrenheit es: " + fahrenheit + " °F");
        }

        // Método para convertir longitud
        private static void ConvertirLongitud()
        {
            Console.Write("Ingrese la longitud en metros: ");
            double metros = Convert.ToDouble(Console.ReadLine());

            // Fórmula de conversión de metros a pulgadas
            double pulgadas = metros * 39.37;

            Console.WriteLine("La longitud en pulgadas es: " + pulgadas + " in");
        }

        // Método para convertir peso
        private static void ConvertirPeso()
        {
            Console.Write("Ingrese el peso en kilogramos: ");
            double kilogramos = Convert.ToDouble(Console.ReadLine());

            // Fórmula de conversión de kilogramos a libras
            double libras = kilogramos * 2.20462;

            Console.WriteLine("El peso en libras es: " + libras + " lb");
        }
    }
}
