import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquaresPattern {

    public static void mainDraw(Graphics graphics){
        int x =0;
        int y=0;
        int w = 300;


drawSquare(x, y, w, graphics);

    }

    public static void drawSquare (int x, int y, int w, Graphics graphics){
        graphics.setColor(Color.MAGENTA);
        graphics.drawRect(x, y,w,w);

    }

    public static int pattern( int x, int y, int w){

        w = w/3;
        x= x + w/3
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
            mainDraw(graphics);
        }
    }
}