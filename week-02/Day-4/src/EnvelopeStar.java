import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int x1 =0;
        int y1 =0;
        int x2 =0;
        int y2 = 0;
        int spaceLines = 10;
        int lilCanvasNo = 4;
        int canvas = (int) Math.sqrt(lilCanvasNo);
        int widthX = WIDTH/canvas;



        drawLowerQ((0 +widthX),0, (0 +widthX), widthX,spaceLines, widthX, graphics);
        drawLowerQ(widthX, y1+widthX,  x2, 0 + widthX, spaceLines, widthX, graphics);
        //drawOneThreeQ(x1,y1,x2,widthX,spaceLines, widthX, graphics);
        drawOneThreeQ(widthX,y1,x2,widthX+widthX,spaceLines, widthX, graphics);

        drawLowerQ(widthX,y1,widthX,widthX,-spaceLines,widthX,graphics);



    }

    public static void drawLowerQ (int x1, int y1, int x2, int y2, int spaceLines, int widthX,  Graphics graphics) {
        for (int j = 0; j < (int)widthX/spaceLines; j++) {
            //           x1 = 0;
            y1 = y1 + spaceLines;
            x2 = x2 + spaceLines;
            //          y2 = widthX;
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x1,y1,x2,y2);
        }
    }

    public static void drawOneThreeQ (int x1, int y1, int x2, int y2, int spaceLines, int widthX,  Graphics graphics) {
        for (int j = 0; j < (int)widthX/spaceLines; j++) {
            x1 = x1+spaceLines; //x1 = widthX
            y1 = widthX;        //y1=y1+spaceLines
            x2 = widthX;        //x2 = widthX  + x2 - spaceLines
            y2 = y2-spaceLines; //y2 = widthX
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x1,y1,x2,y2);
        }
    }

    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = WIDTH;

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
            this.setBackground(Color.WHITE);
        }
    }
}
