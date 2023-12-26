package com.example.prototype.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Triangle extends Shape implements Cloneable {
    public Triangle(Color color, double size) {
        super(color, size);
    }
    @Override
    public void draw(GraphicsContext gc) {
        double sideLength = size* 20;
        double height = (sideLength * Math.sqrt(3) / 2);
        double centerX = x;
        double topY = y - height / 2 ;
        double[] xPoints = {centerX, (centerX - sideLength / 2),(centerX + sideLength / 2)};
        double[] yPoints = {topY, (topY + height), (topY + height)};
        gc.setFill(color);
        gc.setStroke(color);
        gc.fillPolygon(xPoints, yPoints, 3);
    }
    @Override
    public String toString() {
        return "Треугольник";
    }

    @Override
    public Triangle clone() {
        return (Triangle) super.clone();
    }
}
