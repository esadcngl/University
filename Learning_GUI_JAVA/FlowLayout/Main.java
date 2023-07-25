package FlowLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //Layout Manager: bir kapsayıcı içindeki tüm bileşenler için doğal yerleşimler sağlar.
        //FlowLayout: Bileşenleri sıraya yerleştirerek tercih ettikleri boyutta boyutlandırır,
        // Layout yatay alanı küçükse bir sonraki uygun satırı kullanır
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
//        frame.add(new JButton("1"));
//        frame.add(new JButton("2"));
//        frame.add(new JButton("3"));
//        frame.add(new JButton("4"));
//        frame.add(new JButton("5"));
//        frame.add(new JButton("6"));
//        frame.add(new JButton("7"));
//        frame.add(new JButton("8"));
//        frame.add(new JButton("9"));
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,200));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.setVisible(true);
        frame.add(panel);
        frame.setVisible(true);
    }
}
