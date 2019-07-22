package hbcu.stay.ready.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.scientificcalculator.Display;

public class CoreFeaturesTest {
    //number??
    Display display = new Display();
    CoreFeatures calculator = new CoreFeatures();
    @Test
    public void addTest(){
        double n = 7;

        calculator.add(7);

        Double expected = n;
        Double actual = display.getCurrentNumber() + n;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void subtractTest(){
        double n = 3;
        calculator.subtract(3);

        Double expected = n;
        Double actual = display.getCurrentNumber() - n;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void multiplyTest(){
        double n = 5;
        calculator.multiply(5);

        Double expected = n;
        Double actual = display.getCurrentNumber() * n;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void divideTest(){
        double n = 2;
        display.setCurrentNumber(4);
        calculator.divide(n);

        Double expected = n;
        Double actual = display.getCurrentNumber() / n;
        Assert.assertEquals(expected,actual);
    }
    /*@Test
    public void divideErrorTest(){
        display.setCurrentNumber(8);
        calculator.divide(0.0);

        String expected = "n/0 not possible, try again";
        Double actual = display.getCurrentNumber();
        Assert.assertNotEquals(expected,actual);
    }

     */


    @Test
    public void squareTest(){
        display.setCurrentNumber(5);
        calculator.square();

        Double expected =25.0;
        Double actual = Math.pow(display.getCurrentNumber(),2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void squareRootTest(){
        /*
        double n = 16;
        display.setCurrentNumber(n);
        calculator.squareRoot(n);

        Double expected = 4.0;
        Double actual = Math.sqrt(n);
        Assert.assertEquals(expected,actual);
         */

        display.setCurrentNumber(16);
        calculator.squareRoot();

        Double expected = 4.0;
        Double actual = Math.sqrt(display.getCurrentNumber());
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void exponentiationTest(){
        display.setCurrentNumber(2);
        double n = 4;
        calculator.exponentiation(n);
        Double expected = 16.0;
        Double actual = Math.pow(display.getCurrentNumber(),n);
        double delta = 0;
        Assert.assertEquals(expected,actual,delta);
    }

    @Test
    //testing if positive becomes negative
    public void inverseNumberTest() {
        display.setCurrentNumber(10);
        calculator.inverseNumber();

        Double expected = 0.1;
        Double actual = (1/display.getCurrentNumber());
        double delta = 0;
        Assert.assertEquals(expected,actual,delta);
    }
    @Test
    //testing if positive becomes negative
    public void inversePositiveSignTest(){
        display.setCurrentNumber(3);
        calculator.inverseSign();

        Double expected = -3.0;
        Double actual = display.getCurrentNumber()*-1;
        double delta = 0;
        Assert.assertEquals(expected,actual,delta);
    }
    @Test
    //testing if negative becomes positive
    public void inverseNegativeSignTest(){
        display.setCurrentNumber(-8);
        calculator.inverseSign();

        Double expected = 8.0;
        Double actual = display.getCurrentNumber()*-1;
        double delta = 0;
        Assert.assertEquals(expected,actual,delta);
    }
}
