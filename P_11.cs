using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class P_11
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese un número entero positivo: ");
            int numero = Convert.ToInt32(Console.ReadLine());
            if (numero > 0)
            {
                if (numero % 2 == 0)
                {
                    Console.WriteLine("El número ingresado es PAR.");
                }
                else
                {
                    Console.WriteLine("El número ingresado es IMPAR.");
                }
            }
            else
            {
                Console.WriteLine("El número ingresado no es positivo.");
            }
            Console.ReadKey();
        }
    }
}