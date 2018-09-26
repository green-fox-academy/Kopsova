import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E13CheckerBoard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int a = 30;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {

                int x = a;
                int y = 2*a;
                x = 2*i*a;
                y = 2*j*a;

                drawBlack( x , y, a, graphics);

            }

        }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 4; j++) {
                int x = a;
                int y = 2*a;
                x = 2*i*a +a;
                y = 2*j*a+a; 

                drawBlack( x , y, a, graphics);

            }

        }

    }

    public static void drawBlack (int x, int y, int a, Graphics graphics){
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x,y, a,a);

    }
    public  static void drawWhite (int x, int y, int a, Graphics graphics) {
        graphics.setColor(Color.WHITE);
        graphics.fillRect(x, y, a, a);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

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
        }
    }
}