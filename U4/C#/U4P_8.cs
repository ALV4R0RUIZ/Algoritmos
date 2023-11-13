using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_8
    {
        static void Main(string[] args)
        {
            int[] numeros = { 5, 2, 8, 1, 3 };

            // Clasificar los números en pares e impares
            ClasificarNumeros(numeros, out int[] pares, out int[] impares);
            Console.WriteLine("Arreglo de números:");
            ImprimirArreglo(numeros);
            Console.WriteLine("\nNúmeros pares:");
            ImprimirArreglo(pares);
            Console.WriteLine("\nNúmeros impares:");
            ImprimirArreglo(impares);
        }

        static void ClasificarNumeros(int[] arreglo, out int[] pares, out int[] impares)
        {
            pares = new int[arreglo.Length];
            impares = new int[arreglo.Length];

            int indicePares = 0;
            int indiceImpares = 0;

            foreach (int numero in arreglo)
            {
                if (numero % 2 == 0)
                {
                    pares[indicePares++] = numero;
                }
                else
                {
                    impares[indiceImpares++] = numero;
                }
            }
            Array.Resize(ref pares, indicePares);
            Array.Resize(ref impares, indiceImpares);
        }

        static void ImprimirArreglo(int[] arreglo)
        {
            foreach (int numero in arreglo)
            {
                Console.Write(numero + " ");
            }
            Console.WriteLine();
        }
    }
}