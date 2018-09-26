import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E16StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        for (int i = 0; i < 300; i++) {


        /*int r = (int) (112+(Math.random() * 108));
        int g = (int) (112+(Math.random() * 108));
        int b = (int) (112+(Math.random() * 108));*/

        int r = 119;
        int g = 136;
        int b = 153;

        int x = (int) (Math.random() * 320);
        int y = (int) (Math.random() * 343);
        int w = (int) (Math.random() * 10);

        drawStar(r, g, b, x, y, w, graphics);
    }






    }

    public static void drawStar (int r, int g, int b, int x, int y, int w,  Graphics graphics) {

        graphics.setColor(new Color( r, g, b));
        graphics.fillRect(x,y, w, w);

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
            this.setBackground(Color.BLACK);
            mainDraw(graphics);
        }
    }
}