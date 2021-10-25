package com.company;

public class Main {

    public static void main(String[] args) {
	    Publisher Ashish = new Publisher("Ashish", "INFO 5100");
        Publisher Andre = new Publisher("Andre", "BA 111");

        Student Mark = new Student("Mark", 1);
        Student Bill = new Student("Bill", 2);
        Student Peter = new Student("Peter", 3);
        Student John = new Student("John", 4);
        Student Marry = new Student("Marry", 5);

        Ashish.addGrade(1,"A");
        Ashish.addGrade(2,"A-");
        Ashish.addGrade(3,"B");
        Ashish.addGrade(4,"B+");
        Ashish.addGrade(5,"A");

        Andre.addGrade(1,"B");
        Andre.addGrade(2,"B+");
        Andre.addGrade(3,"A");
        Andre.addGrade(4,"A-");
        Andre.addGrade(5,"B-");

        Mark.subscribe(Ashish);
        Peter.subscribe(Ashish);
        Marry.subscribe(Ashish);
        Bill.subscribe(Andre);
        Mark.subscribe(Andre);
        John.subscribe(Andre);

        Ashish.NotifyGrades();
        Andre.NotifyGrades();
    }
}
