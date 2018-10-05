import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
    public static void mainDraw(Graphics graphics){


int r = 200;

fractalCirc(0,0,r,graphics);


    }

    public static void drawCircle(int x, int y, int r, Graphics graphics) {
       graphics.setColor(Color.BLUE);
       graphics.drawOval(x,y,2*r,2*r);
    }

    public static void fractalCirc (int x, int y, int r, Graphics graphics){

        if (r<=10){
            drawCircle(x,y,r,graphics);
        }else{

            drawCircle(x,y,r,graphics);
            fractalCirc( x+(int)(0.5*r),y,(int)(0.5*r),graphics);
            fractalCirc(x, y+(int)(2.0/3.0*r),(int)(0.5*r),graphics);
            fractalCirc(x, y+(int)(2.0/3.0*r),(int)(0.5*r),graphics);

        }



    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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