import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E04ToTheCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 6 numbers");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        ArrayList <Integer> spots  = new ArrayList <> (Arrays.asList(x1,y2,x2,y2,x3,y3));
           int x = 0;
           int y= 0;


        for (int i = 0; i <3 ; i++) {
             x = spots.get (i*2);
             y = spots.get(i*2+1);
            DrawMyLine(x,y, graphics);
        }

}

    public static void DrawMyLine (int x, int y, Graphics graphics ){


        graphics.setColor(Color.RED);
        graphics.drawLine(171, 160, x,y );


}


    // Don't touch the code below
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

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
