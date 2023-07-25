package Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label ;
    MyFrame() {
        ImageIcon image = new ImageIcon("like.png");
        ImageIcon image2 = new ImageIcon("smile.png");
        label = new JLabel();
        label.setIcon(image2);
        label.setBounds(200,250,100,100);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.setText("Tıkla bana!"); // Butona text ekleme
        button.setFocusable(false); // textin etrafındaki çerçeveyi yokeder.
        button.setIcon(image); // İcon ekler
        button.setHorizontalTextPosition(JButton.CENTER); // yazıyı butonun ortasına ekler
        button.setBackground(Color.lightGray);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(null);
        this.add(button);
         this.add(label);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Buton Çalıştı");
        button.setEnabled(false);// butonun ulaşılabliriğini kapatır tıklanıldığında
        label.setVisible(true); // labeli görünür yapıcak
    }
}
