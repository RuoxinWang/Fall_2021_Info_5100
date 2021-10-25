package com.company;

public class Kia extends Car{
    public Kia(String name, String modelName, int wheelSize, boolean isAutomatic, int numSeats, boolean hasLeatherSeats) {
        super(name, modelName, wheelSize, isAutomatic, numSeats, hasLeatherSeats);
        super.setName("Kia");
    }
}
