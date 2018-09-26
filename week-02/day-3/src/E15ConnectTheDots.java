import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E15ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int x;
        int y;
        int w;
        int z;

        int[][] array1 = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        for (int i = 0; i < array1.length-1 ; i++) {


            x = array1[i][0];
            y = array1[i][1];
            w = array1[i + 1][0];
            z = array1[i + 1][1];
            DrawLine(x, y, w, z,  graphics);
        }
        x = array1[array1.length-1][0];
        y = array1[array1.length-1][1];
        w = array1[0][0];
        z = array1[0][1];
        DrawLine(x, y, w, z,  graphics);


// second array
        int[][] array2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};


        for (int i = 0; i < array2.length-1 ; i++) {

            x = array2[i][0];
            y = array2[i][1];
            w = array2[i + 1][0];
            z = array2[i + 1][1];
            DrawLine2 (x, y, w, z,  graphics);
        }


        x = array2[array2.length-1][0];
        y = array2[array2.length-1][1];
        w = array2[0][0];
        z = array2[0][1];
        DrawLine2(x, y, w, z,  graphics);




    }






    public static void DrawLine (int x, int y, int w, int z,  Graphics graphics){
        graphics.setColor(Color.BLUE);
        graphics.drawLine(x,y,w,z);

    }

    public static void DrawLine2 (int x, int y, int w, int z,  Graphics graphics){
        graphics.setColor(Color.RED);
        graphics.drawLine(x,y,w,z);

    }

    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

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


// create a 300x300 canvas.