using System;

namespace U5P_6
{
    class U5P_6
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese la cantidad de términos en la secuencia Fibonacci: ");
            int n = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Secuencia Fibonacci de " + n + " términos:");
            ImprimirFibonacci(n);
        }

        // Función para generar la secuencia Fibonacci
        private static void ImprimirFibonacci(int n)
        {
            int primero = 0, segundo = 1;

            for (int i = 0; i < n; i++)
            {
                Console.Write(primero + " ");

                int siguiente = primero + segundo;
                primero = segundo;
                segundo = siguiente;
            }
        }
    }
}
