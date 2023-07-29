package KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class myFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon imageIcon;
    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);
        imageIcon = new ImageIcon("smile.png");
        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(imageIcon);
        // label.setBackground(Color.RED);
        // label.setOpaque(true);

          this.add(label);

        this.setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {
        // keyTyped = tuşa basıldığında çağrılır , KeyChar ve char çıktı verir.
         switch (e.getKeyChar()){
             case 'a' : label.setLocation(label.getX()-10,label.getY());
             break;
             case 'w' : label.setLocation(label.getX(),label.getY()-10);
                 break;
             case 's' : label.setLocation(label.getX(),label.getY()+10);
                 break;
             case 'd' : label.setLocation(label.getX()+10,label.getY());
                 break;
         }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // keyPressed = fiziksel olarak tuşa basıldığında çağrılır. KeyCode , int kullanır

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // keyReleased = buton basıldıktan sonra bırakıldığında çağrılır.
        System.out.println("Tuşu bıraktın : "+ e.getKeyChar());
        System.out.println("Bıraktığın tuşun kodu :"+  e.getKeyCode());

    }
}
