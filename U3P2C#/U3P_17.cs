using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U3P_17
    {
        static void Main(string[] args)
        {
            char opcion;
            do
            {
                Console.WriteLine("Bienvenido a una sola ejecucion");
                Console.WriteLine("¡¡¡Escribe n para salir!!!");
                opcion = Console.ReadKey().KeyChar;
            } while (opcion != 'n');
        
        }
    }
}