using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U3P_8
    {
        static void Main(string[] args)
        {
            Console.Write("Ingresa el primer número: ");
            double numero1 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Ingresa el segundo número: ");
            double numero2 = Convert.ToDouble(Console.ReadLine());

            if (numero1 > numero2)
            {
                Console.WriteLine("El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ").");
            }
            else if (numero2 > numero1)
            {
                Console.WriteLine("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ").");
            }
            else
            {
                Console.WriteLine("Ambos números son iguales.");
            }
        }
    }
}
