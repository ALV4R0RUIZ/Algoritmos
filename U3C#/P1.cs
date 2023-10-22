using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class P1
    {
        static void Main(string[] args)
        {
            int n;
            Console.WriteLine("Ingrese su edad: ");
            n = Convert.ToInt32(Console.ReadLine());

            if (n >= 18)
            {
                Console.WriteLine("Es mayor de edad");
            }
            else
            {
                Console.WriteLine("Es menor de edad");
            }
        }
    }
}