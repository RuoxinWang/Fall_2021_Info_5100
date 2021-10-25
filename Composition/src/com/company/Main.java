package com.company;

public class Main {

    public static void main(String[] args) {
	    Car mercedes = new Car("Mercedes","C300",17,true, 5, true);
        Car kia = new Car("Kia","Soul", 15, true, 5, false);
        Car tesla = new Car("Tesla", "Roadster",17,true,2, false);


        System.out.println(mercedes.modelName);
    }
}
