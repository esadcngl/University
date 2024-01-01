using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeFirst.Entity
{
    public class Musteri
    {
        [Key] public int MusterID { get; set; }
        public string MusteriAD { get; set; }
        public string MusteriSoyadı { get; set; }
        public string MusteriSehir { get; set; }
    }
}
