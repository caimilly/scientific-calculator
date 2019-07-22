package hbcu.stay.ready.scientificcalculator;
import java.lang.Math;

public class ScientificFeatures extends CoreFeatures {
    Display display = new Display();
    public double sine(){
        display.setCurrentNumber(Math.sin(display.getCurrentNumber()));
        return currentNumber;
    }
    public double cosine(){
        display.setCurrentNumber(Math.cos(display.getCurrentNumber()));
        return currentNumber;
    }
    public double tangent(){
        display.setCurrentNumber(Math.tan(display.getCurrentNumber()));
        return currentNumber;
    }
    public double inverseSine(){
        display.setCurrentNumber(Math.asin(display.getCurrentNumber()));
        return currentNumber;
    }
    public double inverseCosine(){
        display.setCurrentNumber(Math.acos(display.getCurrentNumber()));
        return currentNumber;
    }
    public double inverseTangent(){
        display.setCurrentNumber(Math.atan(display.getCurrentNumber()));
        return currentNumber;
    }
    public double log(){
        display.setCurrentNumber(Math.log10(display.getCurrentNumber()));
        return currentNumber;
    }
    public double inverseLog(){
        display.setCurrentNumber(Math.exp(display.getCurrentNumber()));
        return currentNumber;
    }
    public double naturalLog(){
        display.setCurrentNumber(Math.log(display.getCurrentNumber()));
        return currentNumber;
    }
    public double inverseNaturalLog(){
        display.setCurrentNumber(Math.log(1/display.getCurrentNumber()));
        return currentNumber;
    }
    public void factorial(double n){
        int i = 1;
        for(; i < n; i++){
            n *= i;
        }
    }

}
