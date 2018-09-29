import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        int x1 =0;
        int y1 =0;
        int x2 =WIDTH;
        int y2 =0;
        int spaceLines = 50;


        for (int i = 0; i < (int) WIDTH/spaceLines; i++) {
            x1 = x1 + spaceLines;
//            y1=0;
            x2 = WIDTH;
            y2 = y2 + spaceLines;

            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(x1, y1, x2, y2);
        }
    x2 = 0;
        for (int j = 0; j < (int)WIDTH/spaceLines; j++) {
            x1 = 0;
            y1 = y1 + spaceLines;
            x2 = x2 + spaceLines;
            y2 = WIDTH;
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x1,y1,x2,y2);
        }
    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = WIDTH;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
            this.setBackground(Color.WHITE);
        }
    }
}
