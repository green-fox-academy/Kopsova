import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class KochLine {
    public static void mainDraw(Graphics graphics) {


        int a = 200;
        drawKochLine(0, 300, a, graphics);


    }

    public static void drawKochLine(int x, int y, int a, Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.drawLine(x, y, x + a, y);
        graphics.drawLine(x + a, y, x + a+(int)(float) (0.5*a), y - a);
        graphics.drawLine(x+a+(int)(float) (0.5*a), y - a, x + 2 * a, y);
        graphics.drawLine(x + 2 * a, y, x + 3 * a, y);
    }

    public static void fractalKoch (int x, int y, int a, Graphics graphics){
        if (a<=10){
            drawKochLine(x,y,a,graphics);
        }


    }


    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
