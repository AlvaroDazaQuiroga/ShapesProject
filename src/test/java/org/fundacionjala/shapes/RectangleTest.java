package org.fundacionjala.shapes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@Link Rectangle}
 */

public class RectangleTest {
    private Shapes square;
    private static final double DELTA = 0.5;

    @Before
    public void setUp() {
        final int height = 5;
        final int wide = 5;
        square = new Rectangle(height, wide);
    }

    @Test
    public void test_calculateArea_verifyTheCalculationOfTheSquareArea() {
        final double resultArea = 25;
        assertEquals(square.calculateArea(), resultArea, DELTA);
    }

    @Test
    public void test_CalculatePerimeter_verifyTheCalculationOfTheSquarePerimeter() {
        final double resultPerimeter = 20;
        assertEquals(square.calculatePerimeter(), resultPerimeter, DELTA);
    }

}
