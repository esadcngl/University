package ComboBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {

     String[] hayvanlar = {"kedi","köpek","papağan"};
    JComboBox<String> comboBox;
     myFrame() {
        this.setSize(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        comboBox =new JComboBox(hayvanlar);
        comboBox.addActionListener(this);
        comboBox.setFocusable(true);
        comboBox.addItem("kuş");
        //comboBox.removeItem("kedi");

        this.add(comboBox);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(comboBox.getSelectedItem());
         comboBox.setEnabled(false);
     }
}
