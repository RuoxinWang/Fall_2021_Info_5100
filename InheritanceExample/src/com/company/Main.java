package com.company;

public class Main {

    public static void main(String[] args) {
	Rhino rhino = new Rhino("super Rhino",2, 250, true, true);
    rhino.eat();
    rhino.getName();
    System.out.println(rhino.getAge());

    rhino.breathe();


    }
}
