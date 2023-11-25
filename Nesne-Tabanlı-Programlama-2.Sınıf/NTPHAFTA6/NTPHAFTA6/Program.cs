using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NTPHAFTA6
{
    class Program
    {
        static void Main(string[] args)
        {
            #region İsim Alanları
            // tip.Parse()  string => istenilen tip
            string a = "15.43";
            double b = double.Parse(a);

            // Nesne.CompareTo(Object o) girilen nesneyle Nesneyi karşılaştırır
            // eşitse 0 büyükse 1 küçükse -1
            int d = 13; int c = 75;
            Console.WriteLine(c.CompareTo(d) + " döndürür çünkü c d den büyük");

            // Nesne.Equals(Object o ) nesneler eşitmi true yada false döndürür
            string isim1 = "Ahmet";
            string isim2 = "Ahmet";
            Console.WriteLine("\n" + isim1.Equals(isim2) + ": doğrudur çünkü iki nesnede aynı değerdir. ");

            // Nesne.toString() nesne değeri => stringe çeviri
            double a2 = 14.23;
            a2.ToString();

            Console.WriteLine("--------Double ve Float Özel Metotlar------------\n");
            // double ve floata özel olan metotlar
            // .IsInfinity() true  yada false sonsuz mu değilmi
            // .IsNaN() : Anlamlı bir sayı mı true yada false
            // .IsPositiveInfinity: ve .isNegativeİnfinity sayının + yada - sonsuza mı gittiğini test eder.
            double b2 = 1213.341;
            Console.WriteLine("\n" + Double.IsInfinity(b2));
            Console.WriteLine(Double.IsNaN(b2));
            Console.WriteLine(Double.IsNegativeInfinity(b2));

            // char veriler için de bazı özel metotlar var
            // char.getNumericValue(char x) : eğer sayısal karakter içeriyorsa o sayıyı  yoksa -1 döndürür.
            Console.WriteLine("-------------Char İşlemleri------------\n");
            char a3 = '4';
            char b3 = ' ';
            char harf = 'A';
            Console.WriteLine("\n" + Char.GetNumericValue(a3));
            Console.WriteLine("Karakter bir sayı mı ? (isDigit) " + Char.IsDigit(a3));
            Console.WriteLine("Karakter bir harf mi ? (isLetter)" + Char.IsLetter(a3));
            Console.WriteLine("Karakter Boşluk gibi ayırıcı ise ? (isSeperator) " + Char.IsSeparator(b3));
            Console.WriteLine("Karakter büyük harf mi küçük harf mi ? (isUpper) , (isLower)" + Char.IsLower(harf) + " " + Char.IsUpper(harf));
            Console.WriteLine("Karakter boşluk karakteri yada TAB ise ? (isWhiteSpace) " + Char.IsWhiteSpace(b3));

            //Decimal Değerler için de Metotlar vardır.
            Console.WriteLine("------------Decimal İşlemleri-----------\n");
            decimal sayı1 = 12.5453M;
            decimal sayı2 = 15.2132M;
            decimal sayı3 = 135;
            Console.WriteLine(Decimal.Add(sayı1, sayı2)); // Ekleme
            Console.WriteLine(Decimal.Divide(sayı1, sayı2)); // Bölme
            Console.WriteLine(Decimal.Multiply(sayı1, sayı2));  // Çarpma
            Console.WriteLine(Decimal.Subtract(sayı1, sayı2)); // Çıkarma
            Console.WriteLine(Decimal.Floor(sayı1)); // Aşağı yuvarlar
            Console.WriteLine(Decimal.Ceiling(sayı1)); // Yukarı yuvarlar.
            Console.WriteLine(Decimal.Negate(sayı1)); // Negatifini yollar
            Console.WriteLine(Decimal.Round(sayı1, 2)); // Sayının virgülden sonraki kaç hanesinin tutulacağını belirler. Sonra onu en yakın yere yuvarlar
            Console.WriteLine(Decimal.Truncate(sayı1)); // tam kısmı tutar yuvarlama yok! 
            int[] diziDecimal = Decimal.GetBits(sayı3);/*decimal sayı tanımlarken kullandığımız yapıcı işlevdeki beş parametreyi int türündeki bir dizi olarak tutar.*/
            for (int i = 0; i < diziDecimal.Length; i++)
            {
                Console.Write(diziDecimal[i] + "-");
            }

            //DateTime Özellikleri
            Console.WriteLine("\n ------------Datetime Özellikleri---------\n");
            DateTime bugün = new DateTime();
            bugün = DateTime.Now;
            Console.WriteLine(DateTime.Now);
            Console.WriteLine(bugün.Date);
            Console.WriteLine(DateTime.Now.DayOfYear);
            Console.WriteLine(DateTime.Now.Month);
            Console.WriteLine(DateTime.Now.DayOfWeek);
            Console.WriteLine(DateTime.Now.Day);
            Console.WriteLine(bugün.TimeOfDay);
            Console.WriteLine(DateTime.Now.Hour);
            Console.WriteLine(DateTime.Now.Minute);
            Console.WriteLine(DateTime.Now.Second);
            Console.WriteLine(DateTime.Now.ToShortDateString());
            Console.WriteLine(DateTime.Now.ToLongDateString());
            //Mevcut tarihe zaman ekleyebilirsin.
            Console.WriteLine(bugün.AddDays(5).AddHours(12));
            Console.WriteLine(bugün.AddDays(-5).AddHours(-10));


            Console.WriteLine("---------BitConverter İşlemleri-----------\n");
            if (BitConverter.IsLittleEndian)
            {
                Console.WriteLine("sisteminiz düşük mimariyi destekliyor ise en anlamlı bit sonda");
            }
            else
                Console.WriteLine("sisteminiz yüksek mimariyi destekliyor ise en anllamlı bit başta1");

            // BitConverter.GetBytes() bite çevirmek için
            // isLittleEndian Mimariyi belli eder.
            // true ise en anlamlı bit sonda düşük mimari demek
            // false ise en anlamlı bit sonda yüksek mimari demek
            int denemesayı12 = 258;
            byte[] bitDizisi = BitConverter.GetBytes(denemesayı12);
            foreach (byte i in bitDizisi) {
                Console.Write(i + " ");
            }
            Console.WriteLine("\nsayının diziden 10dalıklı dönüşmüş hali:" + BitConverter.ToInt32(bitDizisi, 0));

            //System.Buffer tür bilgisinden bağımsız byte düzeyinde veri işler
            Console.WriteLine("-----------System.Buffer İşlemleri-----------\n");
            byte[] kaynak = { 1, 2, 3, 1};
            short[] hedef = new short[4];
            Buffer.BlockCopy(kaynak, 0, hedef, 0, 4);
            foreach (short shortsayı in hedef)
            {
                Console.Write(shortsayı + " ");
            }
            //derleyici karşılaştığı ilk bytı düşük anlamlı byte 
            // ikincisini ise yüksek anlamlı byte aktardı.

            //String İşlemleri
            Console.WriteLine("\n-----------String İşlemleri------------\n");
            string a5 = "c# programa dili";
            char[] dizichar = { '1', '2', '3', '4' };
            string s1 = new string(dizichar); //1234
            string s2 = new string(dizichar,1,2); // 1.indexden beri 2 eleman stringe
            string s3 = new string('X',10);//XXXXXXXXXX

            // String.Concat() ard arda stringleri ekler.
            Console.WriteLine(String.Concat(s3,a5));
            // String.Compare iki stringi karşılaştırır.
            Console.WriteLine(String.Compare(s3,s2,false));// büyük küçük duyarsınz
            Console.WriteLine(String.Compare(s3,2,a5,6,5));
            // String.IndexOf stringde karakterin kaçıncı indiste olduğunu döndürür.
            string deneme123 = "Firat Üniversitesi";
            Console.WriteLine(deneme123.IndexOf("ver"));
            Console.WriteLine(deneme123.IndexOf("t"));
            // String.Trim stringde başında ya da sonunda olan boşluk ya da belirli karakterleri atmamızı sağlar.
            string a11 = "         ahmet            ";
            Console.WriteLine("Trim etmeden önce({0})", a11);
            Console.WriteLine("Trim ettikten sonra ({0})",a11.Trim());

            // Biçimlendirme
            string ad = "Esad";
            Console.WriteLine("Merhabalar {0,10}",ad); // soluna 10 boşluk ekler
            Console.WriteLine("Merhabalar {0,-10}",ad); // sağına 10 boşluk ekler
            #endregion
            #region Kalıtım - 1
            Console.WriteLine("----------Kalıtım - 1----------\n");
            Kedi kedi = new Kedi();
            kedi.turu = "Van";
            kedi.kilo = 20;
            kedi.boy = 100;
            kedi.ÖzellikGöster();
            kedi.TurGöster();
            #endregion
            #region Nesne Tabanlı programlama base-1
            Console.WriteLine("---------Nesne Tabanlı Programlama base-1--------\n ");
            A A1 = new A(1,3);
            B B1 = new B(1,4,2,6);
            #endregion
            #region Çoklu Kalıtım
            Console.WriteLine("\n-----------Çoklu Kalıtım---------\n");
            Console.WriteLine("\nA2 nesnesi oluşturuluyor...\n");
            A2 A2sınıfÖrnek1 = new A2(2);
            Console.WriteLine("\nB2 nesnesi oluşturuluyor...\n");
            B2 B2sınıfÖrnek1 = new B2(4,3);
            Console.WriteLine("\nC2 nesnesi oluşturuluyor...\n");
            C2 C2sınıfÖrnek1 = new C2(4,1,5);

            #endregion
            #region Name Hiding
            Console.WriteLine("\n-----------Name Hiding---------\n");
            firstClass f1 = new firstClass();
            secondClass s22 = new secondClass();
            f1.Selamla();
            s22.Selamla();
            #endregion
            Console.ReadLine();

        }
    }
    #region Nesne Tabanlı Programlama

    #region Kedi Hayvan Örneği Basic - 1 

    class Hayvan
    {
        public double boy;
        public double kilo;
        public void ÖzellikGöster()
        {
            Console.WriteLine("Boy = {0}",boy);
            Console.WriteLine("Kilo = {0}", kilo);
        }
    }
    class Kedi : Hayvan
    {
        public string turu;
        public void TurGöster()
        {
            Console.WriteLine("Tür = "+ turu);
        }
    }
    #endregion
    #region Base Muhabbeti
    class A
    {
        public int Özellik1;
        public int Özellik2;
        public A(int özellik1, int özellik2)
        {
            Özellik1 = özellik1;
            Özellik2 = özellik2;
        }
    
    }
    class B : A
    {
        public int Özellik3;
        public int Özellik4;
        public B(int özellik3, int özellik4, int özellik1, int özellik2) : base(özellik1, özellik2)
        {
            Özellik3 = özellik3;
            Özellik4 = özellik4;
        }
    }
    #endregion
    #region Çoklu Kalıtım
    class A2
    {
      public  int sayıA;
        public A2()
        {
            Console.WriteLine("A2 default constructoru çalıştı");
        }
        public A2(int a)
        {
            sayıA = a;
            Console.WriteLine("A2 gelişmiş contructor çalıştı.");
        }
    }
    class B2 : A2
    {
        public int sayıB;
        public B2()
        {
            Console.WriteLine("B2 defaut contructoru çalıştı.");
        }
        public B2(int sayıB)
        {
            this.sayıB = sayıB;
            Console.WriteLine("B2 gelişmiş contructor çalıştı.");
        }


        public B2(int b,int a):base(a)
        {
          sayıB = b;
            Console.WriteLine("B2 gelişmiş contructor çalıştı.");
        }
    }
    class C2 : B2 
    {
        public int sayıC;
        public C2()
        {
            Console.WriteLine("C2 default contructor çalıştı.");
        }
        public C2(int c)
        {
            sayıC = c;
            Console.WriteLine("C2 gelişmiş contructor çalıştı.");
        }
        public C2(int c , int a,int b) :base(a,b)
        {
            Console.WriteLine("C2 gelişmiş contrcutor çalıştı.");
            sayıC = c;
        }
    }
    #endregion
    #region Name Hiding
    class firstClass
    {
        public void Selamla()
        {
            Console.WriteLine("firstClass nesnesinin Selamla Methodundan Selamlar.");
        }
    }
    class secondClass:firstClass
    {
        // saklamak istediğimizi new anahtar sözcüğü ile belirityoruz
        public new void Selamla()
        {
            Console.WriteLine("secondClass nesnesinin Selamla Methodundan selamlar.");
        }
    }
    #endregion
    #endregion

}

