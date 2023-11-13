using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_10
    {
        static void Main(string[] args)
        {
            string[] paises = { "Argentina", "Brasil", "Chile", "México", "Perú" };
            double longitudPromedio = CalcularLongitudPromedio(paises);
            Console.WriteLine("Arreglo de nombres de países:");
            ImprimirArreglo(paises);
            Console.WriteLine("\nLongitud promedio de las palabras: " + longitudPromedio);
        }

        static double CalcularLongitudPromedio(string[] arreglo)
        {
            int totalCaracteres = 0;
            foreach (string palabra in arreglo)
            {
                totalCaracteres += palabra.Length;
            }
            return (double)totalCaracteres / arreglo.Length;
        }

        static void ImprimirArreglo(string[] arreglo)
        {
            foreach (string elemento in arreglo)
            {
                Console.Write(elemento + " ");
            }
            Console.WriteLine();
        }
    }
}