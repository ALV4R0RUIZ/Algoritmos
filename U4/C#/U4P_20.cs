using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_20
    {
        static void Main(string[] args)
        {
            int filas = 3;
            int columnas = 3;

            // Crear una matriz original
            int[,] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
            int[,] matrizCopia = new int[filas, columnas];
            CopiarYElevarAlCuadrado(matrizOriginal, matrizCopia);

            // Imprimir las matrices
            Console.WriteLine("Matriz Original:");
            ImprimirMatriz(matrizOriginal);

            Console.WriteLine("\nMatriz Copia (elevada al cuadrado):");
            ImprimirMatriz(matrizCopia);
            Console.ReadKey();
        }

        // Método para copiar los datos y elevar al cuadrado
        static void CopiarYElevarAlCuadrado(int[,] matrizOriginal, int[,] matrizCopia)
        {
            for (int i = 0; i < matrizOriginal.GetLength(0); i++)
            {
                for (int j = 0; j < matrizOriginal.GetLength(1); j++)
                {
                    // Copiar el valor
                    matrizCopia[i, j] = matrizOriginal[i, j];

                    // Elevar al cuadrado
                    matrizCopia[i, j] *= matrizCopia[i, j];
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
    }
}