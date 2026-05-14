package CS;

import java.awt.*;

public class button {
    button()
    {
        Frame f = new Frame();

        Button b1 = new Button("Start");
        b1.setBounds(20,500,80,40);
        f.add(b1);

        Button b2 = new Button("Stop");
        b2.setBounds(220,500,50,20);
        f.add(b2);
        
        Button b3 = new Button("Pause");
        b3.setBounds(220,500,50,20);
        f.add(b3);


        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String a[]) { new button(); }
}

        

