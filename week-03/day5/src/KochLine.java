import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class KochLine {
    public static void mainDraw(Graphics graphics) {


        int a = 200;
        drawKochLine(0, 300, a, graphics);


    }

    public static void drawKochLine(double x1, double y1, double x2,double y2, Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.drawLine((int)x1, (int)y1, (int) ((x2-x1)/3+x1), (int)y2);
        graphics.drawLine((int) ((x2-x1)/3+x1), (int)y1, (int)((x2-x1)/3+x1+(x2-x1)/2), (int)(y1+0.866 * (x2-x1)/3));
        graphics.drawLine((int)((x2-x1)/3+x1+(x2-x1)/2), (int)(y1+0.866 * (x2-x1)/3), (int)(x2-x1 + 1.5*(x2-x1)), (int) (x2));
        graphics.drawLine((int)(((int)(x2-x1 + 1.5*(x2-x1)))), y1, (int) (x2 ) , (int)(y2)))

    public static void fractalKoch (int x, int y, int a, Graphics graphics){
        if (a<=10){
            drawKochLine(x,y,a,graphics);
            fractalKoch(x,y,(int)(a/3.0),graphics);

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
