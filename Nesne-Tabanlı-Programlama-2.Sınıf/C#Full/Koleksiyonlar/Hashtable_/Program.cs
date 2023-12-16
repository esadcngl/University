using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;
using System.Runtime.ConstrainedExecution;
namespace Hashtable_
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Tanım Ve Örnek
            // Hastable ile aynı özelliklere sahiptir.Yine Key ve Value değerleri lazımdır.
            // Buradaki temel fark ise, Dictionary oluştururken mutlaka veri tipini belirtiriz ve bu şekilde kullanırız.
            // Hashtable de ise veri tipi tanımlamak zorunda değiliz, burada her şey eklenebilir.

            // İkisi arasındaki temel fark budur diyebiliriz.

            // Bu bilginin dışında başka farkları da açıklamak gerekirse Dictionary’ler Generic(List dahil) yapıdadırlar, Hashtable ise Non - Generic(ArrayList dahil) yapıdadırlar.
            // Bu bilgiyi biraz açmak gerekirse, Generic yapılar çalışma zamanında(run time) gereksiz Cast yani Boxing ve Unboxing kullanılmasını önlerler ve bu da performans sağlar, aynı zamanda derleme anında(compile time) Type Safe yani tip güvenli değişken kullanılmasını zorlayarak çalışma zamanında oluşabilmesi muhtemel tip dönüşümü hatalarını önlerler.
            // Non - Generic yapılar ise bu özelliklere sahip değildir ve bu yüzden pek tercih edilmezler.

            // Hastable örneği
            Hashtable hashTableSet = new Hashtable();
            hashTableSet.Add("A", "Test 1");
            hashTableSet.Add("B", true);
            hashTableSet.Add("C", 1);
            Console.Write("Değer : {0}, {1}", hashTableSet["A"], hashTableSet["B"]);

            #endregion
            #region Metotlar ve Özellikler
            // Nesne Oluşturma
            // Hashtable sınıfından bir nesne oluşturuyoruz.
            Hashtable Araclar = new Hashtable();

            // Add(Eklenecek_Anahtar, Eklenecek_Deger) Metodu
            // Add() metodu ile veri tipi fark etmeksizin koleksiyon içerisine her türlü Anahtar - Değer çiftini ekleyebiliriz.
            Araclar.Add("41 ABC 123", "Alfa Romeo");
            Araclar.Add("56 ABC 456", "Audi");
            Araclar.Add("25 ABC 789", "Mercedes-Benz");

            // ContainsKey(Aranan_Anahtar) Metodu
            // Koleksiyon içerisinde, parametre olarak girilen değerde bir Anahtar(Key)    mevcutsa TRUE  değilse FALSE döndürecektir.
            if (Araclar.ContainsKey("41 ABC 123"))
            {
                Console.WriteLine("Araç bulundu : " + Araclar["41 ABC 123"]);
            }
            else
            {
                Console.WriteLine("Araç bulunamadı.");
            }

            // ContainsValue(Aranan_Deger) Metodu
            // Koleksiyon içerisinde, parametre olarak girilen ifadede bir Değer(Value) mevcutsa TRUE  değilse FALSE döndürecektir.
            Console.WriteLine();
            if (Araclar.ContainsValue("Audi"))
            {
                Console.WriteLine("Audi mevcut");
            }
            else
            {
                Console.WriteLine("Audi bulunmuyor");
            }

            // Clear() Metodu
            // Koleksiyon içerisinde yer alan tüm Anahtar - Değer çiftlerini silmektedir.

            // Remove(Anahtar) Metodu
            // Koleksiyon içerisinde, parametre olarak girilen değerde bir Anahtar(Key) mevcutsa; Anahtarı ve anahtarla ilişkili Değeri silecektir.
            Console.WriteLine();
            ArrayList arrayList = new ArrayList(Araclar.Keys);
            foreach (object plakalar in arrayList)
                Console.WriteLine(plakalar);
            
            
            #endregion
            Console.ReadLine();

        }
    }
}
