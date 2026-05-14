package CS;

import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Bubblesort {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton button = new JButton("Start");
        JButton button1 = new JButton("Stop");
        JButton button2 = new JButton("Pause");

        button.setBounds(20,500,90,30);
        button1.setBounds(120,500,90,30);
        button2.setBounds(220,500,90,30);

        frame.add(button);
        frame.add(button1);
        frame.add(button2);

        frame.setSize(500,600);

        frame.setLayout(null);

        frame.setVisible(true);




    }

    
    
}
