package Factory;
import java.io.*;
class WriteInfo extends Person{
    // Static metot içermekte çünkü kullanıcı bu metotu kullanırken obje oluşturmak zorunda değil
    // Sınıf üzerinden metot çağrısı yaparak txt dosyası oluşturup içerisine işçi bilgisi yazdırabilir.
      static void printPerson(Person person) throws IOException {
          //Dosya oluşturma
          //Dosyayı bulamazsa diye try catch yapısı kullanıyorum
          File file = new File("dosya.txt");
          try{
              if(!file.exists()){
                  file.createNewFile();
              }
          }catch (IOException e ){
              System.out.println("dosya oluşturulamadı.");
          }

           //Dosya yazma
          FileWriter fw = new FileWriter(file);
          PrintWriter pw = new PrintWriter(fw);
          //Normalde buraya person.toString kullanabilirim ama
          //Sadece bu bilgilerin yazılmasını istediğim için
          //Böyle kullandım.
          pw.write("Personel İsim Soyisim : " + person.getName() + " " + person.getSurname() );
          pw.write("\nPersonel Telefon no: " + person.getPhoneNumber());
          pw.write("\nPersonel Adres : "  + person.getAddress());
          //PrintWriter kapatıyoruz.
          pw.close();
      }


}
