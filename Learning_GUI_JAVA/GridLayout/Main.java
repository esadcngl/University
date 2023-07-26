package GridLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //GridLayout = parçaları ızgara hücrelerine yerrleştirir.
        // Bütün parçalar hücre içinde tanımlanan parça kadar yer kaplar
        // tüm hücreler aynı boyuttur.

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,3,5,5));
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.setVisible(true);
    }
}
