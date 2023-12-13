#define DENEME
#undef DENEME
#define MERHABA
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Reflection.Emit;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;

namespace NTPHAFTA8
{
    class Program
    {
        
        static void Main(string[] args)
        {
            #region Gösterici (Pointer) Kullanımı
            // pointer kullanacağın zaman = unsafe keywordu zorunlu
            // unsafe class myClass { }
            // yada metotda int methot(){unsafe{....}}
            // unsafe int methot(){}

            // gösterici bildirimi yapının sonuna * konularak olur.
            //char* gösterici1;
            //double* gösterici2 = (double*)123456;

            // & operatorü : Adres bilgisi operatörüdür.
            unsafe 
            { 
            int sayi = 99; int* p; p = &sayi;
            }

            // * Operatörü : Adres Değiştirme operatörüdür.
            unsafe
            {
                int sayi = 99; int* p; p = &sayi;
                Console.WriteLine(*p); //99
                *p = 100;
                Console.WriteLine(*p);//100
            }
            // Göstericiler Arasında Tür Dönüşümü
            unsafe {
            char c = 'A'; int i = 65; char* cg = &c; int* ig = &i;
                cg = (char*)ig;// pointer adresini gösteriyor aynı zamanda bilinçli tür dönüşümü
                Console.WriteLine(*cg); // 65 büyük A
            }
            #endregion
            #region Önişlemci komutları(#define #undef #if #endif #region ....)

            // #define bir sembol tanımlamak için kullanılır
            // - using deyiminden önce 

            // #undef bir sembulü kaldırmaya yarar.
            // - using deyiminden önce

            // #if #endif komutları bir sembolün tanımlanmış olup olmamasına göre 
            // birtakım kodların derlenip derlenmemesine sağlanması için kullanılır.
#if MERHABA
            Console.WriteLine("MERHABA");
#endif
            // #else aynı özelliklere sahip
            // #elif else if kısaltılması
            // #define koşul ekliyosun
            // #warning o satıra uyarı gösteriyor
            // #error o satıra error gösterir.
            // #line o satır numarasını istediğiniz gibi değiştirirsiniz.
            #endregion
            #region Temel IO İşlemleri(Input (giriş) / Output (Çıkış)
            // temel 10 sınıfı inceleyeceğiz
            // ----------Directory sınıfı-------------
            // static metotlardan oluşur. bu metotlar ;
            // CreateDirectory(string adres): belirtilen adreste ismiyle beraber dosya oluşturur. eğer sadece isim yazılırsa programın çalıştığı dosyada klasör oluşturulur.

            // void Delete(string adres) boş klasör siler
            // void Delete(string adres , bool onay) klasörün içini ve kendisini komple siler.

            // bool Exists(string adres) : belirtilen adreste klasörün olup olmadığını true yada false döndürür.
            //string GetCurrentDirectory : çalışan programın şuanki klasör adresini verir
            //string[] GetDirectories (string adres) : belirtilen adresteki bütün klasörlerin adresleriyle birlikte string dizisi oalrak tutar.
            //string GetDirectoryRoot string adres) : kök dizin bilgisi döndürür
            //string[] GetFiles (string adres) : Belirtilen adresteki dosyaları adresleriyle birlikte string dizisi olarak tutar.
            //void Move (string kaynak_adres,string hedef_adres) : dosya ve klasörleri bir konumdan başka konuma taşır.

            
            #endregion
            #region Directory Metotları Deneme
            Directory.CreateDirectory("Deneme");
            string şuankiYol = Directory.GetCurrentDirectory() + "\\Deneme";

            Console.WriteLine("Klasör var mı ? "+ Directory.Exists(şuankiYol));
            Console.WriteLine("Klasör oluşturulma Zamanı : ? " + Directory.GetCreationTime(şuankiYol));
            Console.WriteLine("Şu anki klasör : " + Directory.GetCurrentDirectory());

            Console.WriteLine("C: Klasör Listesi");
            string[] klasörler = Directory.GetDirectories("C:\\");
            foreach (string item in klasörler)
            {
                Console.WriteLine(item);
            }
            Console.ReadLine();
            Console.Clear();
            Console.WriteLine("KÖK KLASÖR");
            Console.WriteLine( Directory.GetDirectoryRoot(şuankiYol));
            Console.WriteLine("C: Dosya Listesi");
            string[] dosyalar  =  Directory.GetFiles("C:\\");
            foreach (string s in dosyalar)
            {
                Console.WriteLine(s);
            }

            Console.ReadLine();
            Console.Clear();

            Console.WriteLine("Tüm dosya ve Klasörler");
            string[] tüm = Directory.GetFileSystemEntries("C:\\");
            foreach (string s in tüm)
            {
                Console.WriteLine(s);
            }
            Directory.Delete(şuankiYol);
            Console.WriteLine("Klasör silindi bu da kanıtı : "+ Directory.Exists(şuankiYol));
            Console.ReadLine();
            #endregion
        }

    }
    
}
