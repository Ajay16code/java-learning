import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class HeatMapExample extends JPanel {

    private int rows = 7;     // days of week
    private int cols = 52;    // weeks in a year
    private int[][] data;

    public HeatMapExample() {
        data = new int[rows][cols];
        generateData();
        setPreferredSize(new Dimension(cols * 15, rows * 15));
    }

    // Generate random data (simulate commits/activity)
    private void generateData() {
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = rand.nextInt(5); // values 0–4
            }
        }
    }

    // Map values to colors
    private Color getColor(int value) {
        switch (value) {
            case 0: return new Color(235, 237, 240); // light gray
            case 1: return new Color(155, 233, 168);
            case 2: return new Color(64, 196, 99);
            case 3: return new Color(48, 161, 78);
            case 4: return new Color(33, 110, 57);  // dark green
            default: return Color.WHITE;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int cellSize = 12;
        int gap = 3;

        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                g.setColor(getColor(data[row][col]));
                g.fillRect(col * (cellSize + gap),
                           row * (cellSize + gap),
                           cellSize, cellSize);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GitHub Heatmap (Java)");
        HeatMapExample heatmap = new HeatMapExample();

        frame.add(heatmap);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}