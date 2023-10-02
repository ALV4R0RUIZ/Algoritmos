using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class P_6
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese el precio con IVA del primer producto: ");
            double precioProducto1 = Convert.ToDouble(Console.ReadLine());
            Console.Write("Ingrese el precio con IVA del segundo producto: ");
            double precioProducto2 = Convert.ToDouble(Console.ReadLine());
            Console.Write("Ingrese el precio con IVA del tercer producto: ");
            double precioProducto3 = Convert.ToDouble(Console.ReadLine());
            double tasaIVA = 0.16;
            double subtotal = precioProducto1 / (1 + tasaIVA) + precioProducto2 / (1 + tasaIVA) + precioProducto3 / (1 + tasaIVA);
            double totalIVA = (precioProducto1 + precioProducto2 + precioProducto3) - subtotal;
            double total = subtotal + totalIVA;
            Console.WriteLine("Subtotal: " + subtotal.ToString("C"));
            Console.WriteLine("Total del IVA: " + totalIVA.ToString("C"));
            Console.WriteLine("Total a pagar: " + total.ToString("C"));
            Console.ReadKey();
        }
    }
}