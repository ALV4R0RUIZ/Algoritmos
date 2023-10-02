using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class P_9
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese su edad: ");
            int edad = Convert.ToInt32(Console.ReadLine());
            if (edad >= 18)
            {
                Console.WriteLine("Eres mayor de edad.");
            }
            else
            {
                Console.WriteLine("Eres menor de edad.");
            }
            Console.ReadKey();
        }
    }
}