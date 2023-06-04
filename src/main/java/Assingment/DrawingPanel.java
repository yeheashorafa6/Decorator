package Assingment;

import javax.swing.*;
import java.awt.*;

class DrawingPanel extends JPanel {
    private Shape shape;

    public DrawingPanel(Shape shape) {
        this.shape = shape;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        shape.draw(g);
    }
}