using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class U3P3
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Escribe el día de la semana numérico:");
            int dia = int.Parse(Console.ReadLine());

            switch (dia)
            {
                case 1:
                    Console.WriteLine("Lunes");
                    break;
                case 2:
                    Console.WriteLine("Martes");
                    break;
                case 3:
                    Console.WriteLine("Miércoles");
                    break;
                case 4:
                    Console.WriteLine("Jueves");
                    break;
                case 5:
                    Console.WriteLine("Viernes");
                    break;
                case 6:
                    Console.WriteLine("Sábado");
                    break;
                case 7:
                    Console.WriteLine("Domingo");
                    break;
                default:
                    Console.WriteLine("No existe el día ingresado");
                    break;
            }
        }   
    }
}
