package com.company;

public abstract class Reference extends Book implements iBorrowable{
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getPublishYear() {
        return publishYear;
    }

    @Override
    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String title;
    private double price;
    private String publishYear;
    private String category;

    public Reference (String title, double price, String publishYear, String category){
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
        this.category = category;
    }
    @Override
    public String description() {
        return this.getTitle() + "all information is real.";
    }
}

