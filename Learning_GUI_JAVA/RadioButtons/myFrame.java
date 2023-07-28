package RadioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton donerButton;
    myFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        donerButton = new JRadioButton("döner");
        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        donerButton.addActionListener(this);
        ButtonGroup group = new ButtonGroup();  //butonların hepsinin seçilebilirliğini kısıtlar
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(donerButton);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(donerButton);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e ){
         if(e.getSource() == pizzaButton){
             System.out.println("Pizza sipariş verdiniz.");
         } else if (e.getSource() == donerButton) {
             System.out.println("Döner sipariş verdiniz.");
         }else
             System.out.println("Hamburger sipariş verdiniz.");
    }
}
