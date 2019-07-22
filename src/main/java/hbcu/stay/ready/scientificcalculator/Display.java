package hbcu.stay.ready.scientificcalculator;

public class Display<unitMode> {
    //private
    protected double currentNumber = 0;

    public void setCurrentNumber(double n) {
        currentNumber = n;
    }
    public double getCurrentNumber() {
        return currentNumber;
    }

    public void clear(){
        currentNumber = 0.0;
    }

    //Scientific Display Features

    String[] switchDisplayModeList = {"binary", "octal", "decimal", "hexadecimal"};

    String displayMode = switchDisplayModeList[0];

    //allows you to go through list
    public int setSwitchDisplayMode() {
        int displayListIndex;
        for (displayListIndex = setSwitchDisplayMode(); displayListIndex < switchDisplayModeList.length; displayListIndex++) {
            if (displayListIndex == 3) {
                displayListIndex = 0;
            }
        }
        displayMode = switchDisplayModeList[displayListIndex];
        return displayListIndex;
    }

    // allows you to switch to mode entered
    public void setSwitchDisplayMode(String mode) {
        displayMode = mode;
    }

    String unitMode = "Degrees";

    public void switchUnitMode (){
        if (unitMode == "Degrees"){
            unitMode = "Radians";
        }
        else{
            unitMode = "Degrees";
        }
    }
}

