package hbcu.stay.ready.scientificcalculator;

public class Display {
    //private
    protected double currentNumber = 0;

    public void setCurrentNumber(double currentNumber) {
        this.currentNumber = currentNumber;
    }
    public double getCurrentNumber() {
        return currentNumber;
    }

    public double clear(){
        currentNumber = 0;
        return currentNumber;
    }

}

