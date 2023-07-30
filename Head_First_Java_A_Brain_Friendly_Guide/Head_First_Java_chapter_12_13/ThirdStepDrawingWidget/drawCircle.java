package Head_First_Java_chapter_12_13.ThirdStepDrawingWidget;

import javax.swing.*;
import java.awt.*;
public class drawCircle extends JPanel {
    public void paintComponent(Graphics g){
        g.fillRect(0,0,this.getWidth(),this.getHeight());
    int red = (int) (Math.random()*256);
    int green = (int) (Math.random()*256);
    int blue = (int) (Math.random()*256);
    Color randomColor = new Color(red,green,blue);
    g.setColor(randomColor);
    g.fillOval(100,100,100,100);
    }

    public static void main(String[] args) {
          JFrame app = new JFrame();
          drawCircle drawCircle = new drawCircle();
          app.setSize(300,300);
          app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          app.add(drawCircle,BorderLayout.CENTER);
          app.setVisible(true);
    }

}
