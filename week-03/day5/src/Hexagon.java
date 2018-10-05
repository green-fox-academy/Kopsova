import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {
    public static void mainDraw(Graphics graphics){



hexFractal(0,0,600,graphics);


    }

    public static void drawHexagon (int x, int y, int a, Graphics graphics){
        graphics.setColor(Color.BLUE);
        graphics.drawLine(x+(int)(a/2),  y, x+(int)(a/2)+a, y);
        graphics.drawLine(x+(int)(a/2)+a, (int) y, x+2*a, y+(int)(((Math.pow(3, 1/2)*a))) );
        graphics.drawLine(x+2*a, y+(int)(((Math.pow(3, 1/2)*a))), x+(int)(a/2)+a, y+ 2* (int)(((Math.pow(3, 1/2)*a)))  );
        graphics.drawLine ( x+(int)(a/2)+a, y+ 2* (int)(((Math.pow(3, 1/2)*a))), x+(int)(a/2), y+ 2* (int)(((Math.pow(3, 1/2)*a)))  );
        graphics.drawLine ( x+(int)(a/2), y+ 2* (int)(((Math.pow(3, 1/2)*a))), x, y+(int)(((Math.pow(3, 1/2)*a)))  );
        graphics.drawLine (  x, y+(int)(((Math.pow(3, 1/2)*a))), x+(int)(a/2),  y   );
    }

    public static void hexFractal ( int x, int y, int a, Graphics graphics){
        if (a<=5){
            drawHexagon(x+(int)(a/2),y,a,graphics);
        } else {


            drawHexagon(x + (int) (a / 2), y, a, graphics);

            hexFractal(x + (int) (a / 2), y, (int) (a / 3), graphics);
            hexFractal(x + a + (int) (a / 2 + 2 * a / 3), y, (int) (a / 3), graphics);
            hexFractal(x + a + (int) (a / 3 + a / 6), y + (int) (2 / 3 * (((Math.pow(3, 1 / 2) * a)))), (int) (a / 3), graphics);
            hexFractal(x + a + (int) (a / 6), y + (int) (int) (4 / 3 * ((Math.pow(3, 1 / 2) * a))), (int) (a / 3), graphics);
            hexFractal(x + (int) (a / 2), y + (int) (int) (4 / 3 * ((Math.pow(3, 1 / 2) * a))), (int) (a / 3), graphics);
            hexFractal(x + (int) (a / 6), y + (int) (2 / 3 * (((Math.pow(3, 1 / 2) * a)))), (int) (a / 3), graphics);

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
            mainDraw(graphics);
        }
    }
}