package com.company;

public class Rhino extends Animal {


    private final Object type;

    public Rhino(String name, int age, double weight, boolean isMammal, boolean isVegetarian) {
        super(name, age, weight, isMammal, isVegetarian);
        type = animalType.mammal;
    }

    public void eat(){
        super.eat();
        System.out.println("xxx");
    }
}
