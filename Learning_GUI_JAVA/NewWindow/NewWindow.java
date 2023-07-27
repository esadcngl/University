package NewWindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Yeni Sekme benim");

    NewWindow(){
        label.setBounds(0,0,250,50);
        label.setFont(new Font(null,Font.BOLD,23));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
    }
}
