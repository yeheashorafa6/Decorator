package Assingment;

import java.awt.*;

public class Solid implements Shape {

    Shape shape;
    public Solid(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw(Graphics g) {
        shape.draw(g);
        addSolidBehavior(g);
    }

    private void addSolidBehavior(Graphics g) {
        // Add solid behavior
        g.setColor(Color.red);
        g.fillRect(50, 50, 100, 50);
        g.fillOval(200, 50, 50, 50);
    }
}
