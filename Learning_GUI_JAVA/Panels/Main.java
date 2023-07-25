package Panels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon likeImage = new ImageIcon("like.png");

        JLabel label = new JLabel();
        label.setText("Merhaba!");
        label.setIcon(likeImage);

        // JPanel = diğer bileşenleri tutmak için bir kutu işlevi gören bir GUI bileşeni
        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red); // Arkaplan ayarlıyoruz
        redpanel.setBounds(0, 0, 250, 250);  // sınırları ayarlıyoruz
         redpanel.setLayout(null);

         JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250, 0, 250, 250);
        redpanel.setLayout(null);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,500,250);
        redpanel.setLayout(new BorderLayout());
        // frame oluşturalım
        JFrame frame = new JFrame();
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        greenpanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
    }
}
