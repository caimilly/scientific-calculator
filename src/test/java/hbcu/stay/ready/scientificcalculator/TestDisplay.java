package hbcu.stay.ready.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.scientificcalculator.Display;

public class TestDisplay{
    @Test
    public void currentNumberTest(){
        Display display = new Display();

        display.getCurrentNumber();

        Double expected = 0.0;
        Double actual = display.getCurrentNumber();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void clearTest(){
        Display display = new Display();

        display.setCurrentNumber(0);
        display.clear();

        Double expected = 0.0;
        Double actual = display.clear();
        Assert.assertEquals(expected,actual);
    }
}

