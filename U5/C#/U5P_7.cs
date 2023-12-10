using System;

namespace U5P_7
{
    class Program
    {
        static void Main(string[] args)
        {
            // Solicitar al usuario que ingrese el precio y la cantidad de productos
            Console.Write("Ingrese el precio unitario del producto: ");
            double precioUnitario = Convert.ToDouble(Console.ReadLine());

            Console.Write("Ingrese la cantidad de productos: ");
            int cantidad = Convert.ToInt32(Console.ReadLine());

            // Subtotal
            double subtotal = CalcularSubtotal(precioUnitario, cantidad);

            // IVA
            double iva = CalcularIVA(subtotal);

            // Total
            double total = CalcularTotal(subtotal, iva);

            // Resultados
            Console.WriteLine("\nDetalles de la Factura:");
            Console.WriteLine("Precio Unitario: $" + precioUnitario);
            Console.WriteLine("Cantidad: " + cantidad);
            Console.WriteLine("Subtotal: $" + subtotal);
            Console.WriteLine("IVA (16%): $" + iva);
            Console.WriteLine("Total: $" + total);
        }

        // Subtotal
        private static double CalcularSubtotal(double precioUnitario, int cantidad)
        {
            return precioUnitario * cantidad;
        }

        // IVA (16%)
        private static double CalcularIVA(double subtotal)
        {
            const double PORCENTAJE_IVA = 0.16;
            return subtotal * PORCENTAJE_IVA;
        }

        // Función para calcular el Total
        private static double CalcularTotal(double subtotal, double iva)
        {
            return subtotal + iva;
        }
    }
}
