import javax.swing.*;

import java.awt.*;

import static java.awt.Frame.getFrames;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
    public static void mainDraw(Graphics graphics) {


        int x1 = 200;
        int y1 = 0;
        int a = 10;
        int th = triangleHeiht(a);

        drawLilTriangle(a,th,x1,y1, graphics);



   }

    public static int triangleHeiht (int a){
        double v = Math.sqrt(3)*a/2;
        int h = (int) Math.round(v);
        return h;
    }


    public static void drawLilTriangle (int a, int th, int x1, int y1, Graphics graphics){
        System.out.println(a);
        System.out.println(x1);
        System.out.println(y1);
        int x2 = x1 + a/2;
        int y2 = y1 + th;
        graphics.setColor(Color.BLACK);
        graphics.drawLine(x1, y1, x2, y2);
        int x3 = x2 -a;
        int y3 = y2;
        graphics.drawLine(x2,y2,x3,y3);
        graphics.drawLine(x3,y3,x1,y1);

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
