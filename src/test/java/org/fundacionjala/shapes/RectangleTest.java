package org.fundacionjala.shapes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@Link Rectangle}
 */

public class RectangleTest {
    private Shapes rectangle;
    private static final double DELTA = 0.5;

    @Before
    public void setUp() {
        final int height = 5;
        final int wide = 5;
        rectangle = new Rectangle(height, wide);
    }

    @Test
    public void test_calculateArea_verifyTheCalculationOfTheRectangleArea() {
        final double resultArea = 25;
        assertEquals(resultArea, rectangle.calculateArea(), DELTA);
    }

    @Test
    public void test_CalculatePerimeter_verifyTheCalculationOfTheRectanglePerimeter() {
        final double resultPerimeter = 20;
        assertEquals(resultPerimeter, rectangle.calculatePerimeter(), DELTA);
    }

}
