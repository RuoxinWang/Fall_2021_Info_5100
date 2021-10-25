package com.company;

import java.util.ArrayList;

public class Person extends Thread{

    private ArrayList<Person> followers;

    String personName;

    public String getPersonName(){
        return personName;
    }

    public Person(String personName){
        this.personName = personName;
    }

    @Override
    public void run(){
        System.out.println("Thread running");
    }

    public void Tweet(String tweetmessage){
        for(Person person : followers)
    }

    public void addFollower(Person person){
        if(!followers.contains(person)){
            followers.add(person);
        }
    }

    public void removeFollower(Person person){
        if(followers.contains(person)){
            followers.remove(person);
        }
    }

    public void follow(Person person)

}
