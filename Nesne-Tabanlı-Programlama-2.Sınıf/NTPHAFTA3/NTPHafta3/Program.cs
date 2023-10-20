using System.Threading.Channels;

namespace NTPHafta3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Operatörler
            Console.WriteLine("Operatörler");
            // as operatörü
            // genellikle object türündeki nesneleri farklı bir türe cevirmek için kullanılır.
            {
                object i = "50";
                string s = i as string;
                //NOT as operatörü sadece referans tipde değişkenlerde kullanılır. Çünkü eşitliğin sağında bir değer olmassa null atar değer tipli değişkenlerde bu olmaz.

            }
            // is Operatörü
            {
                Console.WriteLine("\nis operatoru");
                int i = 50;
                bool b = i is int;
                Console.WriteLine(b);
                cizgiEkle();
            }
            // bitsel değil operatörü ~  
            {
                //Tek operand alan operatörü bir değer içindeki bitlerin teker teker
                // tersini alır.
                //0000 1111 sayısının bitsel değili 1111 0000 olur.
                Console.WriteLine("\nbitsel değil operatörü ~");
                byte b1 = 254;
                byte b2 = (byte)~b1;
                Console.WriteLine(b2);
                cizgiEkle();
            }
            //Ternary üçlü operatör
            {
                Console.WriteLine("\nTernary operatör ");
                int sayı =12;
                String sonuc = sayı < 10 ? "sayı 10 dan kücük" : "10 a eşit yada büyük";
                Console.WriteLine(sonuc);
                cizgiEkle();
            }
            // sizeof türün bellekte kapladığı alan
            Console.WriteLine("\nsizeof operatörü ");
            Console.WriteLine("byte : "+ sizeof(byte));
            Console.WriteLine("int : "+ sizeof(int));
            Console.WriteLine("double : "+ sizeof(double));
            cizgiEkle();

            //typeof operatörü
            Console.WriteLine("\ntypeof öperatörü");
            {
                Type t;
                int i = 14;
                float f = 12.21F;
                t = typeof(int);
                Console.WriteLine(t.Name);
                cizgiEkle();
            }
            //default operatörü
            Console.WriteLine("\ndefault operatörü");
            //tanımlanan türün default değerini yollarç
            {
                Console.WriteLine(default(decimal));
                Console.WriteLine(default(int));
                Console.WriteLine(default(bool));
            }
            #endregion
            #region Koşul İfadeleri
            // if kullanımı 
            Console.WriteLine("\nif kullanımı:");
            {
                string s;int a, b, c;
                Console.Write("Birinci sayıyı giriniz: ");
                s = Console.ReadLine();
                a = Int32.Parse(s);
                Console.Write("İkinci sayıyı giriniz: ");
                s = Console.ReadLine();
                b = Int32.Parse(s); 
                Console.Write("Üçüncü sayıyı giriniz: ");
                s = Console.ReadLine();
                c = Int32.Parse(s);
                if (a >= b && a >= c) Console.WriteLine("En büyük "+b);
                else if (b >= c) Console.WriteLine("En büyük "+ b);
                else Console.WriteLine("En büyük "+c);
                cizgiEkle();

            }
            // switch kullanımı
            {
                Console.WriteLine("\nSwitch kullanımı");
                String s; int a;
                Console.WriteLine("Kaçıncı sınıfsınız?");
                s = Console.ReadLine();
                a = Int32.Parse(s);
                switch (a) 
                {
                    case (0):
                        case (1):
                        Console.WriteLine("Daha yenisiniz."); break;
                        case (2):
                        Console.WriteLine("Mirasçısınız"); break;
                        case (3):
                        Console.WriteLine("Ev sahibisiniz."); break;
                        case (4):
                        Console.WriteLine("Misafirsiniz");break;
                    default:
                        Console.WriteLine("Siz okulu uzatmışsınız");goto case 1;
                }
                cizgiEkle();
            }
            #endregion
            #region Döngüler
            Console.WriteLine("\nDöngüler");
            // for döngüsü
            { Console.WriteLine("Bir sayı girin.");
                int n = Convert.ToInt32(Console.ReadLine());
                int toplam = 0;

                for (int i = 1; i<= n; i++)
                {
                    toplam = toplam + i;
                }
                Console.WriteLine("1'den {0}'e kadar olan sayıların toplamı {1}'dir.",n,toplam);
                Console.WriteLine();
            }
            //while döngüsü
            {
                int i = 0;
                while (i < 10)
                {
                    Console.WriteLine("Bu döngü devam etmekte ve sayı : "+ i);
                    i++;
                }
            }
            //foreach döngüsü
            String[] ad = { "ali", "efe", "imran", "zübeyir", "mahmut" };
            foreach(string s in ad)
            {
                Console.Write(s + " ");
            }
            cizgiEkle();
            #endregion
            #region Jump Atlama deyimleri
            Console.WriteLine("\nJump atlama deyimleri");
            // örnek 1
            {
                int sayı, t = 0;
                while (true)
                {
                    Console.WriteLine("Negatif bir sayı girin");
                    sayı = Convert.ToInt32(Console.ReadLine());
                    if(sayı == 0) break;
                    if (sayı > 0)
                    {
                        Console.WriteLine("Pozitif sayı girdiniz tekrar deneyiniz..");
                        continue;
                    }
                    t = t + sayı;
                }
                Console.WriteLine("Toplam : {0} ",t);
            }
            // örnek 2 
            {
                int m = 0;
                int n = 10;
            bas:
                m++;
                if (m <= n) goto bas;
                else goto son;
                son: Console.WriteLine("m= "+m);
            }
            cizgiEkle();

            #endregion
            #region Random Sınıfı
            Console.WriteLine("\nRandom Sınıfı");
            // Random rastgele sayı üretmek için bir sınıftır 
            // kullanılması için nesnesinin oluşturulması gerekir
            {
                Random rnd = new Random();
                int rastgelesayı = rnd.Next(10, 20); //10 dahil 20 hariç
                Console.WriteLine("10 dahil 20 hariç rastgele sayı : " + rastgelesayı);
                rastgelesayı = rnd.Next(0, 50); // 0 ile 50 arası sayı 
                Console.WriteLine("0 ile 50 arasından rastgele sayı : " +rastgelesayı);
                rastgelesayı = rnd.Next(); // herhangi bir rastgele sayı üretir
                Console.WriteLine("Rastgele sayı: "+ rastgelesayı);
                double rastgelesayı2 = rnd.NextDouble();// 0.0 ile 1 arası değer döndürür
                Console.WriteLine("0.0 ile 1 arasından rastgele sayı: "+rastgelesayı2);


            }
            #endregion
            #region Diziler
            Console.WriteLine("\n Diziler");
            // düzenli iki boyutlu dizilerde [,] böyle tanımlanır
            // düzensizlerde ise [][] kullanımı mevcuttur.

            { int[,] dizi = new int[4, 4]; int k = 1;
                for (int i = 0; i < 4; i++)
                    for (int j = 0; j < 4; j++)
                    {
                        dizi[i, j] = k;
                        dizi[j, i] = k;
                            k++;
                    }k = 1;
                foreach(int x in dizi)
                {
                    if (k % 4 == 0)
                    {
                        Console.Write(x + " "); 
                        Console.WriteLine();
                    }
                    else
                    {
                        Console.WriteLine(x + " "); k++;
                    } 

                }

                
                    
            }

            #endregion









            static void cizgiEkle()
            {
                Console.WriteLine("\n------------------");
            }
        }

    }
}