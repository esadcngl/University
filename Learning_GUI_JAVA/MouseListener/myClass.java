package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class myClass extends JFrame implements MouseListener {
    JLabel label;
    myClass(){
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setSize(500,500);
         this.setLayout(null);

         label = new JLabel();
         label.setBounds(0,0,100,100);
         label.setBackground(Color.RED);
         label.setOpaque(true);
         label.addMouseListener(this);


         this.add(label);
         this.setVisible(true);

     }


    @Override
    public void mouseClicked(MouseEvent e) {
        // mouse tıklandığında çağrılır
        System.out.println("Mouse a tıkladın.");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // mouse basıldığında çağrılır
        System.out.println("Mouse basılı tuttun.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
             // mouse bırakıldığında çağrılır
        System.out.println("mouse bıraktın");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
            // mouse o alana girerse çağrılır
        System.out.println("Alana girdin.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
          // mouse alandan çıkarsa çağrılır
        System.out.println( "Alandan çıktın ");
    }
}
