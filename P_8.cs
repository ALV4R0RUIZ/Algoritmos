using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class P_8
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese el perímetro del hexágono:");
            double perimetro = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Ingrese la altura entre 2 del hexágono:");
            double altura = Convert.ToDouble(Console.ReadLine());
            double apotema = altura / 2;
            double area = (perimetro * apotema) / 2;
            Console.WriteLine("El área del hexágono es: " + area);
        }
    }
}