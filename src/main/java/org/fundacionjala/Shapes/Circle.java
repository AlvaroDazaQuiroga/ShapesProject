package org.fundacionjala.shapes;

/**
 * This class calculates the area and perimeter  for a circle
 */
public class Circle implements Shapes {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }

    /**
     * {@inheritDoc}
     */
    public String getKind() {
        return "Iam a Circle";
    }

}
