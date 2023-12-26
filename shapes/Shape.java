package com.example.prototype.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public abstract class Shape {
    protected Color color;
    protected double size;
    protected double x;
    protected double y;
    public Shape(Color color, double size) {
        this.color = color;
        this.size = size;
        this.x = 0;
        this.y = 0;

    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    };
    public void setSize(double size){
        this.size = size;
    }
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
    public abstract void draw(GraphicsContext gc);
    @Override
    public String toString() {
        return null;
    }
}