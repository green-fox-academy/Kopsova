import javafx.scene.chart.Axis;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        int x1 =0;
        int y1 =0;
        int x2;
        int y2;
        int spaceLines = 10;
        int lilCanvasNo = 64;
        int canvas = (int) Math.sqrt(lilCanvasNo);
        int widthX = WIDTH/canvas;

        for (int k = 0; k < canvas ; k++) { //columns
            for (int l = 0; l < canvas; l++) { //rows
                y2 =0;
                x2 =widthX;
                drawUpperQ(x1+k*widthX,y1 + l*widthX,x2 + k* widthX,y2 +l*widthX,spaceLines,widthX,graphics);
                x2 = 0;
                y2 = widthX;
                drawLowerQ(x1+l*widthX,y1 + k*widthX,x2 + l* widthX,y2 +k*widthX,spaceLines,widthX,graphics);
            }
        }
    }

    public static void drawUpperQ (int x1, int y1, int x2, int y2, int spaceLines, int widthX,  Graphics graphics) {
        for (int i = 0; i < (int) widthX / spaceLines; i++) {
            x1 = x1 + spaceLines;
//            y1=0;
 //           x2 = widthX;
            y2 = y2 + spaceLines;
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(x1, y1, x2, y2);
        }
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



    // Don't touch the code below
    static int WIDTH = 500;
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
