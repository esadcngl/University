package MenuBars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class myFrame extends JFrame implements ActionListener {
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    JMenuBar menubar;
    JMenu fileMenu ;
    JMenu editMenu ;
    JMenu helpMenu ;
    myFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        menubar = new JMenuBar();
       fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
         helpMenu = new JMenu("Help");
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        //loadItem.setMnemonic(KeyEvent.VK_L); // L tuşuna bastığında çalışıcak loadİtem
        //icon ekleyebilirsin tabi
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menubar.add(fileMenu);
        menubar.add(editMenu);
        menubar.add(helpMenu);
        this.setJMenuBar(menubar);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource() == loadItem){
            System.out.println("Dosya yüklendi.");
        } else if (e.getSource() == saveItem) {
            System.out.println("Dosya kaydedildi");
        }else {
            System.out.println("Çıkıldı.");
            System.exit(0);
        }
    }
}
