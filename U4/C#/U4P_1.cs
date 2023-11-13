using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_1
    {
        static void Main(string[] args)
        {
            int[] edades = new int[5];
            edades[0] = 18;
            edades[1] = 19;
            edades[2] = 17;
            edades[3] = 18;
            edades[4] = 18;

            Console.WriteLine(edades[0]);
            Console.WriteLine(edades[1]);
            Console.WriteLine(edades[2]);
            Console.WriteLine(edades[3]);
            Console.WriteLine(edades[4]);
        }
    }
}