package Head_First_Java_chapter_12_13.SecondStepActionListener;
import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1 implements ActionListener{
    JButton button;
    public static void main(String[] args) {
        SimpleGui1 simpleGui1 = new SimpleGui1();
          simpleGui1.go();
     }
    void go(){
        // Frame creating
         JFrame frame = new JFrame();
         button = new JButton("Click me !");
       // Action Listener
        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,250);
        frame.setVisible(true);
    }

  public void actionPerformed(ActionEvent event){
        button.setText("I've been clicked.");
  }


}
