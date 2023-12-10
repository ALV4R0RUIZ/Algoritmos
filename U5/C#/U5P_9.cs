using System;

namespace U5P_9
{
    class Program
    {
        static void Main(string[] args)
        {
            // Solicitar al usuario que ingrese el sueldo diario y el tiempo laborado en años
            Console.Write("Ingrese el sueldo diario del trabajador: ");
            double sueldoDiario = Convert.ToDouble(Console.ReadLine());

            Console.Write("Ingrese el tiempo laborado en años: ");
            int tiempoLaborado = Convert.ToInt32(Console.ReadLine());

            // Finiquito
            double finiquito = CalcularFiniquito(sueldoDiario, tiempoLaborado);

            // Mostrar el resultado
            Console.WriteLine("\nFiniquito del trabajador:");
            Console.WriteLine($"Sueldo diario: ${sueldoDiario}");
            Console.WriteLine($"Tiempo laborado: {tiempoLaborado} años");
            Console.WriteLine($"Finiquito: ${finiquito}");
        }

        private static double CalcularFiniquito(double sueldoDiario, int tiempoLaborado)
        {
            const int DIAS_POR_ANO = 365;
            const int DIAS_POR_FINIQUITO = 15;

            int diasTrabajados = tiempoLaborado * DIAS_POR_ANO;
            double finiquito = sueldoDiario * DIAS_POR_FINIQUITO * tiempoLaborado;

            return finiquito;
        }
    }
}
