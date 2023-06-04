package com.example.thedecoratorpattern;

import javafx.scene.canvas.GraphicsContext;

import javax.swing.*;
import java.awt.*;

public class Border extends JFrame implements IShape{

    IShape shape;
    int borderWidth;
    java.awt.Color borderColor;


    public Border(IShape shape) {
        this.shape = shape;
    }

    @Override
    public void draw(Graphics g) {
        shape.draw(g);

        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(borderWidth);
        g2d.setColor(borderColor);
        g2d.setStroke(bs);

        shape.draw(g2d);
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public java.awt.Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String describe() {
        return shape.describe() + " with border";
    }

}

