using System;

namespace U5P_2
{
    class U5P_2
    {
        static void Main(string[] args)
        {
            // Solicitar al usuario que ingrese los coeficientes de la ecuación cuadrática
            Console.WriteLine("Ingrese los coeficientes de la ecuación cuadrática ax^2 + bx + c = 0:");

            Console.Write("Coeficiente a: ");
            double a = Convert.ToDouble(Console.ReadLine());

            Console.Write("Coeficiente b: ");
            double b = Convert.ToDouble(Console.ReadLine());

            Console.Write("Coeficiente c: ");
            double c = Convert.ToDouble(Console.ReadLine());

            double discriminante = b * b - 4 * a * c;

            if (discriminante > 0)
            {
                // Dos raíces reales distintas
                double raiz1 = (-b + Math.Sqrt(discriminante)) / (2 * a);
                double raiz2 = (-b - Math.Sqrt(discriminante)) / (2 * a);

                Console.WriteLine("Las raíces reales son: " + raiz1 + " y " + raiz2);
            }
            else if (discriminante == 0)
            {
                // Una raíz real (raíz doble)
                double raiz = -b / (2 * a);

                Console.WriteLine("La raíz doble real es: " + raiz);
            }
            else
            {
                // Raíces complejas (imaginarias)
                double parteReal = -b / (2 * a);
                double parteImaginaria = Math.Sqrt(Math.Abs(discriminante)) / (2 * a);

                Console.WriteLine("Las raíces complejas son: " + parteReal + " + " + parteImaginaria + "i y " +
                        parteReal + " - " + parteImaginaria + "i");
            }
        }
    }
}
