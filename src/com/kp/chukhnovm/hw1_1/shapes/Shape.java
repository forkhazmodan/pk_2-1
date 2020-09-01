package com.kp.chukhnovm.hw1_1.shapes;

import com.kp.chukhnovm.hw1_1.Point;

import static java.lang.StrictMath.sqrt;
import static java.lang.StrictMath.pow;

abstract public class Shape {
    public abstract double getPerimeter();

    public abstract double getArea();

    public static double getLength(Point p1, Point p2) {

        double diffX = p1.getX() - p2.getX();
        double diffY = p1.getY() - p2.getY();

        return sqrt(pow(diffX, 2) + pow(diffY, 2));
    }
}
