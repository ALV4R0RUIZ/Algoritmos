using System;

namespace U5P_8
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("¿Cuántas veces deseas simular el lanzamiento de dados? ");
            int vecesASimular = Convert.ToInt32(Console.ReadLine());

            for (int i = 1; i <= vecesASimular; i++)
            {
                Console.WriteLine($"\nSimulación {i}:");
                LanzarDados();
            }
        }

        private static void LanzarDados()
        {
            Random random = new Random();

            int dado1 = random.Next(1, 7);
            int dado2 = random.Next(1, 7);

            // resultados 
            Console.WriteLine($"Dado 1: {dado1}");
            Console.WriteLine($"Dado 2: {dado2}");
            Console.WriteLine($"Total: {dado1 + dado2}");
        }
    }
}
