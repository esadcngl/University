package SelectingFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class myFrame extends JFrame implements ActionListener {
    JButton button;

    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select a File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser(); // file chooser nesnesi oluşturuluyor.
            //int response = fileChooser.showOpenDialog(null);// dosyası açmak için oluşturulur.
            int response = fileChooser.showSaveDialog(null);// seçilen dosyayı kaydediyoruz.
            if (response == JFileChooser.APPROVE_OPTION) { // dosya seçildiğinde
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                //seçilen dosyanın yolunu verir.
                System.out.println(file);
            }

        }
    }
}
