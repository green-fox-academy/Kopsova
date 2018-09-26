import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E07FillWithRectangles {
    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.


        for (int i = 0; i < 4; i++) {
            int x = (int) (Math.random()*1000);
            int y = (int) (Math.random()*1000);
            int w = (int) (Math.random()*1000);
            int h = (int) (Math.random()*1000);
            int r = (int) (Math.random()*256);
            int g = (int) (Math.random()*256);
            int b = (int) (Math.random()*256);
            drawMyRect(x,y,w,h,r,g,b,graphics);
        }


}


public static void  drawMyRect (int x, int y, int w, int h, int r, int g, int b,  Graphics graphics){

        graphics.setColor(new Color(r,g,b));
        graphics.fillRect(x,y,w,h);

}
    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
