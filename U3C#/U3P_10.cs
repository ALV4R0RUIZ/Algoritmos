using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U3P_10
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese las horas trabajadas: ");
            int horasTrabajadas = Convert.ToInt32(Console.ReadLine());

            Console.Write("Ingrese el pago por hora: ");
            double pagoPorHora = Convert.ToDouble(Console.ReadLine());

            double sueldoSemanal;

            if (horasTrabajadas <= 40)
            {
                sueldoSemanal = horasTrabajadas * pagoPorHora;
            }
            else
            {
                // Las primeras 40 horas se pagan normalmente
                sueldoSemanal = 40 * pagoPorHora;

                // Horas extras se pagan al doble
                int horasExtras = horasTrabajadas - 40;
                sueldoSemanal += horasExtras * (pagoPorHora * 2);
            }

            Console.WriteLine("El sueldo semanal es: $" + sueldoSemanal);
        }
    }
}