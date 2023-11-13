using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_5
    {
        static void Main(string[] args)
        {
            string[] frutas = { "Manzana", "Banana", "Naranja", "Uva", "Pera" };
            string[] frutasAlReves = new string[frutas.Length];
            for (int i = 0; i < frutas.Length; i++)
            {
                frutasAlReves[i] = frutas[frutas.Length - 1 - i];
            }
            Console.WriteLine("Frutas originales:");
            ImprimirFrutas(frutas);
            Console.WriteLine("\nFrutas al revés:");
            ImprimirFrutas(frutasAlReves);
        }

        static void ImprimirFrutas(string[] arreglo)
        {
            foreach (string fruta in arreglo)
            {
                Console.WriteLine(fruta);
            }
        }
    }
}