using System;
using System.Security.Cryptography;
using System.Text;

namespace U5P_10
{
    class Program
    {
        static void Main(string[] args)
        {
            int longitudContraseña = 12;

            // Generar y mostrar una contraseña aleatoria
            string contraseñaGenerada = GenerarContraseña(longitudContraseña);
            Console.WriteLine("Contraseña generada: " + contraseñaGenerada);
        }

        // Función para generar una contraseña aleatoria
        private static string GenerarContraseña(int longitud)
        {
            string caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";

            using (RNGCryptoServiceProvider rng = new RNGCryptoServiceProvider())
            {
                byte[] byteArray = new byte[longitud];
                rng.GetBytes(byteArray);

                StringBuilder contraseña = new StringBuilder(longitud);

                foreach (byte b in byteArray)
                {
                    int indice = b % caracteres.Length;
                    contraseña.Append(caracteres[indice]);
                }

                return contraseña.ToString();
            }
        }
    }
}
