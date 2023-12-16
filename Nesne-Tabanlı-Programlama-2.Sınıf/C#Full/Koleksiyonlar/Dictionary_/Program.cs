using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;
namespace Dictionary_
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Tanımı ve Örnek
            // Dictionary arraylist gibi ama her karakteri  birbirinden farklı kılan özellikler (key) anahtarlar var.
            // Dictionary koleksiyonunda ise Anahtar(Key) ve Değer(Value) olmak üzere iki kavram karşımıza çıkmakta. Konuyu daha anlaşılır kılmak açısından; standart dizilere eklediğimiz elemanları Değer, o elemanlara erişmek için kullandığımız indeksleri de Anahtar olarak düşünebilirsiniz.

            Dictionary<int, string> öğrenciler = new Dictionary<int, string>();

            öğrenciler.Add(263, "Esad Bayram");
            öğrenciler.Add(142, "Mehmet Güzel");
            öğrenciler.Add(198, "Hatice Bozok");
            öğrenciler.Add(256, "İsmail Kutlu");
            öğrenciler.Add(102, "Alperen Şengü");

            Console.WriteLine("Aradığınız öğrenci numarası giriniz: ");

            int no = int.Parse(Console.ReadLine());
            try
            {
                Console.WriteLine(öğrenciler[no]);
            }
            catch (KeyNotFoundException ex)
            {
                Console.WriteLine("Öğrenci Bulunamadı.");
            }


            #endregion

            #region Metotlar ve Özellikler

            // ContainsKey(Aranan_Key) Metodu
            // Koleksiyon içerisinde, parametre olarak girilen değerde bir Anahtar(Key) mevcutsa TRUE  değilse FALSE döndürecektir.
            Console.WriteLine("\n102 nolu öğrenci var mı? : " + öğrenciler.ContainsKey(102));

            // ContainsValue(Aranan_Value) Metodu
            // Koleksiyon içerisinde, parametre olarak girilen değerde bir Değer(Value) mevcutsa TRUE  değilse FALSE döndürecektir.
            Console.WriteLine("\nAlperen Çağlar diye biri var mı? : " + öğrenciler.ContainsValue("Alperen Çağlar"));

            // Clear() Metodu
            // Koleksiyon içerisinde yer alan tüm Anahtar - Değer çiftlerini silmektedir.

            // Count Özelliği
            // Koleksiyon içinde bulunan anahtar/ değer çiftlerinin sayısını döndürmektedir.

            // Remove(Silinecek_Key) Metodu
            // Koleksiyon içerisinde, parametre olarak girilen değerde bir Anahtar(Key) mevcutsa; Anahtarı ve anahtarla ilişkili Değeri silip TRUE döndürecektir. Anahtar mevcut değilse FALSE döndürecektir.

            // Keys Özelliği
            // Anahtarları(Keys) içeren bir koleksiyon döndürmektedir.
            Console.WriteLine();
            Dictionary<int, string>.KeyCollection AnahtarListesi = öğrenciler.Keys;
            foreach (var anahtar in AnahtarListesi)
            {
                Console.Write(anahtar + " " );
            }



            #endregion
            Console.ReadLine();
        }
    }
}
