package com.example.thedecoratorpattern;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Solid implements IShape {
    java.awt.Color fillColor;
    IShape shape;
    int x,y,width,height;



    public Solid(IShape shape) {
        this.shape=shape;
    }


//    private void fillSolid(Graphics g) {
//        g.setColor(Color.RED); // Set desired color
//        shape.draw(g); // Draw the shape with the solid color
//        g.setColor(Color.BLACK); // Reset the color back to default
//    }
    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getFillColor());
        g2d.setBackground(getFillColor());
        ((Graphics2D) g).fill(g2d.getClip());
        shape.draw(g);

    }


    public java.awt.Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }



    @Override
    public String describe() {
        return shape.describe() + " with Solid Circle";
    }

}
