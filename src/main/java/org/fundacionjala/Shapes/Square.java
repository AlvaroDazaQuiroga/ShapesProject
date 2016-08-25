package org.fundacionjala.Shapes;

/**
 * Created by Lion on 8/25/2016.
 */
public class Square extends Shapes {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return Math.pow(side, 2);
    }

    public double calculatePerimeter() {
        return side * 4;
    }

    public String getKind() {
        return "Iam a Square";
    }
}
