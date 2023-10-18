using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U3P_5
    {
        static void Main(string[] args)
        {
            double p1, p2, p3, total;
            Console.Write("Esceibe el precio 1:");
            p1 = double.Parse(Console.ReadLine());
            Console.Write("Esceibe el precio 2:");
            p2 = double.Parse(Console.ReadLine());
            Console.Write("Esceibe el precio 3:");
            p3 = double.Parse(Console.ReadLine());
            total = p1 + p2 + p3;

            if (total >= 1500)
            {
                total = total - (total * 0.30);
                Console.WriteLine("El total (30%):" + total);
            }
            else if (total < 1500 && total >= 1000)
            {
                total = total - (total * 0.20);
                Console.WriteLine("El total (20%):" + total);
            }
            else if (total < 1000 && total <= 700)
            {
                total = total - (total * 0.10);
                Console.WriteLine("El total (10%):" + total);
            }
            else
            {
                Console.WriteLine("El total (sin descuento):" + total);
            }
        }
    }
}