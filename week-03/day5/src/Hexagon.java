import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {
    public static void mainDraw(Graphics graphics){

int a = 300;
double h = 0.866* a;

hexFractal(0,0,300,h,graphics);


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

    public static void hexFractal ( int x, int y, int a, double h, Graphics graphics){
        if (a<=10){
            drawHexagon(x,y,a,h,graphics);
        }
        else {


            drawHexagon(x , y, a, h, graphics);

            hexFractal((int)(x+a/3), y, (int)(a/3), h,graphics);
            hexFractal((int)(x+a), y, (int)(a/3),h,graphics);

            hexFractal((int)(x+a/3), (int)(y +(double)(4.0/3.0*h)), (int)(a/3),h,graphics);
            hexFractal((int)(x+a), (int)(y +(double)(4.0/3.0*h)), (int)(a/3),h,graphics);

            hexFractal((int)(x), y+(int)(2*h/3.0), (int)(a/3), h,graphics);
         //   hexFractal((int)(x), y, (int)(a/3),h,graphics);


        //    hexFractal((int)(x+((7/6)*a)),y, (int)(a/3),graphics);
         //   hexFractal((int)(x+1.5*a),(int) (y+0.866*a/9), (int)(a/3),graphics);
//            hexFractal((int)(x+a/2+2*a/3),(int) (y+0.866*a), (int)(a/3),graphics);
//            hexFractal((int)(x+a/2),(int) (y+0.866*a/2+0.866*a/3), (int)(a/3),graphics);
//            hexFractal((int)(x),(int) (y+0.866*a/3), (int)(a/3),graphics);

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