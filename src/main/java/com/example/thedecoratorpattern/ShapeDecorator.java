package com.example.thedecoratorpattern;

import java.awt.*;

public abstract class ShapeDecorator implements IShape {
    protected IShape decoratedShape;

    public ShapeDecorator(IShape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(Graphics g) {
        decoratedShape.draw(g);
    }
}
