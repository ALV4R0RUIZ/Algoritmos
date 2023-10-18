using System;

namespace P_1 // Note: actual namespace depends on the project name.
{
    internal class P_1
    {
        static void Main(string[] args)
        {
            int c1, c2, c3, c4, c5, c6;
            float promedio;
            string nombre;
            Console.Write("Escribe tu  nombre: ");
            nombre = Console.ReadLine();
            Console.WriteLine("Tu nombre es: " + nombre);

            Console.WriteLine("Escribe calificacion 1: ");
                c1 = Convert.ToInt32(Console.ReadLine() );
            Console.WriteLine("Escribe calificacion 2: ");
                c2 = Convert.ToInt32(Console.ReadLine() );
            Console.WriteLine("Escribe calificacion 3: ");
                c3 = Convert.ToInt32(Console.ReadLine() );
            Console.WriteLine("Escribe calificacion 4: ");
                c4 = Convert.ToInt32(Console.ReadLine() );
            Console.WriteLine("Escribe calificacion 5: ");
                c5 = Convert.ToInt32(Console.ReadLine() );
            Console.WriteLine("Escribe calificacion 6: ");
                c6 = Convert.ToInt32(Console.ReadLine() );
            promedio = c1 + c2 + c3 + c4 + c5 + c6 / 6;
            Console.WriteLine("Tu promedio es : " + promedio);
        }
    }
}