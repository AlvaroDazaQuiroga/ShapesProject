package org.fundacionjala.shapes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Test for {@Link Square}
 */
public class SquareTest {
   private Shapes square;
    private static final double DELTA = 0.5;

    @Before
    public void setUp() {
        final int side = 5;
        square = new Square(side);
    }

    @Test
    public void test_calculateArea_verifyTheCalculationOfTheSquareArea() {
        final double resultArea = 25;
        assertEquals(resultArea, square.calculateArea(), DELTA);
    }

    @Test
    public void test_CalculatePerimeter_verifyTheCalculationOfTheSquarePerimeter() {
        final double resultPerimeter = 20;
        assertEquals(resultPerimeter, square.calculatePerimeter(), DELTA);
    }


}
