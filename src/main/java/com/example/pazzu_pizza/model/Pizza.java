package com.example.pazzu_pizza.model;

public class Pizza {
    private String name;
    private String imgSrc;
    private double price;

    public String getSize() {
        return size;
    }

    public String getTypeDough() {
        return typeDough;
    }

    private String size;
    private String typeDough;

    public Pizza(String name, String image, double price, String size, String typeDough) {
        this.name = name;
        this.imgSrc = image;
        this.price = price;
        this.size = size;
        this.typeDough = typeDough;
    }

    public Pizza() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public double getPrice() {
        return price;
    }

}
