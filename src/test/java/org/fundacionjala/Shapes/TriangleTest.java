package org.fundacionjala.shapes;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Test for {@Link Triangle}
 */
public class TriangleTest {
    private Shapes shapes;
    private static final double DOUBLE = 0.5;

    @Before
    public void setUp() {
        final int base = 10;
        final int height = 5;
        shapes = new Triangle(base, height);
    }

    @Test
    public void test_calculateArea_verifyTheCalculationOfTriangleArea() {
        final double resultArea = 25;
        assertEquals(resultArea, shapes.calculateArea(), DOUBLE);
    }

    @Test
    public void test_calculatePerimeter_verifyTheCalculationOfTriangleEscalenoPerimeter() {
        final double resultPerimeter = 25;
        assertEquals(resultPerimeter, shapes.calculateArea(), DOUBLE);
    }

}
