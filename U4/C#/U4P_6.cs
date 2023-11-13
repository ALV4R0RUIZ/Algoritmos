using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_6
    {
        static void Main(string[] args)
        {
            int[] numeros = { 5, 2, 8, 1, 3 };
            OrdenarArreglo(numeros);
            Console.WriteLine("Arreglo ordenado de menor a mayor:");
            ImprimirArreglo(numeros);
        }

        static void OrdenarArreglo(int[] arreglo)
        {
            int[] arregloAuxiliar = new int[arreglo.Length];
            Array.Copy(arreglo, arregloAuxiliar, arreglo.Length);
            Array.Sort(arregloAuxiliar);
            Array.Copy(arregloAuxiliar, arreglo, arreglo.Length);
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