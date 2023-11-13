using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_9
    {
        static void Main(string[] args)
        {
            string[] nombres = { "Juan", "María", "Pedro" };
            string[] apellidos = { "Pérez", "Gómez", "López" };
            // Concatenar los arreglos
            string[] nombresCompletos = ConcatenarArreglos(nombres, apellidos);
            Console.WriteLine("Arreglo de nombres completos:");
            ImprimirArreglo(nombresCompletos);
        }

        static string[] ConcatenarArreglos(string[] arreglo1, string[] arreglo2)
        {
            string[] resultado = new string[arreglo1.Length];

            for (int i = 0; i < arreglo1.Length; i++)
            {
                resultado[i] = $"{arreglo1[i]} {arreglo2[i]}";
            }

            return resultado;
        }

        static void ImprimirArreglo(string[] arreglo)
        {
            foreach (string elemento in arreglo)
            {
                Console.WriteLine(elemento);
            }
        }
    }
}