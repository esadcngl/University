using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Queue_
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Queue(Kuyruk), ilk giren ilk çıkar işleyişine sahip bir koleksiyondur(FIFO). Koleksiyondan bir eleman çıkarılmak istenildiğinden, kuyruğun en önünde yer eleman çıkartılacaktır. Yeni eklenmek istenen bir eleman ise kuyruğun en sonuna eklenecektir.

            // Queue sınıfının Enqueue() ve Dequeue() olmak üzere 2 temel metodu bulunmaktadır.

            // Enqueue(): Kuyruğun sonuna bir eleman ekler.
            // Dequeue(): Kuyruğun başındaki elemanı çıkarır.
            // NOT : Eleman çıkarma işleminin kuyruğun başından, eleman ekleme işleminin de kuyruğun sonundan yapılmasıdır.

            // Queue içerisine sadece belirtilen veri tipindeki öğeler eklenebilir.
            // Eleman ekleme ve çıkarma işlemlerinde Boxing-Unboxing gerçekleşmez.
            Queue<int> kuyruk1 = new Queue<int>();

            // Queue içerisine veri tipi fark etmeksizin her türlü öğe eklenebilir.
            // Eleman ekleme ve çıkarma işlemlerinde Boxing-Unboxing gerçekleşir. 
            Queue kuyruk2 = new Queue();

            // Enqueue(Eklenecek_Oge) ve Dequeue() Metotları
            // Enqueue() Metodu; Parametre olarak girilen öğeyi kuyruğun sonuna eklemektedir.
            // Dequeue() Metodu; Kuyruğun başındaki öğeyi döndürür ve sonra öğe kuyruktan çıkarılır / silinir.
            // Kuyruk boşken Dequeue() metodu çağrılırsa InvalidOperationException fırlatır.
        }
    }
}
