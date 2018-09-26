import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E12PurpleSteps3D {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]
int y =30;
int x = 0;

        for (int i = 1; i < 6; i++) {
            y = y +10*i;
            x = x+y-10*i;
            drawLilPurpleSquare(x,y,graphics);
            
        }

    }

    public static void drawLilPurpleSquare(int x, int y, Graphics graphics){
        graphics.setColor(new Color(186,85,204));
        graphics.fillRect(x, x,y,y);

        graphics.setColor(Color.BLACK);
        graphics.drawRect(x, x,y,y);


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