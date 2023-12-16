using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;
using System.CodeDom;


namespace Arraylist_
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ArrayList arrayList1 = new ArrayList();

            // Add() ekler.
            arrayList1.Add("esad");
            arrayList1.Add("şeyma");

            // Remove() siler. 
            arrayList1.Remove("esad");

            // Clear() ful temizler.
            arrayList1.Clear();

            // Count() koleksiyon içerisindeki elemanların sayısını döndürmektedir.
            Console.WriteLine("Eleman sayısı : " + arrayList1.Count);

            // Capasity() koleksiyonun kapasitesini döndürür.
            // önce 4 sonra dolunca 2 katı şeklinde devam eder.
            for (int i = 0; i < 10; i++)
            {
                arrayList1.Add(i);
                Console.WriteLine("\neleman sayısı: " + arrayList1.Count);
                Console.WriteLine("eleman kapasitesi: " + arrayList1.Capacity);
            }

            // Contains() koleksiyon içerisinde öğeyi arar. True / yada false döndürür.
            Console.WriteLine("\narraylist1 içerisinde 3 var mı ? : " + arrayList1.Contains(3));
            Console.WriteLine("arraylist1 içerisinde esad var mı ? : " + arrayList1.Contains("esad"));

            // Sort() sıralanabilir özellikteki öğeleri sıralar.
            arrayList1.Add(24);
            arrayList1.Add(12);
            arrayList1.Add(32);
            arrayList1.Add(13);
            arrayList1.Sort();
            Console.WriteLine();
            foreach (var item in arrayList1)
            {
                Console.Write(item + " ");
            }
            // BinarySearch(object x) Metodu
            // Koleksiyon içerisinde parametre olarak girilen değeri arar. Değer bulunursa değerin indeks numarasını döndürür. Eğer değer bulunamaz ise negatif bir değer döndürür. Bu metodu kullanabilmek için önce Sort() metodu ile koleksiyonu sıralamamız gerekmektedir.
            Console.WriteLine("\naradığınız öğenin indexi: " + arrayList1.BinarySearch(13));

            // CopyTo(Array ar, int i) Metodu
            // Koleksiyon içerisindeki tüm öğeleri, ar dizisine i.indeksinden başlayarak kopyalayacaktır. ar dizisi koleksiyondaki öğelerin tipiyle uyumlu olmalıdır.
            int[] dizi = new int[arrayList1.Count];
            arrayList1.CopyTo(dizi, 0);

            // TrimToSize() Metodu
            // Koleksiyonun kapasitesini, eleman sayısına eşitler.

            arrayList1.TrimToSize();
            Console.WriteLine("\narraylist1 in TrimToSize metodu sonrası kapasitesi " + arrayList1.Capacity);

            // Reverse() Metodu
            // Koleksiyonun içeriğini ters çevirir.
            arrayList1.Reverse();
            Console.Write("\nReverse sonrası arraylist1: ");
            foreach (var item in arrayList1)
            {
                Console.Write(item + " ");
            }
            Console.WriteLine();
            // RemoveRange(int i, int c) Metodu
            // Koleksiyon içerisinde, i.indeksten başlayarak c adet elemanı çıkarır/ siler.
            arrayList1.Sort();
            arrayList1.RemoveRange(10, 4);
            Console.WriteLine("\nRemoveRange sonrası 10.elemandan sonrası silindi: ");
            foreach (var item in arrayList1)
            {
                Console.Write(item + " ");
            }
            Console.WriteLine();

            // AddRange(Koleksiyon c)
            // c koleksiyonunu, çağrıda bulunulan koleksiyonun sonuna ekler.
            ArrayList arrayList2 = new ArrayList();
            arrayList2.Add(10);
            arrayList1.AddRange(arrayList2);
            Console.WriteLine("\nAddRange sayesinde arraylist2 deki 10 elemanını ekledik.");
            foreach (var item in arrayList1)
            {
                Console.Write(item + " ");
            }
            Console.WriteLine();
            // InsertRange(int i, Koleksiyon c)
            // c koleksiyonunun tüm elemanlarını, çağrıda bulunulan koleksiyonun i.indeksinden itibaren eklemeye başlar. Çağrıda bulunulan koleksiyonun elemanları silinmez, sadece c koleksiyonunun tüm elemanlarına yer açacak şekilde ötelenir.



            // LastIndexOf(object x) Metodu
            // Parametre olarak girilen öğenin rastlanıldığı son konumun indeksinin döndürür. Değer mevcut değilse - 1 döndürür.
            Console.WriteLine("\nLastIndexOff sayesinde 5 elemanı dizinin şu indexinde : " + arrayList1.LastIndexOf(5));



            // GetRange(int i, int c) Metodu (parça)
            // Çağrıda bulunulan koleksiyonun i.indeksinden başlayarak c adet elemanını içeren bir nesne döndürür.Döndürülen nesne, çağrıda bulunan nesne ile aynı elemanlara referansta bulunur.
            ArrayList parça = arrayList1.GetRange(5, 6); // 5 6 7 8 9 10 u alır 
            Console.WriteLine("\nGetRange parça alma metoduyla yeni array: ");
            foreach (var item in parça)
            {
                Console.Write(item + " ");
            }
            Console.WriteLine();
            // SetRange(int i, Koleksiyon c)
            // c koleksiyonunun tüm elemanlarını, çağrıda bulunulan koleksiyonun i.indeksinden başlayarak üzerine yazar.
            Console.WriteLine("\nyeniDiziyi arraylist1'in 4.indeksinden beri üstüne yazıyoruz elemanlarını ");
            ArrayList yeniDizi = new ArrayList();
            yeniDizi.Add(10);
            yeniDizi.Add(11);
            yeniDizi.Add(12);
            yeniDizi.Add(13);
             arrayList1.SetRange(4,yeniDizi);
            foreach (var item in arrayList1)
            {
                Console.Write(item + " ");
            }
            Console.WriteLine();


            #region Uygulamalar
            {
                Console.WriteLine("\nUYGULAMALAR\n");
                // UYGULAMA-1 : KOLEKSİYONDAN ÖĞELERİ ÇEKME
                ArrayList DinamikDizi = new ArrayList();
                // Koleksiyona 128,18,56 değerlerini ekledik. 
                DinamikDizi.Add(128);
                DinamikDizi.Add(18);
                DinamikDizi.Add(56);
                // foreach ile koleksiyonun tüm elemanlarını ekrana yazdırdık. 
                foreach (var i in DinamikDizi)
                    Console.WriteLine(i);
                // 18 değerini koleksiyondan çıkardık. 
                DinamikDizi.Remove(18);
                // Bu sefer for döngüsü ile koleksiyonun tüm elemanlarını ekrana yazdırdık.
                for (int i = 0; i < DinamikDizi.Count; i++)
                    Console.WriteLine(DinamikDizi[i]);
            }

            {
                Console.WriteLine();
                // UYGULAMA-2 : KOLEKSİYONDAN ARAMA YAPMA
                ArrayList DinamikDizi = new ArrayList();
                // Koleksiyona 128,18,56 değerlerini ekledik. 
                DinamikDizi.Add(128);
                DinamikDizi.Add(18);
                DinamikDizi.Add(56);
                /* 56 değeri koleksiyonda mevcut olduğu için Contains() metodu TRUE * döndürecek ve ekrana "Mevcut." yazılacaktır. */
                if (DinamikDizi.Contains(56))
                {
                    Console.WriteLine("Mevcut");
                }
                else
                {
                    Console.WriteLine("Mevcut Değil");
                }
            }

            {
                // UYGULAMA-3 : HERHANGİ BİR ÖĞENİN İNDEX NUMARASINI BULMA
                ArrayList DinamikDizi = new ArrayList();
                // Koleksiyona 128,18,56 değerlerini ekledik. 
                DinamikDizi.Add(128);
                DinamikDizi.Add(18);
                DinamikDizi.Add(56);
                // Koleksiyon içerisindeki öğeleri artan sırada sıraladık. (18-56-128) 
                // NOT: BinarySearch() metodunu kullanabilmek için sıralama yapmamız gerek.
                DinamikDizi.Sort();
                // 18 değerinin indeks numarasını ekrana yazdırdık. (İndeksi:0) 
                Console.WriteLine("\n18'in indexi: " + DinamikDizi.BinarySearch(18));
            }

            #endregion


            Console.ReadLine();
        }
    }
}
