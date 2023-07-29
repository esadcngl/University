package progressBar;

import javax.swing.*;
import java.awt.*;

public class progressBar {
    JFrame frame = new JFrame();
    JProgressBar progressBar = new JProgressBar();


    progressBar(){
        progressBar.setValue(0);
        progressBar.setBounds(0,0,500,50);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("Consolas", Font.BOLD,25));
        progressBar.setBackground(Color.RED);
        progressBar.setForeground(Color.PINK);
        frame.add(progressBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        fill();
    }
public void fill(){
    int counter = 0;
    while (counter <= 100){
        progressBar.setValue(counter);
       try{
           Thread.sleep(50);
       }catch (InterruptedException e ){
           e.printStackTrace();
       }
       counter +=1;
    }
    progressBar.setString("İşlem Tamamlamdı!");
}
}
