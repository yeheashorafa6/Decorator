package com.example.thedecoratorpattern;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.awt.*;

public class Circle implements IShape{

    int x,y,radius;
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
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
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g ) {
      g.drawOval(getX(),getY(),getRadius(),getRadius());

    }

    @Override
    public String describe() {
        return "This Is The Circle";
    }
}