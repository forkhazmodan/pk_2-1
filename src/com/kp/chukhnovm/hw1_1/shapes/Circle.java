package com.kp.chukhnovm.hw1_1.shapes;

import com.kp.chukhnovm.hw1_1.Point;

public class Circle extends Shape {

    private Point p1;
    private Point p2;

    public Circle() {
    }

    public Circle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getRadius() {
        return p1.distTo(p2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.getRadius();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    @Override
    public String toString() {
        return String.format("Circle{ %s, %s }",
                p1.toString(),
                p1.toString()
        );
    }
}
