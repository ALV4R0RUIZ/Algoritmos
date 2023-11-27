using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_13
    {
        static void Main(string[] args)
        {
            double[,] celsiusMatriz = {
            {0.0, 10.0, 20.0},
            {15.0, 25.0, 30.0},
            {5.0, 12.0, 18.0}
        };

            // Crear una segunda matriz para almacenar temperaturas en grados Fahrenheit
            double[,] fahrenheitMatriz = new double[3, 3];

            // Convertir temperaturas de Celsius a Fahrenheit y almacenar en la segunda matriz
            ConvertirACelsiusAFahrenheit(celsiusMatriz, fahrenheitMatriz);

            // Imprimir ambas matrices
            Console.WriteLine("Matriz de Temperaturas en Celsius:");
            ImprimirMatriz(celsiusMatriz);

            Console.WriteLine("\nMatriz de Temperaturas en Fahrenheit:");
            ImprimirMatriz(fahrenheitMatriz);

            // Esperar a que el usuario presione una tecla antes de cerrar la aplicación
            Console.ReadKey();
        }

        // Método para convertir temperaturas de Celsius a Fahrenheit y almacenar en la segunda matriz
        static void ConvertirACelsiusAFahrenheit(double[,] celsiusMatriz, double[,] fahrenheitMatriz)
        {
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    // Fórmula de conversión de Celsius a Fahrenheit: (Celsius * 9/5) + 32
                    fahrenheitMatriz[i, j] = (celsiusMatriz[i, j] * 9 / 5) + 32;
                }
            }
        }

        // Método para imprimir una matriz de temperaturas
        static void ImprimirMatriz(double[,] matriz)
        {
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    Console.Write(matriz[i, j].ToString("F2") + " ");
                }
                Console.WriteLine();
            }
        }
    }
}