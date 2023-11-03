using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U3P_16
    {
        static void Main(string[] args)
        {
            int c = 1, horas, pago, sueldo;

            Console.WriteLine("captura las horas trabajadas");
            horas = int.Parse(Console.ReadLine());
            Console.WriteLine("captura el pago por hora");
            pago = int.Parse(Console.ReadLine());
            sueldo = horas * pago;
            Console.WriteLine("tu sueldo es: " + sueldo);
            c++;
        }
    }
}