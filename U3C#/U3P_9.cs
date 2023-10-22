using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U3P_9
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese la hora de entrada: ");
            int horaEntrada = Convert.ToInt32(Console.ReadLine());

            Console.Write("Ingrese la hora de salida: ");
            int horaSalida = Convert.ToInt32(Console.ReadLine());

            int horasEstacionamiento = horaSalida - horaEntrada;
            double costoTotal = 0.0;

            if (horasEstacionamiento <= 2)
            {
                costoTotal = horasEstacionamiento * 5.0;
            }
            else if (horasEstacionamiento <= 5)
            {
                costoTotal = (2 * 5.0) + ((horasEstacionamiento - 2) * 4.0);
            }
            else if (horasEstacionamiento <= 10)
            {
                costoTotal = (2 * 5.0) + (3 * 4.0) + ((horasEstacionamiento - 5) * 3.0);
            }
            else
            {
                costoTotal = (2 * 5.0) + (3 * 4.0) + (5 * 3.0) + ((horasEstacionamiento - 10) * 2.0);
            }

            Console.WriteLine("Horas de estacionamiento: " + horasEstacionamiento);
            Console.WriteLine("El costo total es de: $" + costoTotal);
        }
    }
}