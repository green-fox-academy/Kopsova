import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class E11PurpleSteps {

    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]
        for (int i = 0; i < 20 ; i++) {
            int x = 20;
             x = i*x;
            drawLilPurpleSquare(x,graphics);

        }





}

public static void drawLilPurpleSquare(int x,  Graphics graphics){
        graphics.setColor(new Color(186,85,204));
        graphics.fillRect(x, x,20,20);

        graphics.setColor(Color.BLACK);
        graphics.drawRect(x, x,20,20);


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
