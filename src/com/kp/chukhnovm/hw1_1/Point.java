package com.kp.chukhnovm.hw1_1;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Point {
    public double x;
    public double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distTo(Point p2) {

        double diffX = this.getX() - p2.getX();
        double diffY = this.getY() - p2.getY();

        return sqrt(pow(diffX, 2) + pow(diffY, 2));
    }

    @Override
    public String toString() {

        return String.format("Point{ x=%s,y=%s }",
                getX(),
                getY()
        );
    }
}
