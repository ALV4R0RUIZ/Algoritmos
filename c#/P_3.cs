namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class P_3
    {
        static void Main(string[] args)
        {
            int perimetro, area, h, ba, lado;
            Console.WriteLine("Ingresa la altura:");
            h = Int32.Parse(Console.ReadLine());
            Console.WriteLine("Ingresa primer lado:");
            ba = Int32.Parse(Console.ReadLine());
            Console.WriteLine("Ingresa segundo lado:");
            lado = Int32.Parse(Console.ReadLine());
            Console.WriteLine("Ingresa tercer lado:");
            lado = Int32.Parse(Console.ReadLine());

            area = (ba * h / 2);
            perimetro = lado * 3;
            Console.WriteLine("El area es: " + area);
            Console.WriteLine("El perimetro es: " + perimetro);
            }
    }
}