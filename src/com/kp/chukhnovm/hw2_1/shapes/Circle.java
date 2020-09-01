package com.kp.chukhnovm.hw2_1.shapes;

import com.kp.chukhnovm.hw2_1.Point;

public class Circle extends Shape {

    private Point p1;
    private Point p2;

    public Circle() {
    }

    public Circle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
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
