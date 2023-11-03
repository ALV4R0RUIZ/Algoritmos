using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U3P_13
    {
        static void Main(string[] args)
        {
            int cantidadPositivos = 0;
            int cantidadNegativos = 0;

            for (int i = 1; i <= 100; i++)
            {
                Console.Write("Ingrese el número " + i + ": ");
                int numero = Convert.ToInt32(Console.ReadLine());

                if (numero > 0)
                {
                    cantidadPositivos++;
                }
                else if (numero < 0)
                {
                    cantidadNegativos++;
                }
            }

            Console.WriteLine("Cantidad de números positivos: " + cantidadPositivos);
            Console.WriteLine("Cantidad de números negativos: " + cantidadNegativos);
        }
    }
}