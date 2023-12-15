using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Cache;
using System.Text;
using System.Threading.Tasks;

namespace Enumlar
{
    internal class Program
    {
        enum haftaİçi : byte
        {
            PAZARTESİ = 2,
            SALI,
            ÇARŞAMBA,
            PERŞEMBE,
            CUMA
        }
        enum Months : byte
        {
            Jan,
            Feb,
            Mar,
            Apr,
            May,
            Jun,
            Jul,
            Aug,
            Sep,
            Oct,
            Nov,
            Dec
        };
        static void Main(string[] args)
        {
            Console.WriteLine((byte)haftaİçi.CUMA);
            Console.WriteLine(haftaİçi.CUMA);

            foreach (string gün in Enum.GetNames(typeof(haftaİçi)))
            {
                Console.WriteLine(gün);
            }

            foreach (byte i in Enum.GetValues(typeof(haftaİçi)))
            {
                Console.WriteLine(i);
            }

            string[] months = Enum.GetNames(typeof(Months));
            foreach (string month in months)
                Console.WriteLine(month);
            Console.ReadLine();
        }
    }
}
