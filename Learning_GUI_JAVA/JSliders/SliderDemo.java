package JSliders;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo() {
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);// sınırları yazıyoruz sondaki ise başlangıç değeri
        slider.setPreferredSize(new Dimension(400, 300));
        slider.setPaintTicks(true); // küçük çıkıntıları görünür yapar
        slider.setMinorTickSpacing(10); // minor çıkıntıların aralığını belirler
        slider.setPaintTicks(true);  // çıkıntıların görünür yapar
        slider.setMajorTickSpacing(25); // major çıkıntıların aralığını belirler

        slider.setPaintLabels(true);//  çıkıntıların altında kaçıncı level olduğu yazar.
        slider.setFont(new Font("MV Boli", Font.BOLD, 15));
        slider.setOrientation(SwingConstants.VERTICAL); // sliderin horizontal dikey olarak gösterir.
        slider.addChangeListener(this);
        label.setText(" C santigrat = " + slider.getValue());
        label.setFont(new Font("Consolas", Font.BOLD, 30));
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420, 420);
        frame.setVisible(true);

    }


    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText(" C santigrat = " + slider.getValue());
    }
}
