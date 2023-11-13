using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U4P_2
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese el total de calificaciones a capturar: ");
            int totalCalificaciones = Convert.ToInt32(Console.ReadLine());
            double[] calificaciones = new double[totalCalificaciones];
            for (int i = 0; i < totalCalificaciones; i++)
            {
                Console.Write($"Ingrese la calificación #{i + 1}: ");
                calificaciones[i] = Convert.ToDouble(Console.ReadLine());
            }
            double suma = 0;
            foreach (double calificacion in calificaciones)
            {
                suma += calificacion;
            }
            double promedio = suma / totalCalificaciones;
            Console.WriteLine($"El promedio de las calificaciones es: {promedio}");
        }
    }
}