package com.company;

import java.security.PublicKey;

public class House {
    public int houseNumber;
    public String color;
    public int numOfBedrooms;
    public double numOfBaths;
    private boolean isSold;
    public Person owner;


    public House(){
        this.isSold = false;
        System.out.println("I am inside the default constructor");
    }

    public House(int houseNumber, String color, int numOfBaths, int numOfBedrooms){
        this.houseNumber = houseNumber;
        this.color = color;
        this.numOfBaths = numOfBaths;
        this.numOfBedrooms = numOfBedrooms;
        this.owner = new Person("firstname", "lastname","123-456");
    }

    public House(int houseNumber, String color, int numOfBaths, int numOfBedrooms, Person owner){
        this.houseNumber = houseNumber;
        this.color = color;
        this.numOfBaths = numOfBaths;
        this.numOfBedrooms = numOfBedrooms;
        this.owner = owner;
    }

    public void printHouseInformation(){
        System.out.println("House number = " + houseNumber);
        System.out.println("House color = " + color);
        System.out.println("Number of Bedrooms = " + numOfBedrooms);
        System.out.println("Number of Bathrooms= " + numOfBaths);
    }

    public void printHouseInformation(Boolean printOwnerName){
        System.out.println("House number = " + houseNumber);
        System.out.println("House color = " + color);
        System.out.println("Number of Bedrooms = " + numOfBedrooms);
        System.out.println("Number of Bathrooms= " + numOfBaths);
        if(printOwnerName){
            System.out.println("Owner = "+ owner.getFirstName() + owner.getLastName());
        }
    }


}
