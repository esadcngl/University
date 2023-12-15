using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OutandRefKeyword
{
    internal class Program
    {
        static void Main(string[] args)
        {

            int sayi = 10;
            Console.WriteLine("Normal parametre alan bir metot");
            Console.WriteLine(ikiyeKatla(sayi));
            Console.WriteLine("sayi değişkeninin değeri değişmedi " + sayi);

            Console.WriteLine("\nŞimdide ref ile deneyelim");
            Console.WriteLine(ikiyeKatla2(ref sayi));
            Console.WriteLine("refli metotdan sonra sayi değişkeni değişti: " + sayi);
            //------------------------------------------------------------------------
            int a; // tanımlı olmak zorunda değil çünkü out keywordü kullanıldı metotda
            //int b;  // ilk değer ataması yapılmalı yoksa hata verir
            Console.WriteLine("out keywordu sınıf içinde tanımlı olmak zorunda değil");
            Console.WriteLine("Ama metot içinde değişkene değer atanmalı");
            Console.WriteLine("refde tam tersi sınıf içinde değer atanmalı ");
            Console.WriteLine("Ama metot içinde atamayabilrsin.");
            Console.WriteLine(RastgeleSayi(out a));
            //Console.WriteLine(RastgeleSayi2(ref b));  // hata veriyor
            Console.ReadLine();
        }
        public static int ikiyeKatla(int i)
        {
            i = i * 2;
            return i;
        }
        public static int ikiyeKatla2(ref int i)
        {
            i = i * 2;
            return i;
        }

        public static int RastgeleSayi(out int a)
        {
            // out da değişkeni metot içinde tanımlamak zorundasın ama sınıfta tanımlı olması gerekmiyor 
            // refde ise metot içinde tanımlamak zorunda değilsin ama sınıfta tanımlı olmalı
            Random random = new Random();
            a = random.Next(0, 10);
            return a;
        }
         public static int RastgeleSayi2(ref int b)
        {
            Random random = new Random();
            b = random.Next(0, 10); 
            return b;
        } 
    }

}
