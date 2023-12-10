using System;

namespace U5P_4
{
    class U5P_4
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese un número para verificar si es primo: ");
            int numero = Convert.ToInt32(Console.ReadLine());

            if (EsPrimo(numero))
            {
                Console.WriteLine(numero + " es un número primo.");
            }
            else
            {
                Console.WriteLine(numero + " no es un número primo.");
            }
        }

        // Función para verificar si un número es primo
        private static bool EsPrimo(int num)
        {
            if (num <= 1)
            {
                return false;
            }

            for (int i = 2; i <= Math.Sqrt(num); i++)
            {
                if (num % i == 0)
                {
                    return false;
                }
            }

            // Si no es divisible por ningún número, es primo
            return true;
        }
    }
}
