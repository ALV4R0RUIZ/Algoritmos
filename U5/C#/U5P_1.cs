using System;

namespace U5P_1
{
    class U5P_1
    {
        static void Main(string[] args)
        {
            // Solicitar al usuario que ingrese dos números
            Console.Write("Ingrese el primer número: ");
            double num1 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Ingrese el segundo número: ");
            double num2 = Convert.ToDouble(Console.ReadLine());

            // Mostrar el menú de operaciones
            Console.WriteLine("\nSeleccione una operación:");
            Console.WriteLine("1. Suma");
            Console.WriteLine("2. Resta");
            Console.WriteLine("3. Multiplicación");
            Console.WriteLine("4. División");

            // Leer la opción del usuario
            Console.Write("Ingrese el número de la operación: ");
            int opcion = Convert.ToInt32(Console.ReadLine());

            // Realizar la operación seleccionada
            double resultado = 0;
            switch (opcion)
            {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    // Verificar la división por cero
                    if (num2 != 0)
                    {
                        resultado = num1 / num2;
                    }
                    else
                    {
                        Console.WriteLine("Error: No se puede dividir por cero.");
                        return;
                    }
                    break;
                default:
                    Console.WriteLine("Opción no válida.");
                    return;
            }

            // Mostrar el resultado
            Console.WriteLine("El resultado es: " + resultado);
        }
    }
}
