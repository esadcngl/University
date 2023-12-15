using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;

namespace DateTimeExercises
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            Console.ReadLine();
        }
    }
    internal class Ex1
    {
        // EN : Write a C# Sharp program to extract the Date property and display the DateTime value in the formatted output.
        // TR : Date özelliğini ayıklamak ve DateTime değerini biçimlendirilmiş çıktıda görüntülemek için bir C# Sharp programı yazın. Beklenen çıktı:    
        // Beklenen Çıktı
        //Complete date: 6/8/2016 11:49:00 AM
        //Short Date: 6/8/2016                                                             
        //Display date using 24-hour clock format:                                         
        //6/8/2016 12:00 AM                                                                
        //06/08/2016 00:00 
        public static void tarihYazdır()
        {
            DateTime dt1 = new DateTime(2016, 6, 8, 11, 49, 0);
            Console.WriteLine("Complete date: " + dt1.ToString());

            DateTime dateOnly = dt1.Date;

            Console.WriteLine("Short Date: " + dateOnly.ToString("d")); // d sadece tarihi alır saat kısmını atar.

            Console.WriteLine("Display date using 24-hour clock format:");

            Console.WriteLine(dateOnly.ToString("g"));
            Console.WriteLine(dateOnly.ToString("MM/dd/yyyy HH:mm"));
        }
    }
    internal class Ex2
    {
        // EN : Write a C# Sharp program to display the Day properties (year, month, day, hour, minute, second, millisecond etc.).
        // TR : Gün özelliklerini (yıl, ay, gün, saat, dakika, saniye, milisaniye vb.) görüntülemek için bir C# Sharp programı yazın.
        public static void tarihÖzellikleriYazdır()
        {
        DateTime şuan = DateTime.Now;
            Console.WriteLine("şuanki yıl : "+şuan.Year);
            Console.WriteLine("şuanki ay : " +şuan.Month);
            Console.WriteLine("şuanki gün : "+şuan.Day);
            Console.WriteLine("şuanki saat : "+şuan.Hour);
            Console.WriteLine("şuanki dakika : "+şuan.Minute);
            Console.WriteLine("şuanki saniye : "+şuan.Second);
            Console.WriteLine("şuanki günlerder : " + şuan.DayOfWeek);
        }
    }
    internal class Ex3
    {
        // EN : Write a C# Sharp program to display the number of days of the year between two specified years.
        // TR : Belirtilen iki yıl arasındaki yılın gün sayısını görüntüleyen bir C# Sharp programı yazın.
        public static void ikiGünArasıFark()
        {
            DateTime gün1 = new DateTime(2023,12,14);
            DateTime gün2 = new DateTime(2023, 2,6);
            TimeSpan fark = gün1 - gün2;
            Console.WriteLine(fark.Days.ToString()); 
        }

    }
    internal class Ex4
    {
        // EN : Write a program thats shows current date in different formats 
        // TR : şu anki zamanı birçok farklı formatta gösteren programı yaz
        public static void tarihYaz()
        {
            DateTime bugün = DateTime.Now;
            Console.WriteLine("General Format : " + bugün);
            Console.WriteLine("Diğer farklı formatlar");
            Console.WriteLine(bugün.ToString("d")); // 14.12.2023
            Console.WriteLine(bugün.ToString("D")); // 14 Aralık 2023 Perşembe
            Console.WriteLine(bugün.ToString("g")); // 14.12.2023 05:31

        }
    }
    internal class Ex5
    {
        // EN : Write a C# Sharp program to calculate what day of the week is 40 days from now.
        // TR : Bundan 40 gün sonra haftanın hangi gününün olacağını hesaplayan bir C# Sharp programı yazın.
        public static void kırkGünSonrası()
        {
            DateTime now = DateTime.Now;
            Console.WriteLine("Bugün Günlerden : "+ now.DayOfWeek);
            Console.WriteLine("40 gün sonra : " + now.AddDays(40).DayOfWeek);
        }
    }
    internal class Ex6
    {
        // EN : Write a C# Sharp program to compare the current date with a given date.
        // TR : Geçerli tarihi belirli bir tarihle karşılaştırmak için bir C# Sharp programı yazın.
        public static void GünKarşılaştır(DateTime day1 , DateTime day2)
        {
            if (day1 < day2) { Console.WriteLine("ilk girdiğiz tarih ikinciden önce"); }
            else { Console.WriteLine("ikinci girdiğiniz tarih ilkinden önce"); }
        }

    }
}
