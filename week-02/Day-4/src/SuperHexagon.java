import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {
        //base length - a
        int a = 20;
        int hh = 2 * triangleHeiht(a);
        int startx1 = 250;
        int starty1 = 500;

        int hexags = 5;
        int longestRow = hexags -1;
        int rows = hexags*2-1;
        int zx1 = startx1;
        int zy1 = starty1;



        for (int i = 0; i < rows; i++) {

           if (i<longestRow +1) {
                zx1 = zx1 + (int)((double)a *1.5) ;
                zy1 = zy1 - hh / 2;
           }
            else{
            //  zx1 = zx1;
                zy1 = zy1-hh;
            }
        //draws 4 hexagons
            int x1 = zx1;
            int y1 = zy1;

             for (int j = 0; j < hexags; j++) {
                 x1 = x1 - (a + a / 2);
                 y1 = y1 - hh / 2;
                 drawLilHexagone(a, hh, x1, y1, graphics);
             }

            if (i<longestRow) {
                hexags++;
            }
            else {
                hexags--;
            }
        }
}







    public static void drawLilHexagone (int a, int hh, int x1, int y1, Graphics graphics){
       // int x1 = startx1;
       // int y1 = starty1;
        int x2 = x1 + a;
        int y2 = y1;
        graphics.setColor(Color.BLACK);
        graphics.drawLine(x1, y1, x2, y2);
        int x3 = x2 +a/2;
        int y3 = y2-hh/2;
        graphics.drawLine(x2,y2,x3,y3);
        int x4 =x2;
        int y4 = y3-hh/2;
        graphics.drawLine(x3,y3,x4,y4);
        int x5 =x1;
        int y5 = y4;
        graphics.drawLine(x4,y4,x5,y5);
        int x6 =x3-2*a;
        int y6 =y3;
        graphics.drawLine(x5,y5,x6,y6);
        graphics.drawLine(x6,y6,x1,y1);

    }


    public static int triangleHeiht (int a){
        double v = Math.sqrt(3)*a/2;
        int h = (int) Math.round(v);
        return h;
    }



    // Don't touch the code below
//    static int WIDTH = 320;
//    static int HEIGHT = 343;
    static int WIDTH = 600;
    static int HEIGHT = 600;

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