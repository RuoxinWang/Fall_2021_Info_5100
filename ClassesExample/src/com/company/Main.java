package com.company;

public class Main {

    public static void main(String[] args) {
       /* House whiteHouse = new House();
        whiteHouse.houseNumber = 1;
        whiteHouse.color = "White";

        System.out.println("White House Number : " + whiteHouse.houseNumber);
        System.out.println("White House Color : " + whiteHouse.color);

        House greenHouse = whiteHouse;

        System.out.println("Green House Number : " + greenHouse.houseNumber);
        System.out.println("Green House Color : " + greenHouse.color);

        greenHouse.houseNumber = 2;
        greenHouse.color = "Green";
        System.out.println("White House Number : " + whiteHouse.houseNumber);
        System.out.println("White House Color : " + whiteHouse.color);
        System.out.println("Green House Number : " + greenHouse.houseNumber);
        System.out.println("Green House Color : " + greenHouse.color);

        */

        House h1 = new House();
        h1.houseNumber = 1;
        h1.color = "White";
        h1.numOfBedrooms = 3;
        h1.numOfBaths = 2;

        House h2 = new House();
        h2.houseNumber = 2;
        h2.color = "Green";
        h2.numOfBedrooms = 3;
        h2.numOfBaths = 2.5;
        //h2.isSold = true;

        House h3 = new House(3,"Blue",3,3);
        //Person onwer1 = new Person("firstname","lastname",'123-456');

        House[] houses = {h1,h2,h3};

        for(House house: houses){
            house.printHouseInformation();
        }


    }

    static void printOwnerName(House house){
        System.out.println("Owner =" +house.owner.getFirstName() + ", " + house.owner.getLastName());
    }



}
