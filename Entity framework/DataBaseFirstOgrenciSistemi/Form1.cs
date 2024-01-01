using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace OgrenciSistemi
{
    public partial class Form1 : Form
    {
        ogrenciSistemiEntities ogrenciSistemiDB = new ogrenciSistemiEntities();
        public Form1()
        {
            InitializeComponent();
        }

        // Ders Listesi Sıralamayı ADO.NET (eski usül yapalım)
        // Görmen için farkı
        private void btnDersListesi_Click(object sender, EventArgs e)
        {
            SqlConnection con = new SqlConnection("Data Source=DESKTOP-02M14VM\\SQLEXPRESS;Initial Catalog=ogrenciSistemi;Integrated Security=True;");
            SqlCommand sqlCommand = new SqlCommand("SELECT* from TBLDERSLER", con);
            SqlDataAdapter adapter = new SqlDataAdapter(sqlCommand);
            DataTable table = new DataTable();
            adapter.Fill(table);
            dataGridView1.DataSource = table;

        }
        // Bundan sonraki herşey entity framework ile yapılacaktır.
        private void btnListele_Click(object sender, EventArgs e)
        {
            dataGridView1.DataSource = ogrenciSistemiDB.TBLOGRENCI.ToList();
            dataGridView1.Columns[4].Visible = false;
        }

        private void btnKaydet_Click(object sender, EventArgs e)
        {
            TBLOGRENCI ogrenci = new TBLOGRENCI();
            ogrenci.AD = txtAD.Text;
            ogrenci.SOYAD = txtSOYADI.Text;
            ogrenci.NO = Convert.ToInt32(txtNO.Text);
            ogrenciSistemiDB.TBLOGRENCI.Add(ogrenci);
            ogrenciSistemiDB.SaveChanges();
            MessageBox.Show("Öğrenci Listeye Eklenmiştir", "Öğrenci Ekleme");
        }

        private void btnNotListesi_Click(object sender, EventArgs e)
        {
            //foreach (var item in collection)
            //{
            // foreach yapısı gibi düşün
            //}
            var query = from item in ogrenciSistemiDB.TBLNOTLAR
                        select new
                        {
                            item.NOTID,
                            item.OGRENCIID,
                            item.DERSID,
                            item.SINAV1,
                            item.SINAV2,
                            item.SINAV3,
                            item.ORTALAMA
                        };
            dataGridView1.DataSource = query.ToList();
        }

        private void btnSil_Click(object sender, EventArgs e)
        {
            int id  = Convert.ToInt32(txtOgrenciID.Text);
            var silinecekOgrenci = ogrenciSistemiDB.TBLOGRENCI.Find(id);
            ogrenciSistemiDB.TBLOGRENCI.Remove(silinecekOgrenci);
            ogrenciSistemiDB.SaveChanges();
            MessageBox.Show("Öğrenci Silinmiştir.","Öğrenci Silme İşlemi");
        }

        private void btnGüncelle_Click(object sender, EventArgs e)
        {
            int id = Convert.ToInt32(txtOgrenciID.Text);
            var guncellenicekOgrenci = ogrenciSistemiDB.TBLOGRENCI.Find(id);
            guncellenicekOgrenci.AD = txtAD.Text;
            guncellenicekOgrenci.SOYAD = txtSOYADI.Text;
            guncellenicekOgrenci.NO = Convert.ToInt32(txtNO.Text);
            ogrenciSistemiDB.SaveChanges();
            MessageBox.Show("Öğrenci Güncelleme Başarılı!","Öğrenci Güncelleme İşlemi");
        }

        private void btnProsedur_Click(object sender, EventArgs e)
        {
            dataGridView1.DataSource = ogrenciSistemiDB.NOTLISTESI();
        }

        //Lambda where kullanımı 
        private void btnBul_Click(object sender, EventArgs e)
        {
            dataGridView1.DataSource = ogrenciSistemiDB.TBLOGRENCI.Where(x => x.AD == txtAD.Text.ToUpper() | x.SOYAD == txtSOYADI.Text.ToUpper()).ToList();
        }

        private void txtAD_TextChanged(object sender, EventArgs e)
        {
            string aranan = txtAD.Text;
            var degerler = from item in ogrenciSistemiDB.TBLOGRENCI
                           where item.AD.Contains(aranan)
                           select item;
            dataGridView1.DataSource = degerler.ToList();

        }

        private void btnHesapla_Click(object sender, EventArgs e)
        {
            double sınav1 = Convert.ToDouble(txtSınav1.Text);
            double sınav2 = Convert.ToDouble(txtSınav2.Text);
            double sınav3 = Convert.ToDouble(txtSınav3.Text);
           

        }

        private void btnLinqEntity_Click(object sender, EventArgs e)
        {
            if(radiobtnAdaGore1.Checked == true)
            {
                List<TBLOGRENCI> liste1 = ogrenciSistemiDB.TBLOGRENCI.OrderBy(p => p.AD).ToList();
                dataGridView1.DataSource = liste1;
            }if(radiobtnAdaGore2.Checked == true)
            {
                List<TBLOGRENCI> liste2 = ogrenciSistemiDB.TBLOGRENCI.OrderByDescending(p => p.AD).ToList();
                dataGridView1.DataSource =  liste2;
            }if(radioIlkUcKayit.Checked == true)
            {
                List<TBLOGRENCI> liste3 = ogrenciSistemiDB.TBLOGRENCI.Take(3).ToList();
                dataGridView1.DataSource = liste3;
            }
            if (radioSileBaslayan.Checked == true)
            {
                List<TBLOGRENCI> liste4 = ogrenciSistemiDB.TBLOGRENCI.Where(p => p.AD.StartsWith("S")).ToList();
                dataGridView1.DataSource = liste4;
            }

        }

        private void btnJoinGetir_Click(object sender, EventArgs e)
        {
            var sorgu = from d1 in ogrenciSistemiDB.TBLNOTLAR
                        join d2 in ogrenciSistemiDB.TBLOGRENCI
                        on d1.OGRENCIID equals d2.OGRENCIID
                        join d3 in ogrenciSistemiDB.TBLDERSLER
                        on d1.DERSID equals d3.DERSID
                        select new
                        {
                            ÖĞRENCİ = d2.AD + " " + d2.SOYAD,
                            DERS = d3.DERSADI,
                            SINAV1 = d1.SINAV1,
                            SINAV2 = d1.SINAV2,
                            SINAV3 = d1.SINAV3,
                            ORTALAMA = d1.ORTALAMA
                        };
            dataGridView1.DataSource = sorgu.ToList();
        }
    }
}
