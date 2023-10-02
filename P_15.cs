using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class P_15
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese el precio del primer artículo: ");
            double precio1 = Convert.ToDouble(Console.ReadLine());
            Console.Write("Ingrese el precio del segundo artículo: ");
            double precio2 = Convert.ToDouble(Console.ReadLine());
            Console.Write("Ingrese el precio del tercer artículo: ");
            double precio3 = Convert.ToDouble(Console.ReadLine());
            double totalCompra = precio1 + precio2 + precio3;
            double descuento = 0;
            if (totalCompra > 1500)
            {
                descuento = totalCompra * 0.3;
            }
            else if (totalCompra >= 1000 && totalCompra <= 1499)
            {
                descuento = totalCompra * 0.2;
            }
            else if (totalCompra >= 700 && totalCompra <= 999)
            {
                descuento = totalCompra * 0.1;
            }
            double totalPagar = totalCompra - descuento;
            Console.WriteLine("El total a pagar es: $" + totalPagar.ToString("F2"));
            Console.ReadKey();
        }
    }
}