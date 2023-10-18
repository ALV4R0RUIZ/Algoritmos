using System;

class P_2
{
    static void Main()
    {
        int y, a, x;
        Console.Write("Ingrese el valor de y: ");
        y = Int32.Parse(Console.ReadLine());
        Console.Write("Ingrese el valor de a: ");
        a = Int32.Parse(Console.ReadLine());
        x = y + a + 3;
        Console.WriteLine("El valor de x es: " + x);
        Console.ReadKey();
    }
}