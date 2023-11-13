using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_4
    {
        static void Main(string[] args)
        {
            int[] numeros = { 5, -2, 0, -8, 10, -4, 7, -1 };

            // Contador para almacenar el total de números negativos
            int totalNegativos = 0;

            // Recorrer el arreglo y contar los números negativos
            foreach (int numero in numeros)
            {
                if (numero < 0)
                {
                    totalNegativos++;
                }
            }

            // Imprimir el resultado
            Console.WriteLine("El total de números negativos en el arreglo es: " + totalNegativos);
        }
    }
}