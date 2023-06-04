package com.example.thedecoratorpattern;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

public class Main extends JFrame {



    Random r = new Random();
    public Main() {


        JButton addShapeBtn = new JButton("Add shape");
        addShapeBtn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                JTextArea a = new JTextArea();
                JScrollPane sp = new JScrollPane(a);

                getContentPane().add(sp);

                Circle c = new Circle(r.nextInt(300),r.nextInt(300),100);
                Border border = new Border(c);
                Solid solid=new Solid(c);
                border.setBorderColor(Color.green);
                border.setBorderWidth(3);
                solid.setX(250);
                solid.setY(100);
                solid.setWidth(100);
                solid.setHeight(150);

                solid.setFillColor(Color.red);


                Rectangle rect = new Rectangle(r.nextInt(300),r.nextInt(300), 100, 50);
                Solid solid2=new Solid(rect);
                solid2.setX(250);
                solid2.setY(100);
                solid2.setWidth(100);
                solid2.setHeight(150);

                solid2.setFillColor(Color.red);

                Border border2 = new Border(rect);
                border2.setBorderColor(Color.red);
                border2.setBorderWidth(2);


                //CircleWithBorder cb = new CircleWithBorder(r.nextInt(300),r.nextInt(300),100);

                border.draw(getGraphics());
                solid.draw(getGraphics());

//                border2.draw(getGraphics());
                System.out.println(border.describe());
                System.out.println(solid.describe());

            }
        });
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLayout(new BorderLayout());
        this.add(addShapeBtn, BorderLayout.SOUTH);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public static void main(String[] args){
        new Main();
    }
}
