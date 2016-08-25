package org.fundacionjala.Shapes;

import org.fundacionjala.Shapes.Square;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lion on 8/25/2016.
 */
public class SquareTest {

    public static final double PRECISION = 0.5;

    @Test
    public void test_calculateArea_verifyTheCalculationOfTheSquareArea() {
        Shapes square = new Square(5.56);
        double area = square.calculateArea();
        assertEquals(area, 31, PRECISION);
    }

    @Test
    public void test_CalculatePerimeter_verifyTheCalculationOfTheSquarePerimeter() {
        Shapes square = new Square(6.2);
        double perimeter = square.calculatePerimeter();
        assertEquals(perimeter, 25, PRECISION);
    }


}
