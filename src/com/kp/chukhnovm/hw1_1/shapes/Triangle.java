package com.kp.chukhnovm.hw1_1.shapes;

import com.kp.chukhnovm.hw1_1.Point;

import java.text.DecimalFormat;

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
