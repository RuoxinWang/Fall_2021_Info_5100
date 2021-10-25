package com.company;

public class Student implements ISubscriber{

    private Integer studentID;
    private String name;

    public Integer getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public Student(String name, Integer studentID){
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public void getGrades(Publisher publisher, String className, String grade) {
        System.out.println(publisher.getName() + "Has Published grades for class" + className);
        System.out.println(this.name + "Grade in "+ className + " is " + grade);

    }

    public void subscribe(Publisher publisher){
        publisher.addSubscribe(this);
    }

    public void unsubscribe(Publisher publisher){
        publisher.removeSubscribe(this);
    }
}
