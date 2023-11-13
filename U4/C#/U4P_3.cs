using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_3
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese la temperatura en grados Celsius: ");
            string input = Console.ReadLine();

            try
            {
                int celsius = int.Parse(input);

                int kelvin = celsius + 273;
                int fahrenheit = (celsius * 9 / 5) + 32;

                Console.WriteLine("Temperatura en grados Kelvin: " + kelvin);
                Console.WriteLine("Temperatura en grados Fahrenheit: " + fahrenheit);
            }
            catch (FormatException)
            {
                Console.WriteLine("Por favor, ingrese un valor válido en grados Celsius.");
            }

        }
    }
}
