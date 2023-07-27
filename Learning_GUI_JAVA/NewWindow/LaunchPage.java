package NewWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LaunchPage implements ActionListener{
    JFrame frame = new JFrame();
    JButton button = new JButton("Yeni sekme");
     LaunchPage(){
         button.setBounds(250,250,100,50);
         button.setFocusable(false);
         button.addActionListener(this);

         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(500,500);
         frame.setLayout(null);
         frame.setVisible(true);
         frame.add(button);

     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            frame.dispose(); // Tuşa bastıktan sonra kaybolmasını sağlar
            NewWindow newWindow = new NewWindow();

        }
    }
}
