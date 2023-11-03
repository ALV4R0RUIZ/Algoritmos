using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U3P_20
    {
        static void Main(string[] args)
        {
            int diasDelAnio = 365; // Suponiendo un año no bisiesto
            double ahorroDiario = 3.0; // Ahorro inicial el 1 de enero
            double ahorroAnual = 0.0;

            for (int dia = 1; dia <= diasDelAnio; dia++)
            {
                ahorroAnual += ahorroDiario;
                Console.WriteLine("Día " + dia + ": Ahorro diario = $" + ahorroDiario);
                ahorroDiario *= 3; // Triplica el ahorro para el siguiente día
            }

            Console.WriteLine("Ahorro anual: $" + ahorroAnual);
        }
    }
}