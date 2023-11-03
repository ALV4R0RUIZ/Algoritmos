using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U3P_18
    {
        static void Main(string[] args)
        {
            double salarioInicial = 1500.0;
            double incrementoAnual = 0.10;
            int numeroAnios = 6;

            Console.WriteLine("Salario inicial: $" + salarioInicial);

            double salarioTotal = salarioInicial;

            for (int anio = 1; anio <= numeroAnios; anio++)
            {
                double salarioAnual = salarioTotal * (1 + incrementoAnual);
                salarioTotal = salarioAnual;
                Console.WriteLine("Salario en el año " + anio + ": $" + salarioAnual);
            }

            Console.WriteLine("Salario al cabo de " + numeroAnios + " años: $" + salarioTotal);
        }
    }
}