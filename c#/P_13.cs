using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class P_13
    {
        static void Main(string[] args)
        {
            double promedio = 0;
            double sumaCalificaciones = 0;
            for (int i = 1; i <= 6; i++)
            {
                Console.Write("Ingrese la calificación " + i + ": ");
                double calificacion = Convert.ToDouble(Console.ReadLine());
                sumaCalificaciones += calificacion;
            }
            promedio = sumaCalificaciones / 6;
            if (promedio >= 70)
            {
                Console.WriteLine("El promedio es " + promedio.ToString("F2") + ". Aprobó la materia.");
            }
            else
            {
                Console.WriteLine("El promedio es " + promedio.ToString("F2") + ". Reprobó la materia.");
            }
            Console.ReadKey();
        }
    }
}