package com.kp.chukhnovm.hw1_1;

import com.kp.chukhnovm.hw1_1.shapes.Shape;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;

public class Table {

    private Shape[] sections = new Shape[4];

    public Table() {
    }

    public double getTotalArea() {
        double totalArea = 0;

        for (Shape shape : this.sections) {
            if (shape != null) {
                totalArea += shape.getArea();
            }
        }

        return totalArea;
    }

    public void addShape(Shape shape) {

        for (int i = 0; i < this.sections.length; i++) {
            if (this.sections[i] == null) {
                this.sections[i] = shape;
                break;
            }
        }
    }

    public void removeShape(Shape shape) {

        for (int i = 0; i < this.sections.length; i++) {
            if (this.sections[i] == null) {
                continue;
            }

            if (this.sections[i].hashCode() == shape.hashCode()) {
                this.sections[i] = null;
                break;
            }
        }
    }

    @Override
    public String toString() {

        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.UP);

        return String.format("Table{ sections=%s, totalArea=%s}",
                Arrays.toString(sections),
                df.format(this.getTotalArea())
        );
    }
}
