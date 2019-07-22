package hbcu.stay.ready.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.scientificcalculator.Display;

public class DisplayTest {
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

        display.setCurrentNumber(2);
        display.clear();

        double expected = 0.0;
        double actual = display.getCurrentNumber();
        Assert.assertEquals(expected,actual, 0.0);
    }

    //Scientific Display Features Test
    @Test
    public void switchDisplayModeTest(){}

    @Test
    public void switchUnitModeTest(){}














}

