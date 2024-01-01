namespace OgrenciSistemi
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.btnListele = new System.Windows.Forms.Button();
            this.btnKaydet = new System.Windows.Forms.Button();
            this.btnSil = new System.Windows.Forms.Button();
            this.btnGüncelle = new System.Windows.Forms.Button();
            this.btnBul = new System.Windows.Forms.Button();
            this.btnDersListesi = new System.Windows.Forms.Button();
            this.btnNotListesi = new System.Windows.Forms.Button();
            this.gBoxOgrenci = new System.Windows.Forms.GroupBox();
            this.txtOgrenciID = new System.Windows.Forms.TextBox();
            this.txtAD = new System.Windows.Forms.TextBox();
            this.txtSOYADI = new System.Windows.Forms.TextBox();
            this.txtNO = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.gBoxDersler = new System.Windows.Forms.GroupBox();
            this.label7 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.txtDERSADI = new System.Windows.Forms.TextBox();
            this.txtDERSID = new System.Windows.Forms.TextBox();
            this.gBoxNotlar = new System.Windows.Forms.GroupBox();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label9 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.txtOrtalama = new System.Windows.Forms.TextBox();
            this.txtSınav3 = new System.Windows.Forms.TextBox();
            this.txtSınav2 = new System.Windows.Forms.TextBox();
            this.txtSınav1 = new System.Windows.Forms.TextBox();
            this.btnHesapla = new System.Windows.Forms.Button();
            this.btnNotGuncelle = new System.Windows.Forms.Button();
            this.btnProsedur = new System.Windows.Forms.Button();
            this.radiobtnAdaGore1 = new System.Windows.Forms.RadioButton();
            this.btnLinqEntity = new System.Windows.Forms.Button();
            this.radiobtnAdaGore2 = new System.Windows.Forms.RadioButton();
            this.radioIlkUcKayit = new System.Windows.Forms.RadioButton();
            this.radioSileBaslayan = new System.Windows.Forms.RadioButton();
            this.btnJoinGetir = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.gBoxOgrenci.SuspendLayout();
            this.gBoxDersler.SuspendLayout();
            this.gBoxNotlar.SuspendLayout();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Location = new System.Drawing.Point(1, 0);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.Size = new System.Drawing.Size(799, 150);
            this.dataGridView1.TabIndex = 0;
            // 
            // btnListele
            // 
            this.btnListele.Location = new System.Drawing.Point(12, 170);
            this.btnListele.Name = "btnListele";
            this.btnListele.Size = new System.Drawing.Size(121, 23);
            this.btnListele.TabIndex = 1;
            this.btnListele.Text = "ÖĞRENCİ LİSTELE";
            this.btnListele.UseVisualStyleBackColor = true;
            this.btnListele.Click += new System.EventHandler(this.btnListele_Click);
            // 
            // btnKaydet
            // 
            this.btnKaydet.Location = new System.Drawing.Point(12, 199);
            this.btnKaydet.Name = "btnKaydet";
            this.btnKaydet.Size = new System.Drawing.Size(121, 23);
            this.btnKaydet.TabIndex = 2;
            this.btnKaydet.Text = "KAYDET";
            this.btnKaydet.UseVisualStyleBackColor = true;
            this.btnKaydet.Click += new System.EventHandler(this.btnKaydet_Click);
            // 
            // btnSil
            // 
            this.btnSil.Location = new System.Drawing.Point(12, 228);
            this.btnSil.Name = "btnSil";
            this.btnSil.Size = new System.Drawing.Size(121, 23);
            this.btnSil.TabIndex = 3;
            this.btnSil.Text = "SİL";
            this.btnSil.UseVisualStyleBackColor = true;
            this.btnSil.Click += new System.EventHandler(this.btnSil_Click);
            // 
            // btnGüncelle
            // 
            this.btnGüncelle.Location = new System.Drawing.Point(12, 257);
            this.btnGüncelle.Name = "btnGüncelle";
            this.btnGüncelle.Size = new System.Drawing.Size(121, 23);
            this.btnGüncelle.TabIndex = 4;
            this.btnGüncelle.Text = "GÜNCELLE";
            this.btnGüncelle.UseVisualStyleBackColor = true;
            this.btnGüncelle.Click += new System.EventHandler(this.btnGüncelle_Click);
            // 
            // btnBul
            // 
            this.btnBul.Location = new System.Drawing.Point(12, 286);
            this.btnBul.Name = "btnBul";
            this.btnBul.Size = new System.Drawing.Size(121, 23);
            this.btnBul.TabIndex = 5;
            this.btnBul.Text = "BUL";
            this.btnBul.UseVisualStyleBackColor = true;
            this.btnBul.Click += new System.EventHandler(this.btnBul_Click);
            // 
            // btnDersListesi
            // 
            this.btnDersListesi.Location = new System.Drawing.Point(12, 315);
            this.btnDersListesi.Name = "btnDersListesi";
            this.btnDersListesi.Size = new System.Drawing.Size(121, 23);
            this.btnDersListesi.TabIndex = 6;
            this.btnDersListesi.Text = "DERS LİSTESİ";
            this.btnDersListesi.UseVisualStyleBackColor = true;
            this.btnDersListesi.Click += new System.EventHandler(this.btnDersListesi_Click);
            // 
            // btnNotListesi
            // 
            this.btnNotListesi.Location = new System.Drawing.Point(12, 344);
            this.btnNotListesi.Name = "btnNotListesi";
            this.btnNotListesi.Size = new System.Drawing.Size(121, 23);
            this.btnNotListesi.TabIndex = 7;
            this.btnNotListesi.Text = "NOT LİSTESİ";
            this.btnNotListesi.UseVisualStyleBackColor = true;
            this.btnNotListesi.Click += new System.EventHandler(this.btnNotListesi_Click);
            // 
            // gBoxOgrenci
            // 
            this.gBoxOgrenci.Controls.Add(this.label4);
            this.gBoxOgrenci.Controls.Add(this.label3);
            this.gBoxOgrenci.Controls.Add(this.label2);
            this.gBoxOgrenci.Controls.Add(this.label1);
            this.gBoxOgrenci.Controls.Add(this.txtNO);
            this.gBoxOgrenci.Controls.Add(this.txtSOYADI);
            this.gBoxOgrenci.Controls.Add(this.txtAD);
            this.gBoxOgrenci.Controls.Add(this.txtOgrenciID);
            this.gBoxOgrenci.Location = new System.Drawing.Point(166, 170);
            this.gBoxOgrenci.Name = "gBoxOgrenci";
            this.gBoxOgrenci.Size = new System.Drawing.Size(183, 148);
            this.gBoxOgrenci.TabIndex = 8;
            this.gBoxOgrenci.TabStop = false;
            this.gBoxOgrenci.Text = "Öğrenci ";
            // 
            // txtOgrenciID
            // 
            this.txtOgrenciID.Location = new System.Drawing.Point(63, 29);
            this.txtOgrenciID.Name = "txtOgrenciID";
            this.txtOgrenciID.Size = new System.Drawing.Size(100, 20);
            this.txtOgrenciID.TabIndex = 0;
            // 
            // txtAD
            // 
            this.txtAD.Location = new System.Drawing.Point(63, 60);
            this.txtAD.Name = "txtAD";
            this.txtAD.Size = new System.Drawing.Size(100, 20);
            this.txtAD.TabIndex = 1;
            this.txtAD.TextChanged += new System.EventHandler(this.txtAD_TextChanged);
            // 
            // txtSOYADI
            // 
            this.txtSOYADI.Location = new System.Drawing.Point(63, 90);
            this.txtSOYADI.Name = "txtSOYADI";
            this.txtSOYADI.Size = new System.Drawing.Size(100, 20);
            this.txtSOYADI.TabIndex = 2;
            // 
            // txtNO
            // 
            this.txtNO.Location = new System.Drawing.Point(63, 119);
            this.txtNO.Name = "txtNO";
            this.txtNO.Size = new System.Drawing.Size(100, 20);
            this.txtNO.TabIndex = 3;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(39, 32);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(18, 13);
            this.label1.TabIndex = 4;
            this.label1.Text = "ID";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(32, 60);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(25, 13);
            this.label2.TabIndex = 5;
            this.label2.Text = "ADI";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(10, 94);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(47, 13);
            this.label3.TabIndex = 6;
            this.label3.Text = "SOYADI";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(34, 122);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(23, 13);
            this.label4.TabIndex = 7;
            this.label4.Text = "NO";
            // 
            // gBoxDersler
            // 
            this.gBoxDersler.Controls.Add(this.label7);
            this.gBoxDersler.Controls.Add(this.label8);
            this.gBoxDersler.Controls.Add(this.txtDERSADI);
            this.gBoxDersler.Controls.Add(this.txtDERSID);
            this.gBoxDersler.Location = new System.Drawing.Point(166, 324);
            this.gBoxDersler.Name = "gBoxDersler";
            this.gBoxDersler.Size = new System.Drawing.Size(183, 93);
            this.gBoxDersler.TabIndex = 9;
            this.gBoxDersler.TabStop = false;
            this.gBoxDersler.Text = "Dersler";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(14, 60);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(58, 13);
            this.label7.TabIndex = 5;
            this.label7.Text = "DERS ADI";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(54, 32);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(18, 13);
            this.label8.TabIndex = 4;
            this.label8.Text = "ID";
            // 
            // txtDERSADI
            // 
            this.txtDERSADI.Location = new System.Drawing.Point(77, 59);
            this.txtDERSADI.Name = "txtDERSADI";
            this.txtDERSADI.Size = new System.Drawing.Size(100, 20);
            this.txtDERSADI.TabIndex = 1;
            // 
            // txtDERSID
            // 
            this.txtDERSID.Location = new System.Drawing.Point(77, 28);
            this.txtDERSID.Name = "txtDERSID";
            this.txtDERSID.Size = new System.Drawing.Size(100, 20);
            this.txtDERSID.TabIndex = 0;
            // 
            // gBoxNotlar
            // 
            this.gBoxNotlar.Controls.Add(this.btnNotGuncelle);
            this.gBoxNotlar.Controls.Add(this.btnHesapla);
            this.gBoxNotlar.Controls.Add(this.label5);
            this.gBoxNotlar.Controls.Add(this.label6);
            this.gBoxNotlar.Controls.Add(this.label9);
            this.gBoxNotlar.Controls.Add(this.label10);
            this.gBoxNotlar.Controls.Add(this.txtOrtalama);
            this.gBoxNotlar.Controls.Add(this.txtSınav3);
            this.gBoxNotlar.Controls.Add(this.txtSınav2);
            this.gBoxNotlar.Controls.Add(this.txtSınav1);
            this.gBoxNotlar.Location = new System.Drawing.Point(355, 170);
            this.gBoxNotlar.Name = "gBoxNotlar";
            this.gBoxNotlar.Size = new System.Drawing.Size(225, 247);
            this.gBoxNotlar.TabIndex = 9;
            this.gBoxNotlar.TabStop = false;
            this.gBoxNotlar.Text = "Öğrenci ";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(15, 118);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(66, 13);
            this.label5.TabIndex = 7;
            this.label5.Text = "ORTALAMA";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(36, 89);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(45, 13);
            this.label6.TabIndex = 6;
            this.label6.Text = "SINAV3";
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(36, 61);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(45, 13);
            this.label9.TabIndex = 5;
            this.label9.Text = "SINAV2";
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(36, 33);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(45, 13);
            this.label10.TabIndex = 4;
            this.label10.Text = "SINAV1";
            // 
            // txtOrtalama
            // 
            this.txtOrtalama.Location = new System.Drawing.Point(85, 115);
            this.txtOrtalama.Name = "txtOrtalama";
            this.txtOrtalama.Size = new System.Drawing.Size(100, 20);
            this.txtOrtalama.TabIndex = 3;
            // 
            // txtSınav3
            // 
            this.txtSınav3.Location = new System.Drawing.Point(85, 86);
            this.txtSınav3.Name = "txtSınav3";
            this.txtSınav3.Size = new System.Drawing.Size(100, 20);
            this.txtSınav3.TabIndex = 2;
            // 
            // txtSınav2
            // 
            this.txtSınav2.Location = new System.Drawing.Point(84, 57);
            this.txtSınav2.Name = "txtSınav2";
            this.txtSınav2.Size = new System.Drawing.Size(100, 20);
            this.txtSınav2.TabIndex = 1;
            // 
            // txtSınav1
            // 
            this.txtSınav1.Location = new System.Drawing.Point(84, 29);
            this.txtSınav1.Name = "txtSınav1";
            this.txtSınav1.Size = new System.Drawing.Size(100, 20);
            this.txtSınav1.TabIndex = 0;
            // 
            // btnHesapla
            // 
            this.btnHesapla.Location = new System.Drawing.Point(84, 150);
            this.btnHesapla.Name = "btnHesapla";
            this.btnHesapla.Size = new System.Drawing.Size(100, 23);
            this.btnHesapla.TabIndex = 8;
            this.btnHesapla.Text = "HESAPLA";
            this.btnHesapla.UseVisualStyleBackColor = true;
            this.btnHesapla.Click += new System.EventHandler(this.btnHesapla_Click);
            // 
            // btnNotGuncelle
            // 
            this.btnNotGuncelle.Location = new System.Drawing.Point(84, 180);
            this.btnNotGuncelle.Name = "btnNotGuncelle";
            this.btnNotGuncelle.Size = new System.Drawing.Size(100, 23);
            this.btnNotGuncelle.TabIndex = 9;
            this.btnNotGuncelle.Text = "NOT GÜNCELLE";
            this.btnNotGuncelle.UseVisualStyleBackColor = true;
            // 
            // btnProsedur
            // 
            this.btnProsedur.Location = new System.Drawing.Point(12, 374);
            this.btnProsedur.Name = "btnProsedur";
            this.btnProsedur.Size = new System.Drawing.Size(121, 23);
            this.btnProsedur.TabIndex = 10;
            this.btnProsedur.Text = "PROSEDÜR";
            this.btnProsedur.UseVisualStyleBackColor = true;
            this.btnProsedur.Click += new System.EventHandler(this.btnProsedur_Click);
            // 
            // radiobtnAdaGore1
            // 
            this.radiobtnAdaGore1.AutoSize = true;
            this.radiobtnAdaGore1.Location = new System.Drawing.Point(612, 176);
            this.radiobtnAdaGore1.Name = "radiobtnAdaGore1";
            this.radiobtnAdaGore1.Size = new System.Drawing.Size(129, 17);
            this.radiobtnAdaGore1.TabIndex = 11;
            this.radiobtnAdaGore1.TabStop = true;
            this.radiobtnAdaGore1.Text = "Ada göre Sırala (A->Z)";
            this.radiobtnAdaGore1.UseVisualStyleBackColor = true;
            // 
            // btnLinqEntity
            // 
            this.btnLinqEntity.Location = new System.Drawing.Point(630, 324);
            this.btnLinqEntity.Name = "btnLinqEntity";
            this.btnLinqEntity.Size = new System.Drawing.Size(111, 23);
            this.btnLinqEntity.TabIndex = 12;
            this.btnLinqEntity.Text = "Linq Entity";
            this.btnLinqEntity.UseVisualStyleBackColor = true;
            this.btnLinqEntity.Click += new System.EventHandler(this.btnLinqEntity_Click);
            // 
            // radiobtnAdaGore2
            // 
            this.radiobtnAdaGore2.AutoSize = true;
            this.radiobtnAdaGore2.Location = new System.Drawing.Point(612, 205);
            this.radiobtnAdaGore2.Name = "radiobtnAdaGore2";
            this.radiobtnAdaGore2.Size = new System.Drawing.Size(129, 17);
            this.radiobtnAdaGore2.TabIndex = 13;
            this.radiobtnAdaGore2.TabStop = true;
            this.radiobtnAdaGore2.Text = "Ada göre Sırala (Z->A)";
            this.radiobtnAdaGore2.UseVisualStyleBackColor = true;
            // 
            // radioIlkUcKayit
            // 
            this.radioIlkUcKayit.AutoSize = true;
            this.radioIlkUcKayit.Location = new System.Drawing.Point(612, 234);
            this.radioIlkUcKayit.Name = "radioIlkUcKayit";
            this.radioIlkUcKayit.Size = new System.Drawing.Size(70, 17);
            this.radioIlkUcKayit.TabIndex = 14;
            this.radioIlkUcKayit.TabStop = true;
            this.radioIlkUcKayit.Text = "İlk 3 kayıt";
            this.radioIlkUcKayit.UseVisualStyleBackColor = true;
            // 
            // radioSileBaslayan
            // 
            this.radioSileBaslayan.AutoSize = true;
            this.radioSileBaslayan.Location = new System.Drawing.Point(612, 264);
            this.radioSileBaslayan.Name = "radioSileBaslayan";
            this.radioSileBaslayan.Size = new System.Drawing.Size(129, 17);
            this.radioSileBaslayan.TabIndex = 15;
            this.radioSileBaslayan.TabStop = true;
            this.radioSileBaslayan.Text = "Adı \"S\" ile başlayanlar";
            this.radioSileBaslayan.UseVisualStyleBackColor = true;
            // 
            // btnJoinGetir
            // 
            this.btnJoinGetir.Location = new System.Drawing.Point(12, 403);
            this.btnJoinGetir.Name = "btnJoinGetir";
            this.btnJoinGetir.Size = new System.Drawing.Size(121, 23);
            this.btnJoinGetir.TabIndex = 16;
            this.btnJoinGetir.Text = "JOİN İLE GETİR";
            this.btnJoinGetir.UseVisualStyleBackColor = true;
            this.btnJoinGetir.Click += new System.EventHandler(this.btnJoinGetir_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 473);
            this.Controls.Add(this.btnJoinGetir);
            this.Controls.Add(this.radioSileBaslayan);
            this.Controls.Add(this.radioIlkUcKayit);
            this.Controls.Add(this.radiobtnAdaGore2);
            this.Controls.Add(this.btnLinqEntity);
            this.Controls.Add(this.radiobtnAdaGore1);
            this.Controls.Add(this.btnProsedur);
            this.Controls.Add(this.gBoxNotlar);
            this.Controls.Add(this.gBoxDersler);
            this.Controls.Add(this.gBoxOgrenci);
            this.Controls.Add(this.btnNotListesi);
            this.Controls.Add(this.btnDersListesi);
            this.Controls.Add(this.btnBul);
            this.Controls.Add(this.btnGüncelle);
            this.Controls.Add(this.btnSil);
            this.Controls.Add(this.btnKaydet);
            this.Controls.Add(this.btnListele);
            this.Controls.Add(this.dataGridView1);
            this.Name = "Form1";
            this.Text = "Form1";
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.gBoxOgrenci.ResumeLayout(false);
            this.gBoxOgrenci.PerformLayout();
            this.gBoxDersler.ResumeLayout(false);
            this.gBoxDersler.PerformLayout();
            this.gBoxNotlar.ResumeLayout(false);
            this.gBoxNotlar.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.Button btnListele;
        private System.Windows.Forms.Button btnKaydet;
        private System.Windows.Forms.Button btnSil;
        private System.Windows.Forms.Button btnGüncelle;
        private System.Windows.Forms.Button btnBul;
        private System.Windows.Forms.Button btnDersListesi;
        private System.Windows.Forms.Button btnNotListesi;
        private System.Windows.Forms.GroupBox gBoxOgrenci;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtNO;
        private System.Windows.Forms.TextBox txtSOYADI;
        private System.Windows.Forms.TextBox txtAD;
        private System.Windows.Forms.TextBox txtOgrenciID;
        private System.Windows.Forms.GroupBox gBoxDersler;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.TextBox txtDERSADI;
        private System.Windows.Forms.TextBox txtDERSID;
        private System.Windows.Forms.GroupBox gBoxNotlar;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.TextBox txtOrtalama;
        private System.Windows.Forms.TextBox txtSınav3;
        private System.Windows.Forms.TextBox txtSınav2;
        private System.Windows.Forms.TextBox txtSınav1;
        private System.Windows.Forms.Button btnHesapla;
        private System.Windows.Forms.Button btnNotGuncelle;
        private System.Windows.Forms.Button btnProsedur;
        private System.Windows.Forms.RadioButton radiobtnAdaGore1;
        private System.Windows.Forms.Button btnLinqEntity;
        private System.Windows.Forms.RadioButton radiobtnAdaGore2;
        private System.Windows.Forms.RadioButton radioIlkUcKayit;
        private System.Windows.Forms.RadioButton radioSileBaslayan;
        private System.Windows.Forms.Button btnJoinGetir;
    }
}