using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U3P_6
    {
        static void Main(string[] args)
        {
            Console.Write("Ingresa un número entero positivo: ");
            int numero = Convert.ToInt32(Console.ReadLine());

            if (numero > 0)
            {
                if (numero % 2 == 0)
                {
                    Console.WriteLine("El número " + numero + " es par.");
                }
                else
                {
                    Console.WriteLine("El número " + numero + " es impar.");
                }
            }
            else
            {
                Console.WriteLine("El número ingresado no es un entero positivo.");
            }
        }
    }
}