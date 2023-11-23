using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Diagnostics.Eventing.Reader;
using System.Linq;
using System.Runtime.InteropServices;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace NTPHAFTA5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Operator Aşırı yükleme (Sayı Sınıfı Örneği)
            Console.WriteLine("Operatör Aşırı Yükleme (Sayı Sınıfı Örneği)");
            Sayı sayi1 = new Sayı(50);
            Sayı sayi2 = new Sayı(10);

            Console.WriteLine((sayi1 || sayi2).sayi);
            Console.WriteLine((sayi1 && sayi2).sayi);
            Console.ReadLine();
            #endregion

            #region Operator Aşırı yükleme (Karmasik Sayi Örneği)
            Console.WriteLine("\nOperator Aşırı yükleme (Karmaşık Sayı Örneği)");
            KarmasikSayi ka1 = new KarmasikSayi();
            ka1.Gercek = 13;
            double dble1 = ka1; // implicit
            int int1 = (int)ka1; // explicit 
            Console.WriteLine(int1);
            Console.ReadLine();
            #endregion

            #region İndexleyiciler - 1 Örneği 
            // Tek boyutlu indexleyici Örneği
            Console.WriteLine("\nTek Boyutlu İndexleyici Örneği ");
            myClass m1 = new myClass(55);
            m1[1] = 15;
            m1[17] = 30;
            m1[-11] = 20;
            m1[-4] = 10;
            Console.WriteLine(m1[2]);
            Console.ReadLine();

            // Çift Boyutta İndexleyici Örneği 
            Console.WriteLine("\nÇift Boyutlu İndexleyici Örneği\n ");
            myClass m2 = new myClass(2);
            Console.WriteLine("m2 deki sayının başlangıç değeri : " + m2.Sayi);
            m2[2, 5] = 10;
            Console.WriteLine("m2 ye İndexleyici ile uygularsak ne oluyor sonuc bu : " + m2.Sayi);
            Console.ReadLine();
            #endregion

            #region İndexleyiciler - 2 Örneği 

            Console.WriteLine("\nİndexleyiciler - 2 Örneği");
            indexleyici d1 = new indexleyici(10);
            for (int i = 0; i < d1.diziBoyutu(); i++)
            {
                Console.WriteLine("d1[{0}]={1}", i, d1[i] = i);
            }
            Console.ReadLine();
            #endregion

            #region Struct - 1 Örneği
            Console.WriteLine("\nStruct - 1 Örneği ");
            Ogrenci öğrenci1 = new Ogrenci();
            öğrenci1.Ad = "Ahmet";
            öğrenci1.Soyad = "Karabasan";
            öğrenci1.Numara = 23;
            Console.WriteLine("Adı : {0} , Soyadı : {1} , Numarası : {2}", öğrenci1.Ad, öğrenci1.Soyad, öğrenci1.Numara);
            Console.ReadLine();
            #endregion

            #region Struct - 2 Örneği   
            Console.WriteLine("\nStruct - 2 Örneği");
            Ogrenci2 öğrenci2 = new Ogrenci2(12, "Muhammed", "Kaleli");
            Console.WriteLine("Öğrenci Adı : {0} , Soyadı : {1} , No : {2}", öğrenci2.Ad, öğrenci2.Soyad, öğrenci2.No);
            Console.ReadLine();
            #endregion

            #region Struct - 3 Örneği 
            Console.WriteLine("\nStruct - 3 Örneği");
            Yapı yapı1 = new Yapı();
            Yapı yapı2 = new Yapı();
            yapı1.a = 10;
            yapı1.b = 20;
            Console.WriteLine("Atama Öncesi yapı1 a = {0}, b = {1} ", yapı1.a, yapı1.b);
            yapı2 = yapı1;
            yapı1.a = 15;
            yapı1.b = 25;
            Console.WriteLine("Atama Sonrası yapı2 a ={0}, b = {1} ", yapı2.a, yapı2.b);
            Console.WriteLine("Atama Sonrası yapı1 a ={0}, b = {1} ", yapı1.a, yapı1.b);

            Console.WriteLine("\nYapı için Değerler ");

            Sınıf sınıf1 = new Sınıf();
            Sınıf sınıf2 = new Sınıf();
            sınıf1.a = 100;
            sınıf1.b = 200;
            sınıf2 = sınıf1;
            sınıf1.a = 10;
            sınıf1.b = 120;
            Console.WriteLine();
            Console.WriteLine("\nSınıf için Değerler ");
            Console.WriteLine("sınıf1\n a = {0} b = {1} ", sınıf1.a, sınıf1.b);
            Console.WriteLine("sınıf2\n b = {0} b = {1} ", sınıf2.a, sınıf2.b);
            Console.ReadLine();
            #endregion

            #region Enum - 1
            Console.WriteLine(Günler.ÇARŞAMBA);
            Console.WriteLine("Lütfen notunuzu giriniz: ");
            Notlar not = (Notlar)Convert.ToByte(Console.ReadLine());
            Console.WriteLine("Ders Geçip geçmeme durumunuz: " + not);
            Console.ReadLine();
            #endregion

            #region Enum - 2 (Bölümler Örneği)
            Console.WriteLine("\nEnum - 2 Bölümler Örneği");
            bolumler b;
            for(b = bolumler.Yazılım_Müh; b <= bolumler.Makina_Müh; b++)
            {
                Console.WriteLine("{0}'nın Etiketi : {1}" , b,(int)b);
            }
            Console.ReadLine();

            #endregion

            #region Using Kullanımı
            using (denemeSınıfı deneme1 = new denemeSınıfı())
            {
                Console.WriteLine("Using Bloğu");
            }
            Console.WriteLine("using bloğu dışı");
            Console.ReadLine();
            #endregion

            #region Library Ekleme ve Oluşturma
            Console.WriteLine("\nLibrary ekleme ve Oluşturma ");
            // Oluşturmak istediğimiz kütüphaneyi dosya sekmesinden dll seçerek oluşturuyoruz
            // daha sonra derledikten sonra dll olarak elimize geliyor
            // sağ taraftaki başvurular kısmına ekleyerek dll eklemiş oluruz
            Console.WriteLine(Matematiksel_İslemler.program.çarp(15,4));
            Console.ReadLine();
            #endregion
        }
    }
    #region Operator Aşırı Yükleme (Karmaşık Sayı Örneği)
    // Operator Metotları
    //public static <dönüş_tipi> operator <operator_tipi> (<parametre_tipi> operand1, <parametre_tipi> operand2)
    //Örnek 
    class KarmasikSayi
    {
        private double mGercek;
        private double mSanal;
        public double Gercek { get; set; }
        public double Sanal { get; set; }
        public KarmasikSayi(double x, double y)
        {
            mGercek = x;
            mSanal = y;
        }

        public KarmasikSayi()
        {
            mGercek = 0;
            mSanal = 0;
        }
        public KarmasikSayi(KarmasikSayi k)
        {
            mGercek = k.mGercek;
            mSanal = k.mSanal;
        }
        public void yaz()
        {
            if (mSanal > 0)
            {
                Console.WriteLine("{0}+{1}i", mGercek, mSanal);
            }
            else
            {
                Console.WriteLine("{0}-{1}i", mGercek, -mSanal);
            }
        }
        public static KarmasikSayi operator +(KarmasikSayi a, KarmasikSayi b)
        {
            double gercektoplam = a.Gercek + b.Gercek;
            double sanaltoplam = a.Sanal + b.Sanal;
            return new KarmasikSayi(gercektoplam, sanaltoplam);
        }
        public static KarmasikSayi operator -(KarmasikSayi a, KarmasikSayi b)
        {
            double gercekcıkarma = a.Gercek - b.Gercek;
            double sanalcıkarma = a.Sanal - b.Sanal;
            return new KarmasikSayi(gercekcıkarma, sanalcıkarma);
        }
        // == > < != gibi karşılaştırma operatorleri zıtlarıda tanımlanmak zorundadır!!!!
        public static bool operator ==(KarmasikSayi a, KarmasikSayi b)
        {
            if (a.Sanal == b.Sanal && a.Gercek == b.Gercek) return true;
            else return false;
        }
        public static bool operator !=(KarmasikSayi a, KarmasikSayi b)
        {
            return !(a == b);
        }
        // true yada false operatorleri aşırı yüklenebilir
        public static bool operator true(KarmasikSayi a)
        {
            if (a.Sanal != 0 || a.Gercek != 0)
                return true;
            else return false;

        }
        public static bool operator false(KarmasikSayi a)
        {
            if (a.Sanal == 0 || a.Gercek != 0)
            {
                return true;

            }
            else return false;
        }

        // eğer tür dönüştürme istiyorsak
        // Örneğin K bir Karmasik sayi türünden nesne ise:
        // int a = k ;  atamasının geçersi olması için aşağıdaki gibi yapabiliriz ve 
        // implicit yada explicit keywordlerinden istediğini kullan
        // İmplicit bilinçsiz tür dönüşümünde kullanılır
        // explicit ise () cast ettiğimizde geçerli olmasını sağlayan keyword
        public static implicit operator double(KarmasikSayi a)
        {
            return a.Gercek;
        }
        public static explicit operator int(KarmasikSayi a)
        {
            return ((int)a.Gercek);
        }
    }
    #endregion

    #region Operator Aşırı yüklemesi (Sayı Sınıfı Örneği)
    class Sayı
    {
        public int sayi;
        public Sayı(int sayi)
        {
            this.sayi = sayi;
        }
        public static bool operator true(Sayı sayı)
        {
            return true;
        }
        public static bool operator false(Sayı sayı)
        {
            return false;
        }
        public static Sayı operator &(Sayı a, Sayı b)
        {
            return new Sayı(20);
        }
        public static Sayı operator |(Sayı a, Sayı b)
        {
            return new Sayı(30);
        }
    }

    #endregion

    #region İndexleyiciler - 1

    // İndexleyici tanımlarken tanım şu şekilde olur.
    // erişim belirleyicisi ElemanTipi this[indexTipi index]
    class myClass
    {
        int sayi;
        public myClass(int sayi)
        {
            this.Sayi = sayi;
        }

        // tek boyutlu indexleyici aşağıdaki gibidir.
        public int this[int index]
        {
            get { return Sayi; }
            set
            {
                if (index < 0) { Sayi -= value; }
                else if (index > 0) { Sayi += value; }
                else { Sayi = value; }
            }
        }
        // çift boyutlu indexleyici aşağıdaki gibidir
        public int this[int i, int j]
        {
            get { return i + j + Sayi; }
            set { Sayi = i * j + value; }
        }

        public int Sayi { get => sayi; set => sayi = value; }
    }
    #endregion

    #region İndexleyiciler - 2 
    class indexleyici
    {
        private int[] dizi;
        public indexleyici(int diziUzunluk)
        {
            dizi = new int[diziUzunluk];
        }
        public int diziBoyutu()
        {
            return dizi.Length;
        }
        public int this[int index]
        {
            get
            {
                return dizi[index];
            }
            set { dizi[index] = value; }
        }
    }
    #endregion

    #region Struct - 1 
    // Structlar değer tiplidir ve struct türündeki veriler stack alanında saklanır
    // kalıtım desteklemez.
    // Struct nesnesi oluşturmak için yine new kullanılır
    // Yapıcı metota ilk değer ataması yapılmak zorundadır.
    // Yapı nesneleri faaliyet alanları bitince otomatik stackden silnirler
    // bu yüzden destructor yıkıcı metotları yoktur.
    // set get kullanılabilir.
    // struct atama operatoru ile kopyalanır fakat sınıf nesnelerinde atama işlemi sonucu referanslar kopyalanır.
    struct Ogrenci
    {
        public int Numara;
        public string Ad;
        public string Soyad;
    }
    struct Ogrenci2
    {
        public int No;
        public string Ad;
        public string Soyad;

        public Ogrenci2(int no, string ad, string soyad)
        {
            this.No = no;
            this.Ad = ad;
            this.Soyad = soyad;
        }
    }
    struct Yapı
    {
        public int a;
        public int b;
    }

    class Sınıf
    {
        public int a;
        public int b;

    }
    #endregion

    #region Enum
    // Enum sabitlerden oluşan bir yapıdır . Belli sayısal değerler alarak sabitleri oluşturmamızı sağlar.
    enum Günler { PAZARTESİ, SALI, ÇARŞAMBA, PERŞEMBE, CUMA, CUMARTESİ, PAZAR };

    // Tipini değiştirebiliriz.
    enum Notlar : byte { basarisiz, geçmez, gecer, orta, iyi, pekiyi };


    enum bolumler

    {
        Yazılım_Müh,Elektrik_Elektronik_Müh, Mektronik_Müh, Bilgisayar_Müh, Makina_Müh
    }
    //Farklı sayı değerlerine karşılık yapmak istiyorsan aşağıdaki gibi yapabilrsn
    enum notlar2{kötü , arada = 2 , çokiyi = 10};


    #endregion

    #region Using Kullanımı 
    // yukarda usingi IDisposeble özelliğe sahip olan sınıf için farklı bir biçimde kullandık.
    class denemeSınıfı : IDisposable
    {
        public void Dispose()
        {
            Console.WriteLine("Dispose metotu çağrıldı.");
            GC.SuppressFinalize(this);
        }
    }
    #endregion

    #region Bölüm Sonu Örnekleri
    #region Operator Aşırı yükleme örnekleri
    class Zaman
    {
        public int Saat;
        public int Dakika;
        public int Saniye;
        public Zaman(int saat , int dakika , int saniye)
        {
            Dakika = dakika + saniye / 60;
            Saniye = saniye%60;
            Saat = saat + dakika / 60;
            Dakika = dakika % 60;
        }
        public static Zaman operator +(Zaman a, Zaman b)
        {
            int toplamDakika = a.Dakika + b.Dakika;
            int toplamSaat = a.Saat + b.Saat;
            int toplamSaniye = a.Saniye + b.Saniye;
            return new Zaman(toplamSaat , toplamDakika , toplamSaniye);
        }
    }
    #endregion

    #endregion

}
