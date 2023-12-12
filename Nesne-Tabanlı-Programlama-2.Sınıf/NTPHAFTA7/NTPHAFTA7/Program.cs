using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics.Eventing.Reader;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;

namespace NTPHAFTA7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Virtual Yapılar Örnek -1
            A a = new A();
            B b = new B();
            C c = new C();

            a.method();
            b.method();
            c.method();
            #endregion

            #region Abstract Sınıflar ve Metotlar örnek -1
            Console.WriteLine("\nAbstract Sınıflar ve Metotlar Örnek -1\n");
            //A2 a2 = new A2(); gördüğün gibi soyut sınıfların nesnesi olmaz
            B2 b2 = new B2();
            b2.method();

            b2.Özellik = 12;
            Console.WriteLine(b2.Özellik);

            #region Arayüzler 
            Console.WriteLine("---------Arayüzler--------");
            Hesaplama h1 = new Hesaplama(10, 5);
            h1.ekle();
            #endregion
            #endregion

            #region Try-Catch Yapısı-1
            Console.WriteLine("\nTry-Catch yapısı -1");
            try
            {
                int a334 = 0;
                int b234 = 14;
                Console.WriteLine(b234 / a334);
            }
            catch (DivideByZeroException e)
            {
                Console.WriteLine(e.Message);
                Console.WriteLine(e.StackTrace);
            }
            finally
            {
                Console.WriteLine("Sıfırla bölme yapamassın");
            }
            #endregion

            #region Exception Oluşturma Örnek-1
            Console.WriteLine("\nException Oluşturma\n");
            try
            {
                Notlar not1 = new Notlar();
                not1.not = -1;
                Console.WriteLine(not1.not);
            }
            catch (Exception ex_nesne)
            {
                Console.WriteLine(ex_nesne.Message);
            }

            #endregion

            #region Delegate Yapısı Örnek -1 
            Console.WriteLine("\nDelegate Yapısı\n");
            İşlem.Temsilci temsilci = new İşlem.Temsilci(İşlem.toplama);
            temsilci = temsilci + new İşlem.Temsilci(İşlem.çıkar);
            temsilci(10, 7);
            #endregion

            #region Delegate Yapısı Örnek-2
            Console.WriteLine("\nDelegate Yapısı Örnek-2\n");
            deneme denemeSınıfıNesnesi = new deneme();
            deneme.temsilci nesne = null;
            nesne += new deneme.temsilci(deneme.Metot1);
            nesne += new deneme.temsilci(deneme.Metot2);
            Delegate[] delegateDizisi = nesne.GetInvocationList();

            delegateDizisi[0].DynamicInvoke();
            delegateDizisi[1].DynamicInvoke();
            #endregion

            #region Delegate Yapısı Örnek-3
            Console.WriteLine("\nDelegate Yapısı Örnek-3\n");
            İsimsiz.temsilci t = delegate (double e, double y)
            {
                return e + y;
            };
            double toplam = t(12, 23);
            Console.WriteLine(toplam);
            #endregion

            #region Olaylar(Events)
            Console.WriteLine("\n------Olaylar (Events)--------\n");
            buton buton1 = new buton();
            buton1.Olay += new buton.OlayYöneticisi(buton.click);
            buton1.Olay += new buton.OlayYöneticisi(buton.metot1);
            buton1.Olay += new buton.OlayYöneticisi(buton.metot2);
            buton1.tıklandi();
            #endregion

            #region Şablon tipler
            Console.WriteLine("\n-------Şablon Tipler-------\n");
            İsimler<string> isim = new İsimler<string>();
            isim.Özellik = "Mehmet";
            Console.WriteLine(isim.Özellik);
            İsimler<int> isim2 = new İsimler<int>();
            isim2.Özellik = 20;
            Console.WriteLine(isim2.Özellik);


            #endregion

            #region Şablon tipler - 2 
            Console.WriteLine("\nŞablon Tipler - 2\n");
            deneme2<string> nesne1 = new deneme2<string>();
            nesne1._x = "10";
            Console.WriteLine(nesne1._x);
            deneme2<int> nesne2 = new deneme2<int> ();
            nesne2._x = 10;
            Console.WriteLine(nesne2._x);
            #endregion
            #region Şablon Tipler Kısıtlar
            D3<A3> d3 = new D3<A3> ();
            D3<B3> d33 = new D3<B3> ();
            D3<C3> d333 = new D3<C3> ();
            // where keyword ü ile belirlediğin A3 kısıtı ve ondan kalıtım alan herkese okeyler ama aşağıdaki kodu onaylamaz.
            //D3<int> d3333 = new D3<int>(); hata verir 

            #endregion
            Console.ReadLine();
        }
    }
    #region Virtual Yapılar
    class A
    {
        public virtual void method()
        {
            Console.WriteLine("A'nın Methodu");
        }
    }
    class B : A
    {
        public override void method()
        {
            Console.WriteLine("B'nın Method");
        }

    }
    class C : B
    {
        public override void method()
        {
            Console.WriteLine("C'nin Method");
        }
    }
    #endregion
    #region Abstract(Özet/Soyut) Sınıflar 
    abstract class A2
    {
        // Özellik bildiriminde Kullanılan Set Get metotları da abstract olablir.
        // Ama kalıtm aldığı sınıflarda kesinlikle override edilmeli
        abstract public int Özellik
        {
            set;
            get;
        }
        abstract public void method();
    }
    class B2 : A2
    {
        override public void method()
        {
            Console.WriteLine("B2 içindeki metotdan selamlar");
        }
        override public int Özellik
        {
            get { return 100; }
            set { Console.WriteLine("Bu bir denemedir"); }
        }
    }
    #endregion
    #region Arayüzler
    interface Itoplama
    {
        void ekle();
    }
    class Hesaplama : Itoplama
    {
        public int sayı1;
        public int sayı2;
        public int sayı1_
        {
            get
            {
                return sayı1;
            }
            set
            {
                sayı1 = value;
            }
        }
        public int sayı2_
        {
            get { return sayı2; }
            set { sayı2 = value; }
        }
        public Hesaplama() { }
        public Hesaplama(int a, int b)
        {
            sayı1 = a;
            sayı2 = b;
        }
        public void ekle()
        {
            Console.WriteLine(sayı1_ + sayı2_);
        }
    }
    #endregion
    #region Exception Oluşturma
    public class fazlaNotHatası : ApplicationException
    {
        public override string Message
        {
            get { return "Not 100 den büyük olamaz."; }
        }
    }
    public class düsükNotHatası : ApplicationException
    {
        public override string Message
        {
            get { return "Not 0'dan küçük olamaz."; }
        }
    }
    // Notlar sınıfı oluşturalım 
    class Notlar
    {
        private int _not;
        public int not
        {
            get
            {
                return _not;
            }
            set
            {
                if (value < 0) { throw new düsükNotHatası(); }
                else if (value > 100) { throw new fazlaNotHatası(); }
                else { _not = value; }
            }
        }
    }
    #endregion
    #region Delegate
    class İşlem
    {
        public delegate void Temsilci(int a, int b);
        public static void toplama(int a, int b)
        {
            Console.WriteLine("Toplam " + (a + b));
        }
        public static void çıkar(int a, int b)
        {
            Console.WriteLine("Fark " + (a - b));
        }
    }
    #endregion
    #region Delegate - 2
    class deneme
    {
        public delegate void temsilci();
        public static void Metot1()
        {
            Console.WriteLine("Burası Metot1()");
        }
        public static void Metot2()
        {
            Console.WriteLine("Burası Metot2()");
        }

    }
    #endregion
    #region Delegate - 3 (İsimsiz)
    class İsimsiz
    {
        public delegate double temsilci(double a, double b);

    }
    #endregion
    #region Olaylar (Events)
    class buton
    {
        public delegate void OlayYöneticisi();
        public event OlayYöneticisi Olay;
        public void tıklandi()
        {
            if (Olay != null)
            {
                Olay();
            }
        }
        public static void metot1()
        {
            Console.WriteLine("Metot1 tıklandı.");
        }
        public static void metot2()
        {
            Console.WriteLine("Metot2 tıklandı.");
        }
        public static void click()
        {
            Console.WriteLine("Butona tıklandı.");
        }
    }
    #endregion
    #region(Şablon Tipler)
    class İsimler<SablonTipi>
    {
        public SablonTipi Özellik;
    }
    class deneme2<T>
    {
        T x;
        T y;
        public T _x
        {
            set { x = value; }
            get { return x; }
        }
        public T _y
        {
            set { y = value; }
            get { return y; }
        }
        public T metot1()
        {
            return _x;
        }
        
    }
    public class AnaSınıf<T> 
    {

    }
    public class YavruSınıf<T,M> : AnaSınıf<T>
    {

    }
    public class YavruSınıf2<T> : AnaSınıf<int>
    {
           
    }
    interface IEnumerable<T>:IEnumerable
    {
        new IEnumerator<T> GetEnumerator();
    }
    class Sinif<T>
    {
        public int Metot(T a)
        {
            return 0;
        }
        public int Metot(int a)
        {
            return 1;
        }
    }
    // Burda Metot çağırıp içine 10 yazdığımızda sizce 1. mi çalışır 2. mi ,
    // Cevap 2. yani 1 döndüren çünkü Normal tipli versiyon şablon tipli versiyonu gizler

    // Generics - Kısıtlar
    // 1. Türetme Kısıtı
    class A3
    {

    }
    class B3 : A3
    {

    }
    class C3 : A3
    {

    }
    class D3<T> where T : A3
    {

    }
    #endregion
    #region Şablon tipler Kısıtlar
    // 2. new() kısıtı
    // Şablon tipe sadece nesnesi oluşturulabilecek olan türler koyulabilecek
    class myclassA
    {
        public int a;
        public myclassA()
        {
            a = 5;
        }
        public myclassA(int c)
        {
            a = c * 5; 
        }
        public virtual void yaz()
        {
            Console.WriteLine(a);
        }
    }
    class myclassD<T> where T : new()
    {
        private T info;
        public T Bilgi
        {
            get { return info; }
            set { info = value; }
        }
    }
    #endregion
}
