package com.kp.chukhnovm.hw2_1.shapes;

import com.kp.chukhnovm.hw2_1.Point;

public class Triangle extends Shape {

    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle() {
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
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

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    @Override
    public double getPerimeter() {
        double a = p1.distTo(p2);
        double b = p2.distTo(p3);
        double c = p3.distTo(p1);

        return a + b + c;
    }

    @Override
    public double getArea() {

        double a = p1.distTo(p2);
        double b = p2.distTo(p3);
        double c = p3.distTo(p1);

        double P = this.getPerimeter();
        double halfP = P / 2;

        return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }

    @Override
    public String toString() {
        return String.format("Triangle{ %s, %s, %s }",
                p1.toString(),
                p2.toString(),
                p3.toString()
        );
    }
}
