package com.company;

public abstract class Fiction extends Book implements iBorrowable{

    private String title;
    private double price;
    private String publishYear;

    public Fiction (String title, double price, String publishYear){
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
    }
    @Override
    public String description() {
        return this.getTitle() +"all events are imaginary and not based on real facts.";
    }
}
