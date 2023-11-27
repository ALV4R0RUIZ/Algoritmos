using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_17
    {
        static void Main(string[] args)
        {
            int filas = 3;
            int columnas = 3;

            // Crear las matrices
            int[,] matrizA = new int[filas, columnas];
            int[,] matrizB = new int[filas, columnas];
            int[,] resultado = new int[filas, columnas];

            // Solicitar valores para la matriz A
            Console.WriteLine("Ingrese los valores para la Matriz A:");
            SolicitarValoresMatriz(matrizA);

            // Solicitar valores para la matriz B
            Console.WriteLine("Ingrese los valores para la Matriz B:");
            SolicitarValoresMatriz(matrizB);

            // Realizar la multiplicación
            MultiplicarMatrices(matrizA, matrizB, resultado);

            // Imprimir las matrices y el resultado
            Console.WriteLine("\nMatriz A:");
            ImprimirMatriz(matrizA);

            Console.WriteLine("\nMatriz B:");
            ImprimirMatriz(matrizB);

            Console.WriteLine("\nResultado de la Multiplicación:");
            ImprimirMatriz(resultado);

            // Esperar a que el usuario presione una tecla antes de cerrar la aplicación
            Console.ReadKey();
        }

        // Método para solicitar valores para una matriz
        static void SolicitarValoresMatriz(int[,] matriz)
        {
            for (int i = 0; i < matriz.GetLength(0); i++)
            {
                for (int j = 0; j < matriz.GetLength(1); j++)
                {
                    Console.Write($"Ingrese el valor para la posición [{i + 1},{j + 1}]: ");
                    matriz[i, j] = Convert.ToInt32(Console.ReadLine());
                }
            }
        }

        // Método para realizar la multiplicación de dos matrices
        static void MultiplicarMatrices(int[,] matrizA, int[,] matrizB, int[,] resultado)
        {
            for (int i = 0; i < matrizA.GetLength(0); i++)
            {
                for (int j = 0; j < matrizB.GetLength(1); j++)
                {
                    int suma = 0;

                    for (int k = 0; k < matrizA.GetLength(1); k++)
                    {
                        suma += matrizA[i, k] * matrizB[k, j];
                    }

                    resultado[i, j] = suma;
                }
            }
        }

        // Método para imprimir una matriz
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
