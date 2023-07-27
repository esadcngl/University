package TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {
    JButton buton = new JButton("Okey!");
    JTextField textField = new JTextField();

    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        buton.addActionListener(this);

        textField.setPreferredSize(new Dimension(250, 50));
        textField.setBackground(Color.black);
        textField.setFont(new Font("Consolas", Font.BOLD, 25));
        textField.setForeground(Color.CYAN);
        textField.setCaretColor(Color.RED);
        textField.setText("İsim");
        textField.setVisible(true);
        this.add(textField);
        this.add(buton);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buton) {
            System.out.println("Merhaba "+textField.getText());
            buton.setEnabled(false);
            textField.setEditable(false);
        }
    }
}
