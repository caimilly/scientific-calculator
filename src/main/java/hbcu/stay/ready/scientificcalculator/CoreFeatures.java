package hbcu.stay.ready.scientificcalculator;
import java.lang.Math;

public class CoreFeatures extends Display {
    Display display = new Display();
    public double add(double n){
        display.setCurrentNumber(display.getCurrentNumber()+n);
        return currentNumber;
    }
    public double subtract(double n){
        display.setCurrentNumber((display.getCurrentNumber()-n));
        return currentNumber;
    }
    public double multiply(double n){
        display.setCurrentNumber(display.getCurrentNumber()*n);
        return currentNumber;
    }
    public double divide(double n){
        display.setCurrentNumber(display.getCurrentNumber()/n);
        return currentNumber;
    }
    public double square(){display.setCurrentNumber(Math.pow(display.getCurrentNumber(),2));
    return currentNumber;
    }
    public double squareRoot(){
        //double n parameter
        //display.setCurrentNumber(Math.sqrt(n));
        //return this.currentNumber;

        display.setCurrentNumber((Math.sqrt(display.getCurrentNumber())));
        return this.currentNumber;

    }
    public double exponentiation(double n){
        display.setCurrentNumber(Math.pow(display.getCurrentNumber(),n));
        return this.currentNumber;
    }
    public double inverseNumber(){
        display.setCurrentNumber(1/display.getCurrentNumber());
        return this.currentNumber;
    }
    public double inverseSign(){
        if (display.currentNumber < 0){
            display.currentNumber *= -1;
        }
        else {
            this.currentNumber *= -1;
        }
        return this.currentNumber;
    }
    //public  error(){}

}
