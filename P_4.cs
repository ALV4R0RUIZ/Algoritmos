using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class P_4
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese la temperatura en grados Celsius: ");
            int celsius = Int32.Parse(Console.ReadLine());
            int fahrenheit = (celsius * 9 / 5) + 32;
            Console.WriteLine("La temperatura en grados Fahrenheit es: " + fahrenheit);
            Console.ReadKey();
        }
    }
}