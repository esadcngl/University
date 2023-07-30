package Head_First_Java_chapter_12_13.Graphics2D;

import javax.swing.*;
import java.awt.*;

public class Circle extends JPanel {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Circle circle = new Circle();
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(circle);
        frame.setVisible(true);
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;

        GradientPaint gradientPaint = new GradientPaint(70,70,Color.blue,150,150,Color.magenta);
        g2d.setPaint(gradientPaint);
        g2d.fillOval(70,70,100,100);


    }
}
