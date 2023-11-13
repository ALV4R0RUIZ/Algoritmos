using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_7
    {
        static void Main(string[] args)
        {
            double[] numeros = { 5, 2, 8, 1, 3 };
            double media = CalcularMedia(numeros);
            double mediana = CalcularMediana(numeros);
            Console.WriteLine("Arreglo de números:");
            ImprimirArreglo(numeros);
            Console.WriteLine("\nMedia: " + media);
            Console.WriteLine("Mediana: " + mediana);
        }

        static double CalcularMedia(double[] arreglo)
        {
            double suma = 0;
            foreach (double numero in arreglo)
            {
                suma += numero;
            }
            return suma / arreglo.Length;
        }

        static double CalcularMediana(double[] arreglo)
        {
            // Ordenar el arreglo para calcular la mediana
            Array.Sort(arreglo);

            int n = arreglo.Length;

            // Calcular la mediana
            if (n % 2 == 0)
            {
                return (arreglo[(n / 2) - 1] + arreglo[n / 2]) / 2.0;
            }
            else
            {
                return arreglo[n / 2];
            }
        }

        static void ImprimirArreglo(double[] arreglo)
        {
            foreach (double numero in arreglo)
            {
                Console.Write(numero + " ");
            }
            Console.WriteLine();
        }
    }
}