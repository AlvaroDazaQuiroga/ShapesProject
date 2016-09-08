package org.fundacionjala.shapes;

/**
 * This class is in charge to calculate the area and perimeter for a Rectangle
 */
public class Rectangle implements Shapes {

    private static final int QUANTITY_OF_WIDE_SIDES = 2;
    private static final int QUANTITY_OF_HEIGHT_SIDES = 2;
    private int height = 5;
    private int wide = 5;

    public Rectangle(int height, int wide) {
        this.height = height;
        this.wide = wide;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return wide * height;
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return (wide * QUANTITY_OF_WIDE_SIDES) + (height * QUANTITY_OF_HEIGHT_SIDES);
    }

    /**
     * {@inheritDoc}
     */
    public String getKind() {
        return "Iam a Rectangle";
    }

}
