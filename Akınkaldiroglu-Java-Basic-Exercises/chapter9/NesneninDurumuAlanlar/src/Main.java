public class Main {
    public static void main(String[] args) {
       Öğrenci esad = new Öğrenci();
       esad.name = "Muhammed Esad Çıngılı";
       esad.no = 220541060;
       Profesör profesör1 = new Profesör();
       profesör1.name = "Yaman Akbulut";
       profesör1.derecesi= "Doçent";
       Bölüm bölüm1 = new Bölüm();
       bölüm1.name="Yazılım Mühendisliği";
       Ders ders1 = new Ders();
       ders1.name = "Algoritma ve Programlama";
       esad.Hocası = profesör1;
       profesör1.öğrencileri = new Öğrenci[70];
       profesör1.öğrencileri[0]=esad;
       esad.aldıgıDersler = new Ders[7];
       esad.aldıgıDersler[0]=ders1;
       ders1.alanÖğrenciler = new Öğrenci[150];
       ders1.alanÖğrenciler[0]=esad;
       esad.Bölümü = bölüm1;
       bölüm1.okuyanÖğrenci = new Öğrenci[150];
       bölüm1.okuyanÖğrenci[0]=esad;
       bölüm1.başkanı = profesör1;
       profesör1.bölümBilgisi = bölüm1;
       profesör1.verilenDers = new Ders[5];
       profesör1.verilenDers[0]=ders1;
       ders1.verenHoca = profesör1;
       ders1.bölüm = bölüm1;
       bölüm1.Dersler = new Ders[21];
       bölüm1.Dersler[0]=ders1;

       System.out.println("Öğrenciniz "+ esad.name +" " + esad.Bölümü.name + " Bölümünde okumakta olup " + ders1.name + " Dersi almaktadır.");
       System.out.println("Öğrencinizin hocası: "+esad.Hocası.name);



    }
}