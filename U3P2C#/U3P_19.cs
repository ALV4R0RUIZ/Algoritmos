using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U3P_19
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese la cantidad de números (N): ");
            int N = int.Parse(Console.ReadLine());

            int cantCero = 0;
            int cantMayoresCero = 0;
            int cantMenoresCero = 0;

            for (int i = 1; i <= N; i++)
            {
                Console.Write("Ingrese el número " + i + ": ");
                double numero = double.Parse(Console.ReadLine());

                if (numero == 0)
                {
                    cantCero++;
                }
                else if (numero > 0)
                {
                    cantMayoresCero++;
                }
                else
                {
                    cantMenoresCero++;
                }
            }

            Console.WriteLine("Cantidad de números iguales a cero: " + cantCero);
            Console.WriteLine("Cantidad de números mayores a cero: " + cantMayoresCero);
            Console.WriteLine("Cantidad de números menores a cero: " + cantMenoresCero);
        }
    }
}