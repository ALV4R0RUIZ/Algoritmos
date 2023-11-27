using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_15
    {
        static void Main(string[] args)
        {
            int[,] matriz = GenerarMatriz(3, 4);

            // Imprimir la matriz
            ImprimirMatriz(matriz);

            // Calcular y mostrar la media de cada fila
            CalcularMediaPorFila(matriz);

            // Esperar a que el usuario presione una tecla antes de cerrar la aplicación
            Console.ReadKey();
        }
        static int[,] GenerarMatriz(int filas, int columnas)
        {
            Random random = new Random();
            int[,] matriz = new int[filas, columnas];

            for (int i = 0; i < filas; i++)
            {
                for (int j = 0; j < columnas; j++)
                {
                    matriz[i, j] = random.Next(1, 101);
                }
            }

            return matriz;
        }

        // Método para imprimir la matriz
        static void ImprimirMatriz(int[,] matriz)
        {
            Console.WriteLine("Matriz:");

            for (int i = 0; i < matriz.GetLength(0); i++)
            {
                for (int j = 0; j < matriz.GetLength(1); j++)
                {
                    Console.Write(matriz[i, j] + "\t");
                }
                Console.WriteLine();
            }
        }

        // Método para calcular y mostrar la media de cada fila
        static void CalcularMediaPorFila(int[,] matriz)
        {
            Console.WriteLine("\nMedia de cada fila:");

            for (int i = 0; i < matriz.GetLength(0); i++)
            {
                double suma = 0;

                for (int j = 0; j < matriz.GetLength(1); j++)
                {
                    suma += matriz[i, j];
                }

                double media = suma / matriz.GetLength(1);
                Console.WriteLine($"Fila {i + 1}: {media:F2}");
            }
        }
    }
}