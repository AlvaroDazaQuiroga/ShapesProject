package org.fundacionjala.Shapes;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Lion on 8/25/2016.
 */
public class CircleTest {

    public static final double PRECISION = 0.5;

    @Test
    public void test_calculateArea_verifyTheCalculationOfCircleArea() {
        Shapes circle = new Circle(4);
        double area = circle.calculateArea();
        assertEquals(area, 50, PRECISION);
    }

    @Test
    public void test_calculatePerimeter_varifyTheCalculationOfCIrclePerimeter() {
        Shapes circle = new Circle(5);
        double perimeter = circle.calculatePerimeter();
        assertEquals(perimeter, 31, PRECISION);
    }

}
