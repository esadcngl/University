using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StringBuilderÖzellikleri
{
    internal class Program
    {
        static void Main(string[] args)
        {
            StringBuilder sb = new StringBuilder("Hello World!");

            for (int i = 0; i < sb.Length; i++)
                Console.Write(sb[i]); // output: Hello World!

            StringBuilder sbAmout = new StringBuilder("\nYour total amount is ");
            Console.WriteLine(sbAmout.AppendFormat("{0:C} ", 25));

            StringBuilder sb1 = new StringBuilder("Merhaba");
            StringBuilder sb2 = new StringBuilder("Daha fazla şey ekledik", 256);

            Console.WriteLine("sb2'nin Kapasitesi : " + sb2.Capacity);
            Console.WriteLine("sb2'nin Uzunluğu : " + sb2.Length);
            sb2.AppendLine("\nşimdi biraz Daha ekledik");

            CultureInfo enUS = CultureInfo.CreateSpecificCulture("en-US");
            string bestCust = "Bob Odenkirk";
            sb2.AppendFormat(enUS, "Best Customer " + bestCust);
            Console.WriteLine(sb2);

            sb2.Replace("Daha", "Fazla");
            Console.WriteLine(sb2);
            
            sb2.Clear();
            
            sb2.Append("Merhaba");
            
            Console.WriteLine(sb2);
            
            Console.WriteLine(sb1.Equals(sb2));
            
            sb2.Insert(7, " Ben Esad ");
            Console.WriteLine(sb2);
            
            sb2.Remove(7, 8);
            
            Console.WriteLine(sb2);
            
            Console.ReadLine();
        }
    }
}

