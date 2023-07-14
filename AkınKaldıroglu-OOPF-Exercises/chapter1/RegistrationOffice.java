package exercises.chapter1;

import java.util.Date;
import java.util.Random;

public class RegistrationOffice {

    RegistrationOffice(){
    }

    public Student getAStudent(){
       Student s = null;
         int i = (int) (Math.random()*5);
         switch (i){
             case(0):
                 s= new GraduateStudent(231,"Esad Çıngılı",4,"Software Engineering","Muhammed Baykara","Makine Öğrenmesi");
               break;
             case(1):
                 s=new PhdStudent(352,"Beyza Bozkurt",7,"Electric Elektronic","Yaman Akbulut","Ardino ile çalışmalar",true);
                 break;
             case(2):
                 s = new UndergraduateStudent(121,"Kemal Aydın",3,"Software Engineering");
              break;
             case(3):
                 s = new VocationalStudent(302,"Erdem Karabulut",2,"Software Engineering");
                 break;
             case(4):
                 s = new MasterStudent(485,"Alper Erözer",6,"Software Engineering","Mehmet Karaköse","Yapay zeka ile hastalık teşhisi");
         }
         return s;
    }
    public void registerStudent(Student student){
         if(student instanceof PhdStudent phdStudent){
             System.out.println("Did you have paper?");
             phdStudent.register();
         }else if(student instanceof MasterStudent masterStudent){
             System.out.println("Did you write your thesis for Mastering?");
             masterStudent.register();
         } else if (student instanceof UndergraduateStudent undergraduateStudent) {
             System.out.println("Undergraduate Student welcome :)");
             undergraduateStudent.register();
         } else if (student instanceof GraduateStudent graduateStudent) {
             System.out.println("GraduateStudent");
             graduateStudent.register();
         } else if(student instanceof VocationalStudent vocationalStudent){
             System.out.println("welcome to Turkey Vocational Student");
             vocationalStudent.register();
         }else{
             student.register();
         }
    }

}
