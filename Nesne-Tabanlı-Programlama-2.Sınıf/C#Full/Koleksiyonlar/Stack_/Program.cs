using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Stack_
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Stack, ilk giren son çıkar işleyişine sahip bir koleksiyondur. (LİFO)
            // Stack sınıfının Pop() ve Push() olmak üzere 2 temel metodu bulunmaktadır.

            // Pop(): Stack’in en üstündeki nesneyi çıkarır.
            // Push(): Stack’in en üstüne bir nesne ekler.

            Stack<string> yigin = new Stack<string>();

            yigin.Push("www.google.com");
            yigin.Push("www.youtube.com");
            yigin.Push("www.instagram.com");
            
            // Peek() : Tepedeki elemanı döndürür
            try
            {
                string site = yigin.Pop();
                Console.WriteLine(site);
            }
            catch (InvalidOperationException)
            {
                Console.WriteLine("Stack Boş.");
            }

            Console.WriteLine("siteler arasında google var mı? :" + yigin.Contains("www.google.com"));

            // toArray() dizi döndürür.
            string[] Dizi = yigin.ToArray();
            for (int i = 0; i < Dizi.Length; i++)
                Console.WriteLine(Dizi[i]);

            // Clear ve Count zaten biliyosun

        }
    }
}
