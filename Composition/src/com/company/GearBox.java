package com.company;

public class GearBox {
    boolean isAutomatic;
    int currentGear;
    int speed;

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public GearBox(boolean isAutomatic){
        this.isAutomatic = isAutomatic;
    }
}
