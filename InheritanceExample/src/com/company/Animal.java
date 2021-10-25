package com.company;
//enum animalType{mammal,fish, reptile}
public class Animal {

    //public animalType type;

    //private String animalType;
    private String name;
    private int age;
    private double weight;
    private boolean isMammal;
    private boolean isVegetarian;

    public Animal(String name, int age, double weight, boolean isMammal, boolean isVegetarian){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isMammal = isMammal;
        this.isVegetarian = isVegetarian;
    }


    public void eat(){
        System.out.println("111");
    }

    public void breathe(){
        System.out.println("222");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
