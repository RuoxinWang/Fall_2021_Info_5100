package com.company;

public abstract class NonFiction extends Book implements iBorrowable{

    private String title;
    private double price;
    private String publishYear;

    public NonFiction (String title, double price, String publishYear){
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
    }
    @Override
    public String description() {
        return this.getTitle() + "all events are true and based on real facts.";
    }
}
