namespace NTPHAFTA2
{
    internal class NTPHafta2
    {
        static void Main(string[] args)
        {
            #region Değişkenlerde Scope 
            Console.WriteLine("Değişkenlerde Scope");
            {
                short x = 29;
                Console.WriteLine(x);
            }
            {
                short x = 30;
                Console.WriteLine(x);
            }
            // örnek 2 
            {
                short y = 8;
                {
                    // short  y = 10; tekrar tanımlarsan hata alırsın
                    // ama atama yapabilrsin
                    y = 19;
                    Console.WriteLine(y);
                }
            }
            cizgiEkle();
            #endregion
            #region Deger Tipleri sayfa-25 örnek
            Console.WriteLine("Deger Tipleri sayfa-25 örnek");
            {
                bool a = new bool(); byte a1 = new byte();
                char a2 = new char(); decimal a3 = new decimal();
                double a4 = new double(); float a5 = new float();
                Console.WriteLine(a);
                Console.WriteLine(a1);
                Console.WriteLine(a2);
                Console.WriteLine(a3);
                Console.WriteLine(a4);
                Console.WriteLine(a5);
            }
            cizgiEkle();
            #endregion
            #region Object ve String Türü
            Console.WriteLine("Object ve String türü Sayfa-31 örnek");
            {
                Object nesne;
                nesne = 10;
                Console.WriteLine(nesne.GetType);
                nesne = "B";
                Console.WriteLine(nesne.GetType);
                nesne = 8.78F;
                Console.WriteLine(nesne.GetType);
                nesne = false;
                Console.WriteLine(nesne.GetType);
                nesne = 549.34M;
                Console.WriteLine(nesne.GetType);
            }
            cizgiEkle();

            #endregion
            #region var keyword
            {
                Console.WriteLine("var Keywordü");
                // var compile time da değişkenin türüne atanır
                var a = "bu bir string";
                Console.WriteLine(a);
                //a = 10;   yapamassın var tipindeki değişkene atanan ilk tipte aynı atamalar yapılmalı
                a = "bu ikinci string";
                Console.WriteLine(a);

            }
            cizgiEkle();
            #endregion
            #region Tür Dönüşümleri
            {
                //bilinçsiz tür dönüşümleri
                Console.WriteLine("Tür Dönüşümleri");
                byte a = 20;
                int b;
                b = a;
                Console.WriteLine(b);

                float f = 20f;
                double d = f;
                Console.WriteLine(d);

                char c = 'a';
                decimal m = c;
                Console.WriteLine(m);
                // Örnek sayfa 43
                float sayi = 32.32f;
                double sayi2 = sayi;
                Console.WriteLine("sayi'nin değeri= " + sayi + "\nsayi2'nin değeri= " + sayi2);
                // Bilinçli tür dönüşümleri
                int int1 = 400;
                byte byte1 = (byte)int1;
                Console.WriteLine(byte1);
                // Boxing İşlemi
                int i = 60;
                object o =i; //boxing
                // Unboxing 
                int i2 = 123;
                object o2 = i2;
                int j = (int)o2;
                
            }
            #endregion


        }


        static void cizgiEkle()
        {
            Console.WriteLine("----------------------");
        }

    }


}