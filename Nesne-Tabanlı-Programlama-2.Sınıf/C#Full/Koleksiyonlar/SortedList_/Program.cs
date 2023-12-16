using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SortedList_
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Tanım ve Örnek 
            // SortedList koleksiyonunda ise Anahtar(Key) ve Değer(Value) olmak üzere iki kavram karşımıza çıkmakta. Konuyu daha anlaşılır kılmak açısından; standart dizilere eklediğimiz elemanları Değer, o elemanlara erişmek için kullandığımız indeksleri de Anahtar olarak düşünebilirsiniz.
            // Her bir Değerin farklı bir Anahtarı olmalıdır yani koleksiyon içerisinde yer alan Anahtarlar birbirinden farklı olmalıdır.

            // ÖNEMLİ SortedList, Anahtarların değerlerine bağlı olarak Anahtar-Değer çiftlerini sıralı olarak saklayan bir koleksiyon oluşturmaktadır. Sıralama işlemini ikili arama ağacı kullanarak yapmaktadır. Yukarıdaki örneğimiz de Anahtar-Değer çiftleri ekrana, Anahtar(Key) değerlerine göre sıralı bir şekilde yazılacaktır.

            SortedList<int,string> sortedList = new SortedList<int,string>();
            sortedList.Add(06,"Ankara");
            sortedList.Add(69,"Bayburt");
            sortedList.Add(01,"Adana");
            sortedList.Add(46,"Kahramanmaraş");

            foreach (var şehir in sortedList)
            {
                Console.WriteLine(şehir + " ");
            }
            #endregion


            // ContainKey() - Aranan Key - true false
            if (sortedList.ContainsKey(06))
            {
                Console.WriteLine("\n"+sortedList[06]);
            }
            else
            {
                Console.WriteLine("Ankara yok");
            }

            // Contains.Value() : Aranan Değer - true false 
            if (sortedList.ContainsValue("Ankara"))
            {
                Console.WriteLine("Ankara mevcut");
            }
            else
            {
                Console.WriteLine("mevcut değil");
            }

            // Clear() metodu 

            // Remove() metodu

            // Keys() - koleksiyon döndürür anahtar key içeren
            Console.WriteLine();
            ICollection<int> Liste = sortedList.Keys;
            foreach (var Deger in Liste)
            {
                Console.WriteLine(Deger);
            }
            Console.ReadLine();

            // Count(): Eleman sayısı döndürür
        }
    }
}
