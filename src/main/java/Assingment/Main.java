package Assingment;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Solid Shape Decorator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            Shape rectangle = new Rectangle();
            Shape solidRectangle = new Solid(rectangle);
//            Random r=new Random();
            Shape circle = new Circle();
            Shape solidCircle = new Solid(circle);
//            Border border=new Border(circle);
//            border.setBorderColor(Color.green);
//            border.setBorderWidth(3);
//            border.draw(border.getGraphics());
            JPanel panel = new DrawingPanel(solidCircle); // Change to solidRectangle for a solid rectangle
            frame.add(panel);

            frame.setVisible(true);
        });
    }
}

