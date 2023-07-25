package Frame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // frame: Ekranda görünecek çerceve nesnesini oluşturuyoruz.
        frame.setSize(420,420); // pencerenin boyutunu ayarlıyoruz.
        frame.setTitle("Deneme Penceresi by Esadcngl"); // pencerenin üste yazan başlığını ayarlıyoruz
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// pencerenin x tuşuna bastığımızda kapatması için yoksa arka planda çalışmaya devam eder.
        frame.setVisible(true);  // görünür kılmak için bu method çağrılır.
        frame.getContentPane().setBackground(Color.orange);// arkaplanı turuncu yapıyoruz.
        // sol üstte gözüken ikonun değişmesi için aşağıdaki adımları yapıyoruz.
        ImageIcon aslanIconu = new ImageIcon("aslan.png");
        frame.setIconImage(aslanIconu.getImage());


    }

}
