package JOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //JOptionPane = Bir anda ortaya çıkan pop up kullanıcıya bilgi vermek için yada uyarı içindir

//        JOptionPane.showMessageDialog(null,"Bu önemsiz bir uyarıdır!","Başlık",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Bu  bir bilgidir.","Başlık",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Bu bir sorudur ?","Başlık",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Bu önemli bir uyarıdır!","Başlık",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Bu bir hatadır!","Başlık",JOptionPane.ERROR_MESSAGE);

      //  while (true){
       //      JOptionPane.showMessageDialog(null,"Bilgisayarında virüs var!!!","Virüs Algılandı",JOptionPane.ERROR_MESSAGE);
       //  }

        // yes = 0 , no = 1 , cencel = 2 , sekmeki yapatırsa = -1
       // int answer = JOptionPane.showConfirmDialog(null,"Hayatında hiç pişmanlığın oldu mu?","Soru",JOptionPane.YES_NO_CANCEL_OPTION);

//       String name =  JOptionPane.showInputDialog("İsmin nedir?");
//        System.out.println("merhaba "+ name+ " ! ");
        String[] secenekler = {"Hayır sen harikasın","Teşekkürler","Saçmalama"};
        ImageIcon gülücük = new ImageIcon("smile.png");
        JOptionPane.showOptionDialog(null,"Sen harikasın",
                "gizli mesaj",JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,gülücük,secenekler,0);
    }
}
