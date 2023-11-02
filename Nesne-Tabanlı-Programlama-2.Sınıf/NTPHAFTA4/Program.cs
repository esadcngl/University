using System;
using System.Collections.Generic;
using System.Diagnostics.Eventing.Reader;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Schema;

namespace NTPHafta4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Örnek-2 (Dizi yazdırma örneği gösterim)
            {
                int[] dizi12 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
                diziYaz(dizi12, 0);
                diziYaz(dizi12, 1);
                diziYaz(dizi12, 2);
                Console.ReadLine();
            }
            #endregion
            #region Örnek-3 (Parametre alan metotlarda ref keywordü) gösterim
            int x = 100;
            Console.WriteLine("X 'in değeri : " + x);
            degerTipAktarım(x);
            Console.WriteLine("birinci method sonunda X 'in değeri : " + x);
            degerTipAktarım2(ref x);
            Console.WriteLine("ikinci method sonunda X'in değeri : " + x);
            Console.WriteLine("İkinci method sonunda x'in degerinin değişme nedeni ref keywordü kullanarak referansının çağırdık ilkinde ise değeri kopyalanıp geldi");
            Console.ReadLine();
            #endregion
            #region Örnek-4 (Metotlarda overloading aşırı yükleme) gösterim 
            method1(14.3, 12);
            method1(5.2f, 2);
            Console.ReadLine();
            #endregion
            #region Örnek-5 (Değişken sayıda parametre alan metotlar) gösterim
            int[] dizi14 = new int[] { 2, 15, 3, 4 };
            Console.WriteLine(Islem("ÇARP", dizi14));
            Console.WriteLine(Islem("TopLa  ", dizi14));
            Console.ReadLine();
            #endregion
            #region Örnek-6 (Kendini Çağıran recursive Metotlar) gösterim
            int faksayı;
            Console.WriteLine("Faktöriyel almak istediğniz sayı: ");
            faksayı = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Faktöriyel = " +faktöriyel(faksayı));
            Console.ReadLine();
            #endregion
        }

        #region Dizi parametre aldırma 
        static void yaz(Array array)
        {
            foreach (var item in array)
            {
                Console.Write(item + " ");
            }
        }
        static int topla(params int[] dizi)
        {

            if (dizi.Length == 0)
                return 0;
            int toplam = 0;
            foreach (int sayı in dizi)
                toplam += sayı;
            return toplam;


        }
        #endregion
        #region Örnek-1 (Buyuk sayıyı bulma metodu)

        static int BuyukBul(int a, int b)
        {
            if (a > b)
            {
                return a;
            }
            return b;
        }
        static int Buyukbul2(int a, int b, int c)
        {
            return BuyukBul(c, BuyukBul(a, b));
        }


        #endregion
        #region Örnek-2 (Dizi yazdırma örneği)

        static void diziYaz(int[] a, int Sekil)
        {
            if (Sekil == 0)
            {
                foreach (object o in a)
                {
                    Console.Write(o.ToString() + " ");
                    Console.WriteLine();
                }

            }
            else if (Sekil == 1)
            {
                int x = 1;
                foreach (object o in a)
                {
                    Console.WriteLine("{0,5}", o.ToString());
                    if (x % 3 == 0)
                    {
                        Console.WriteLine();
                        x++;
                    }
                }
            }
            else
            {
                foreach (Object o in a)
                {
                    Console.WriteLine(o.ToString());
                }
                Console.WriteLine();
            }


        }

        #endregion
        #region Örnek-3 (Parametre alan metotlarda ref keywordü etkisi)


        static void degerTipAktarım(int sayı)
        {
            sayı = 30;
        }
        static void degerTipAktarım2(ref int sayı)
        {
            sayı = 30;
        }

        #endregion
        #region Örnek-4 (Metotlarda overloading aşırı yükleme)
        public static void method1(double y, double x)
        {
            Console.WriteLine("metot 1 çalıştı.");
        }
        public static void method1(float y, float x)
        {
            Console.WriteLine("metot 2 çalıştı");
        }
        #endregion
        #region Örnek-5 (Değişken sayıda parametre alan metotlar)
        static int Islem(String işlem, params int[] sayılar)
        {

            if (işlem.ToLower().Trim() == "çarp")
            {
                int total = 1;
                foreach (int sayı in sayılar)
                {
                    total *= sayı;

                }
                return total;
            }
            else if (işlem.ToLower().Trim() == "topla")
            {
                int total = 0;
                foreach (int sayı in sayılar)
                {
                    total += sayı;
                }
                return total;
            }
            else return 0;

            
        }
        #endregion
        #region Örnek-6 (Kendini Çağıran recursive Metotlar Faktöriyel Örneği)
        static int faktöriyel(int a)
        {
            if(a == 0)
            {
                return 1;
            }
            else
            {
                return a*faktöriyel(a - 1);  
            }
        }
        #endregion
    }
}
