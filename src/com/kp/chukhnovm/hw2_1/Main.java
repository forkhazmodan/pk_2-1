package com.kp.chukhnovm.hw2_1;

import com.kp.chukhnovm.hw2_1.shapes.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;

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

        table.addShape(c4); // After removing we can add shapes again

        System.out.println(table.toString());


        // Round testing
        // How about rounding like this?
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.UP);

        Triangle tr2 = new Triangle(new Point(0, 0), new Point(0.02, 0.05), new Point(0, 0.02));
        System.out.println(tr2.getArea());
        System.out.println(BigDecimal.valueOf(tr2.getArea()));
        System.out.println(df.format(tr2.getArea()));
    }
}
