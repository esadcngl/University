﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Management.Instrumentation;
using System.Text;
using System.Threading.Tasks;

namespace CodeFirst.Entity
{
    public class Urunler
    {
        [Key]
        public int UrunID { get; set; }
        public string UrunAd { get; set; }        
        public string UrunMarka { get; set; }
        public string UrunKategori { get; set; }
        public int UrunStok {  get; set; }
        public string Aciklama {  get; set; }
        public Kategori Kategori { get; set; }
    }
}
