package sn.sirius.calculator;

import junit.framework.Assert;
import org.junit.Test;

public class MyCalculatorTest {


    @Test
    public void testSum() {
        // Given
        MyCalculator calculator = new MyCalculator();
        // When
        int result = calculator.sum(2, 2);
        // Then
        if (result != 4) {   // if 2 + 2 != 4
            Assert.fail();
        }
    }

    @Test
    public void testMinus() {
        MyCalculator calculator = new MyCalculator();
        Assert.assertEquals(0, calculator.minus(2, 2));
    }

    @Test
    public void testDivide() {
        MyCalculator calculator = new MyCalculator();
        Assert.assertEquals(2, calculator.divide(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        MyCalculator calculator = new MyCalculator();
        calculator.divide(6, 0);
    }
}
