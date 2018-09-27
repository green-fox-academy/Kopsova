import javax.swing.*;

import java.awt.*;

import static java.awt.Frame.getFrames;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
    public static void mainDraw(Graphics graphics) {


        int startx1 = 100;
        int y1 = 300;
        int a = 20;
        int th = triangleHeiht(a);
        int trlenth = 15;

        

        for (int i = 0; i < trlenth*1000; i++) {

            int x1= startx1 + a/2*i;
            y1=y1-th;
            trlenth--;


            for (int j = 0; j < trlenth; j++) {

                x1 = (x1 + a);
                drawLilTriangle(a, th, x1, y1, graphics);
            }

        }










   }

    public static int triangleHeiht (int a){
        double v = Math.sqrt(3)*a/2;
        int h = (int) Math.round(v);
        return h;
    }


    public static void drawLilTriangle (int a, int th, int startx1, int y1, Graphics graphics){
        int x2 = startx1 + a/2;
        int y2 = y1 + th;
        graphics.setColor(Color.BLACK);
        graphics.drawLine(startx1, y1, x2, y2);
        int x3 = x2 -a;
        int y3 = y2;
        graphics.drawLine(x2,y2,x3,y3);
        graphics.drawLine(x3,y3,startx1,y1);
    }


    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

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
