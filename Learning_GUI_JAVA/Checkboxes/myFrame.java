package Checkboxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    ImageIcon ıcon;
    ImageIcon checkIcon;

    myFrame(){
        checkIcon = new ImageIcon("smile.png");
        ıcon = new ImageIcon("like.png");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);
        button = new JButton("Onayla");
        button.addActionListener(this);
        button.setFocusable(false);
        checkBox = new JCheckBox();
        checkBox.setText("robot değilim");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.BOLD,25));
        checkBox.setIcon(checkIcon);
        checkBox.setSelectedIcon(ıcon);
        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(checkBox.isSelected());
    }
}
