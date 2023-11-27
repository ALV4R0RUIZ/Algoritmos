using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_18
    {
        static void Main(string[] args)
        {
            int tamanoMatriz = 3;

            int[,] matrizCuadrada = new int[tamanoMatriz, tamanoMatriz];
            InicializarMatriz(matrizCuadrada);

            // Imprimir la matriz
            Console.WriteLine("Matriz Cuadrada:");
            ImprimirMatriz(matrizCuadrada);

            // Calcular y mostrar la suma de los elementos de la matriz
            int sumaElementos = CalcularSumaMatriz(matrizCuadrada);
            Console.WriteLine($"\nLa suma de los elementos de la matriz es: {sumaElementos}");

            Console.ReadKey();
        }

        static void InicializarMatriz(int[,] matriz)
        {
            Random random = new Random();

            for (int i = 0; i < matriz.GetLength(0); i++)
            {
                for (int j = 0; j < matriz.GetLength(1); j++)
                {
                    matriz[i, j] = random.Next(1, 11); // Números aleatorios entre 1 y 10
                }
            }
        }

        // Método para calcular la suma de los elementos de la matriz
        static int CalcularSumaMatriz(int[,] matriz)
        {
            int suma = 0;

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