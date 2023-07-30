package Head_First_Java_chapter_12_13.FirstStep;
import javax.swing.*;
public class ButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.getContentPane().add(button);
    frame.setSize(250,250);
     frame.setVisible(true);
    }
}
