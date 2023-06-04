package com.example.thedecoratorpattern;

import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

public interface IShape {

    void draw(Graphics g );
    String describe();


}
