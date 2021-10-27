package com.company;

public class Main {

    public static void main(String[] args) {
        // Ruoxin Wang(NUID 002112972) INFO 5100 Midterm
        // Q2
        Printer p1;
        // refers to the only object of Database
        p1= Printer.getInstance();

        p1.getConnection();
    }
}
