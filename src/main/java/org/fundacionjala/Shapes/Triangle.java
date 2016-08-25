package org.fundacionjala.Shapes;

/**
 * Created by Lion on 8/25/2016.
 */
public class Triangle extends Shapes {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double calculateArea() {
        return (base * height) / 2;
    }

    public double calculatePerimeter() {
        return base * 3;
    }

    public String getKind() {
        return "Iam a Triangle";
    }
}
