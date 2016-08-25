package org.fundacionjala.Shapes;

/**
 * Created by Lion on 8/25/2016.
 */
public class Circle extends Shapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }

    public String getKind() {
        return "Iam a Circle";
    }
}
