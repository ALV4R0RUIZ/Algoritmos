using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U3P_15
    {
        static void Main(string[] args)
        {
            int suma = 0;
            int c = 1;

            while (c <= 20)
            {
                suma = suma + c;
                c++;
            }

            Console.WriteLine("Suma=" + suma);
        }
    }
}