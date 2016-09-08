package org.fundacionjala.shapes;

/**
 * This class calculate the Area and Perimeter for a Triangle
 */
public class Triangle implements Shapes {
    private final double height;
    private final double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    /**
     *  {@inheritDoc}
     */
    public double calculateArea() {
        return (base * height) / 2;
    }
    /**
     *  {@inheritDoc}
     */
    public double calculatePerimeter() {
        return base * 3;
    }
    /**
     *  {@inheritDoc}
     */
    public String getKind() {
        return "Iam a Triangle";
    }
}
