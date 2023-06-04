package Assingment;

import java.awt.*;

public class Rectangle implements Shape {
    @Override
    public void draw(Graphics g) {
        g.drawRect(50, 50, 100, 50);
    }
}
