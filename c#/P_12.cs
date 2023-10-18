using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class P_12
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese la temperatura actual en grados Celsius: ");
            double temperatura = Convert.ToDouble(Console.ReadLine());
            if (temperatura > 27)
            {
                Console.WriteLine("Hace calor.");
            }
            else if (temperatura >= 20 && temperatura <= 27)
            {
                Console.WriteLine("Clima agradable.");
            }
            else
            {
                Console.WriteLine("Clima fresco o frío.");
            }
            Console.ReadKey();
        }
    }
}