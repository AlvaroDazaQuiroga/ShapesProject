package org.fundacionjala.Shapes;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Lion on 8/25/2016.
 */
public class TriangleTest {

    public static final double PRECISION = 0.5;

    @Test
    public void test_calculateArea_verifyTheCalculationOfTriangleArea() {
        Shapes triangle = new Triangle(10, 5);
        double area = triangle.calculateArea();
        assertEquals(area, 25, PRECISION);

    }

    @Test
    public void test_calculatePerimeter_verifyTheCalculationOfTriangleEscalenoPerimeter() {
        Shapes triangle = new Triangle(10, 5);
        double perimeter = triangle.calculatePerimeter();
        assertEquals(perimeter, 15, PRECISION);

    }


}
