using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_12
    {
        static void Main(string[] args)
        {
            int[,] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

            // Imprimir la matriz
            ImprimirMatriz(matriz);

            // Esperar a que el usuario presione una tecla antes de cerrar la aplicación
            Console.ReadKey();
        }

        // Método para imprimir la matriz
        static void ImprimirMatriz(int[,] matriz)
        {
            Console.WriteLine("Matriz 3x3:");

            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    Console.Write(matriz[i, j] + " ");
                }
                Console.WriteLine();
            }
        }
    }
}    