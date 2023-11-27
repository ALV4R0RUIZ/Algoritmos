using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_19
    {
        static void Main(string[] args)
        {
            int filas = 3;
            int columnas = 3;

            // Crear una matriz
            int[,] matriz = new int[filas, columnas];

            InicializarMatriz(matriz);

            // Imprimir la matriz
            Console.WriteLine("Matriz:");
            ImprimirMatriz(matriz);
            ContarParesEImpares(matriz);
            Console.ReadKey();
        }
        static void InicializarMatriz(int[,] matriz)
        {
            Random random = new Random();

            for (int i = 0; i < matriz.GetLength(0); i++)
            {
                for (int j = 0; j < matriz.GetLength(1); j++)
                {
                    matriz[i, j] = random.Next(1, 101); // Números aleatorios entre 1 y 100
                }
            }
        }

        // Método para imprimir la matriz
        static void ImprimirMatriz(int[,] matriz)
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

        // Método para contar la cantidad de números pares e impares en la matriz
        static void ContarParesEImpares(int[,] matriz)
        {
            int pares = 0;
            int impares = 0;

            for (int i = 0; i < matriz.GetLength(0); i++)
            {
                for (int j = 0; j < matriz.GetLength(1); j++)
                {
                    if (matriz[i, j] % 2 == 0)
                    {
                        pares++;
                    }
                    else
                    {
                        impares++;
                    }
                }
            }

            Console.WriteLine($"\nCantidad de números pares: {pares}");
            Console.WriteLine($"Cantidad de números impares: {impares}");
        }
    }
}  
