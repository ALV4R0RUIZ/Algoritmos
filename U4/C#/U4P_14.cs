using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_14
    {
        static void Main(string[] args)
        {
            int[,] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

            // Calcular la suma de todos los elementos de la matriz
            int suma = CalcularSumaMatriz(matriz);

            // Imprimir la matriz y la suma
            ImprimirMatriz(matriz);
            Console.WriteLine("\nLa suma de todos los elementos de la matriz es: " + suma);

            // Esperar a que el usuario presione una tecla antes de cerrar la aplicación
            Console.ReadKey();
        }

        // Método para calcular la suma de todos los elementos de la matriz
        static int CalcularSumaMatriz(int[,] matriz)
        {
            int suma = 0;

            // Iterar sobre cada elemento de la matriz y sumarlos
            for (int i = 0; i < matriz.GetLength(0); i++)
            {
                for (int j = 0; j < matriz.GetLength(1); j++)
                {
                    suma += matriz[i, j];
                }
            }

            return suma;
        }

        // Método para imprimir la matriz
        static void ImprimirMatriz(int[,] matriz)
        {
            Console.WriteLine("Matriz:");

            for (int i = 0; i < matriz.GetLength(0); i++)
            {
                for (int j = 0; j < matriz.GetLength(1); j++)
                {
                    Console.Write(matriz[i, j] + " ");
                }
                Console.WriteLine();
            }
        }
    }
}