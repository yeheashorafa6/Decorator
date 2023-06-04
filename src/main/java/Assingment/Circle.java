package Assingment;

import java.awt.*;

public class Circle implements Shape{
    int x,y,radius;
    public Circle(){}
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw(Graphics g) {
        g.drawOval(200, 50, 50, 50);
    }
}
