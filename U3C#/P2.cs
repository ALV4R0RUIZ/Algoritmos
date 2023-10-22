// using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c1, c2, c3, c4, c5, c6, prom;

            Console.WriteLine("Ingresa la primer calificacion:");
            c1 = int.Parse(Console.ReadLine());

            Console.WriteLine("Ingresa la segunda calificacion:");
            c2 = int.Parse(Console.ReadLine());

            Console.WriteLine("Ingresa la tercer calificacion:");
            c3 = int.Parse(Console.ReadLine());

            Console.WriteLine("Ingresa la cuarta calificacion:");
            c4 = int.Parse(Console.ReadLine());

            Console.WriteLine("Ingresa la quinta calificacion:");
            c5 = int.Parse(Console.ReadLine());

            Console.WriteLine("Ingresa la sexta calificacion:");
            c6 = int.Parse(Console.ReadLine());

            prom = (c1 + c2 + c3 + c4 + c5 + c6) / 6;

            if (prom >= 70)
            {
                Console.WriteLine("Aprobado");
            }
            else
            {
                Console.WriteLine("Reprobado");
            }
        }
    }
}