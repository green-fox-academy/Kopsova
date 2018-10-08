import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexags {

    public static void mainDraw(Graphics graphics){

        int a = 300;
        double h = 0.866* a;
patternHex(0,0,a,h,graphics);


    }

    public static void drawHexagon (int x, int y, int a, double h,Graphics graphics){
        graphics.setColor(Color.BLUE);
        graphics.drawLine((int)(x+(int)(0.5*a)),  y, x+(int)(a/2)+a, y);
        graphics.drawLine((int) x+(int)((a/2.0))+a, (int) y, x+2*a, y+(int)(0.866*a) );
        graphics.drawLine(x+2*a, y+(int)(0.866*a), x+(int)(a/2.0)+a, y+ 2* (int)(0.866*a)  );
        graphics.drawLine ( x+(int)(a/2.0)+a, y+ 2* (int)(0.866*a), x+(int)(a/2.0), y+ 2* (int)(0.866*a)  );
        graphics.drawLine ( x+(int)(a/2.0), y+ 2* (int)(0.866*a), x, y +(int)(0.866*a));
        graphics.drawLine (  x, y+(int)(0.866*a), x+(int)(a/2.0),  y   );
    }

    public static void patternHex( int x, int y, int a, double h, Graphics graphics) {
        if (a<=0){
            drawHexagon(x,y,a,h,graphics);
        }else{
            drawHexagon(x,y,a,h,graphics);
            patternHex((x+(int)(0.5*a)),  y, (int) (a/2.0),h,graphics);


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
            this.setBackground(Color.white);
            mainDraw(graphics);
        }
    }
}