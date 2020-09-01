package com.kp.chukhnovm.hw1_1;

import com.kp.chukhnovm.hw1_1.shapes.*;

public class Main {

    public static void main(String[] args) {

        Triangle tr1 = new Triangle(new Point(0, 0), new Point(2, 5), new Point(0, 2));
        Circle c1 = new Circle(new Point(0, 0), new Point(0, 1));
        Circle c2 = new Circle(new Point(0, 0), new Point(0, 2));
        Circle c3 = new Circle(new Point(0, 0), new Point(0, 3));
        Circle c4 = new Circle(new Point(0, 0), new Point(0, 4));

        Table table = new Table();
        table.addShape(tr1);
        table.addShape(c1);
        table.addShape(c2);
        table.addShape(c3);

        System.out.println(table.toString());

        table.addShape(c4); // Nothing added because table already full

        System.out.println(table.toString());

        table.removeShape(c3); // Remove shape from table

        System.out.println(table.toString());

        table.addShape(c4); // After removing we can add shapes

        System.out.println(table.toString());
    }
}
