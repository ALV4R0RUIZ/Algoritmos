using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class P_5
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese la longitud en metros: ");
            double metros = Int32.Parse(Console.ReadLine());
            double pies = metros * 3.28084;
            Console.WriteLine("La longitud en pies es: " + pies);
            Console.ReadKey();

        }
    }
}