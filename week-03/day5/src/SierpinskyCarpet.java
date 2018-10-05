import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
    public static void mainDraw(Graphics graphics) {

        doFractal(0, 0, 600, graphics);
    }


    public static void drawSquare(int x, int y, int w, Graphics graphics) {

        graphics.setColor(Color.black);
        graphics.fillRect(x, y, w, w);
    }

    public static void doFractal(int x, int y, int w, Graphics graphics) {
        if (w <= 10) {
            drawSquare(x + (int) (w / 3), y + (int) (w / 3), (int) (w / 3), graphics);

        } else {
            drawSquare(x + (int) (w / 3), y + (int) (w / 3), (int) (w / 3), graphics);
            doFractal(x,y,(int)(w/3),graphics);
            doFractal(x,(int)y+(2*w/3),(int)(w/3),graphics);
            doFractal(x+(int)(2*w/3),y+(int)(2*w/3),(int)(w/3),graphics);
            doFractal(x+(int)(2*w/3),y,(int)(w/3),graphics);

            doFractal(x,y+(int)(w/3),(int)(w/3),graphics);
            doFractal(x+(int)(w/3),y,(int)(w/3),graphics);
            doFractal(x+(int)(w/3),y+(int)(2*w/3),(int)(w/3),graphics);
            doFractal(x+(int)(2*w/3),y+(int)(w/3),(int)(w/3),graphics);


//            doFractal(x + (int) ( w / 3), y + (int) (w / 3), (int) (w / 3), graphics);
//            doFractal(x + (int) (7*w / 3), y + (int) ( w / 3), (int) (w / 3), graphics);
//            doFractal(x + (int) (w / 3), y + (int) (7 * w / 3), (int) (w / 3), graphics);
//            doFractal(x + (int) (7 * w / 3), y + (int) (7 * w / 3), (int) (w / 3), graphics);
//        }
        }
    }

        // Don't touch the code below
        static int WIDTH = 600;
        static int HEIGHT = 600;

        public static void main (String[]args){
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

