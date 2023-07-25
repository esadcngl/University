package Label;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JLabel = herhangi bir yazı(text) ,görüntü(image) yada ikisini birden sergilemek için lazım

        JLabel label = new JLabel(); //  label oluşturuyoruz
        ImageIcon image = new ImageIcon("aslan.png"); // image oluşturuyoruz
        Border border = BorderFactory.createLineBorder(Color.blue, 5);
        label.setText("Deneme yazısıdır."); // text oluşturuyoruz
        label.setIcon(image); // image oluşturuyoruz
        label.setHorizontalTextPosition(JLabel.CENTER); // yazıyı Imageicon'un sağına soluna ve ortasına yapmayı sağlar
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.red); // Text rengini ayarlar
        label.setFont(new Font("Times New Roman", Font.BOLD, 30)); // Font ayarları / italic Bold / size ayarlar
        label.setIconTextGap(15); // İmage ile olan aralığı ayarlar.
        label.setBackground(Color.black); // Arkaplanı boyar.
        label.setOpaque(true); // boyadığımız arka planı ayarlamak için yapmak zorundayız.
        label.setBorder(border); // Oluşturduğumuz Mavi sınırı ekliyoruz.
         label.setVerticalAlignment(JLabel.CENTER); // İcon ve image in vertical pozisyonunu ayarlar.
        label.setHorizontalAlignment(JLabel.CENTER); // İcon ve image in horizontal pozisyonunu ayarlar.
        label.setBounds(80,70,280,280); // Frame in boyutunun izni doğrultusunda x y ve boyut ayarlar.
        // frame (pencere) oluşturuyoruz
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); // Boyutlandırmayı engellemek için.
        frame.setTitle("JLabel Denemeleri");
        frame.setLayout(null); // Labellerin tüm frame i kaplamaması için layout oluşuturuyoruz.
        frame.add(label);// pencereye ekliyoruz şimdi


    }
}
