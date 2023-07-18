package ThirdStepDrawingWidget;
import java.awt.*;
import javax.swing.*;
public class MyDrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20,50,100,100);

        g.setColor(Color.cyan);
        g.fillOval(150,50,100,100);
    }

    public static void main(String[] args) {
        MyDrawPanel myDrawPanel = new MyDrawPanel();
        JFrame app = new JFrame();
        app.add(myDrawPanel,BorderLayout.CENTER);
        app.setSize(300,300);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }


}
