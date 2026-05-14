import javax.swing.JFrame;
import javax.swing.JButton;

public class window {
    public static void main(String[] args) {
        // Create a new window (JFrame)
        JFrame frame = new JFrame("My First Window");

        // Set size of the window
        frame.setSize(400, 300);

        // Close the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a button to the window
        JButton button = new JButton("Click Me!");
        frame.add(button);

        // Make the window visible
        frame.setVisible(true);
    }
}