package JLayeredPane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JLayeredPane= bileşenleri birbiri üzerine stacklayabilmemizi sağlar

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(null);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

        JLabel label1 = new JLabel();
        label1.setBounds(180,120,150,150);
        label1.setBackground(Color.black);
        label1.setOpaque(true);

        JLabel label2 = new JLabel();
        label2.setBounds(150,150,150,150);
        label2.setBackground(Color.green);
        label2.setOpaque(true);

        layeredPane.add(label1);
        layeredPane.add(label2);
        frame.add(layeredPane);
    }
}
