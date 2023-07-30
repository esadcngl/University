package Head_First_Java_chapter_12_13.ThirdStepDrawingWidget;

import javax.swing.*;
import java.awt.*;

public class DrawCat extends JPanel {

    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("C:\\Users\\Esadcngl\\Documents\\GitHub\\University\\Learning_GUI_JAVA\\Head_First_Java_chapter_12_13.ThirdStepDrawingWidget\\cat.jpeg").getImage();
        g.drawImage(image, 3, 4, this);
    }

    public static void main(String[] args) {
        JFrame app = new JFrame("Drawing Cat!");
        DrawCat cat = new DrawCat();
        app.add(cat,BorderLayout.CENTER);
        app.setSize(220, 350);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);

    }


}
