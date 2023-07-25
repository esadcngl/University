package Frame;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {
    //Main sınıfında oluşturduğumuz panelin aynısını başka sınıfta oluştururabliriz.
    //Ama bu kez JFrame sınıfını extend edeceğiz.
    //Böylelikle default constractorun içerisinde oluşturabiliriz.
    myFrame(){
        this.setSize(420,420); // pencerenin boyutunu ayarlıyoruz.
        this.setTitle("Deneme Penceresi by Esadcngl"); // pencerenin üste yazan başlığını ayarlıyoruz
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// pencerenin x tuşuna bastığımızda kapatması için yoksa arka planda çalışmaya devam eder.
        this.setVisible(true);  // görünür kılmak için bu method çağrılır.
        this.getContentPane().setBackground(Color.orange);// arkaplanı turuncu yapıyoruz.
        // sol üstte gözüken ikonun değişmesi için aşağıdaki adımları yapıyoruz.
        ImageIcon aslanIconu = new ImageIcon("aslan.png");
        this.setIconImage(aslanIconu.getImage());
    }
}
