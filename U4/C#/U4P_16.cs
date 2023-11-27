using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_16
    {
        static void Main(string[] args)
        {
            char[,] matrizCaracteres = {
            {'A', 'B', 'C', 'D'},
            {'E', 'F', 'G', 'H'},
            {'I', 'J', 'K', 'L'}
        };

            // Imprimir la matriz original
            Console.WriteLine("Matriz Original:");
            ImprimirMatriz(matrizCaracteres);

            // Imprimir la matriz al revés
            Console.WriteLine("\nMatriz al Revés:");
            ImprimirMatrizAlReves(matrizCaracteres);

            // Esperar a que el usuario presione una tecla antes de cerrar la aplicación
            Console.ReadKey();
        }

        // Método para imprimir la matriz de caracteres
        static void ImprimirMatriz(char[,] matriz)
        {
            for (int i = 0; i < matriz.GetLength(0); i++)
            {
                for (int j = 0; j < matriz.GetLength(1); j++)
                {
                    Console.Write(matriz[i, j] + " ");
                }
                Console.WriteLine();
            }
        }

        // Método para imprimir la matriz de caracteres al revés
        static void ImprimirMatrizAlReves(char[,] matriz)
        {
            for (int i = matriz.GetLength(0) - 1; i >= 0; i--)
            {
                for (int j = matriz.GetLength(1) - 1; j >= 0; j--)
                {
                    Console.Write(matriz[i, j] + " ");
                }
                Console.WriteLine();
            }
        }
    }
}