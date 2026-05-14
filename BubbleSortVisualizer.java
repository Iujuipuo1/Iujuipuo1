package CS;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BubbleSortVisualizer extends JPanel {

    private int[] array;
    private int i = 0;
    private int j = 0;
    private int currentJ = -1;
    private int currentJPlus1 = -1;
    private Timer timer;

    public BubbleSortVisualizer(int size) {
        array = new int[size];
        Random rand = new Random();

        for (int k = 0; k < size; k++) {
            array[k] = rand.nextInt(300) + 20;
        }

        setBackground(Color.BLACK);

        timer = new Timer(100, e -> sortStep());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int barWidth = Math.max(width / array.length, 1);

        for (int k = 0; k < array.length; k++) {
            if (k == currentJ) {
                g.setColor(Color.RED);
            } else if (k == currentJPlus1) {
                g.setColor(Color.GREEN);
            } else {
                g.setColor(Color.WHITE);
            }

            int barHeight = array[k];
            g.fillRect(k * barWidth, height - barHeight, barWidth - 2, barHeight);
        }
    }

    private void sortStep() {
        if (i < array.length - 1) {
            if (j < array.length - i - 1) {
                currentJ = j;
                currentJPlus1 = j + 1;

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

                j++;
            } else {
                j = 0;
                i++;
            }

            repaint();
        } else {
            currentJ = -1;
            currentJPlus1 = -1;
            repaint();
            timer.stop();
        }
    }

    public void startSorting() {
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Bubble Sort Visualizer");
            BubbleSortVisualizer panel = new BubbleSortVisualizer(50);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 500);
            frame.setContentPane(panel);
            frame.setVisible(true);

            panel.startSorting();
        });
    }
}