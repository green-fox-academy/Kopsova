import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E14EverythingGoesToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.


        for (int i = 0; i <343/20 ; i++) {
                int x;
                int y;
                x=0;
                y=20*i;
                drawLine(x,y, graphics);
            }
        for (int i = 0; i <320/20; i++) {
            int x;
            int y;
            x = 20*i;
            y=0;
            drawLine(x,y, graphics);

        }
        for (int i = 0; i <343/20 ; i++) {
            int x;
            int y;
            x=343;
            y=20*i;
            drawLine(x,y, graphics);
        }
        for (int i = 0; i <320/20; i++) {
            int x;
            int y;
            x = 20*i;
            y=320;
            drawLine(x,y, graphics);

        }


        }




    public static void drawLine (int x, int y, Graphics graphics){
        graphics.setColor(new Color( 120, 120, 120));
        graphics.drawLine(x,y,160,171);

    }

    // Don't touch the code below
    static int WIDTH = 310;
    static int HEIGHT = 360;
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
