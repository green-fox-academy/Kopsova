import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquaresPattern {

    public static void mainDraw(Graphics graphics){



pattern(0,0,900,graphics);

    }

    public static void drawFourSquare (int x, int y, double w, Graphics graphics){
        graphics.setColor(Color.MAGENTA);
        graphics.drawRect(   x, y+(int)(w/3),(int)(w/3),(int) (w/3));
        graphics.drawRect(x+(int)(w/3), y+(int)(2*w/3),(int)(w/3),(int)(w/3));
        graphics.drawRect(x+(int)(2*w/3), y+(int)(w/3), (int)(w/3), (int)(w/3));
        graphics.drawRect(x+(int)(w/3),y, (int)(w/3),(int)(w/3));

    }

    public static void pattern( double x, double y, double w, Graphics graphics) {
        if (w <= 10) {
            drawFourSquare((int)x, (int)y, w, graphics);
        } else {
            drawFourSquare((int)x, (int)y, w, graphics);
//            pattern((int)x, (int)(y), (int) (w / 3), graphics);
//            drawFourSquare((int)x, (int)y, w, graphics);
//            pattern((int)x, (int)y, (int) (w / (3)), graphics);
//            drawFourSquare((int)x, (int)y, w, graphics);
//            pattern((int)x, (int)y, (int) (w / (3)), graphics);
//            drawFourSquare((int)x, (int)y, w, graphics);
//            pattern((int)x, (int)y, (int) (w / 3), graphics);



            pattern(x, y + (int) (w / 3), (int) (w / 3), graphics);
            pattern(x + (int) (w / 3), y, (int) (w / 3), graphics);
            pattern(x + (int) (w / 3), y + (int) (2 * w / 3), (int) (w / 3), graphics);
            pattern(x + (int) (2 * w / 3), y + (int) (w / 3), (int) (w / 3), graphics);
        }
    }

    // Don't touch the code below
    static int WIDTH = 900;
    static int HEIGHT = 900;

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
            this.setBackground(Color.yellow);
            mainDraw(graphics);
        }
    }
}