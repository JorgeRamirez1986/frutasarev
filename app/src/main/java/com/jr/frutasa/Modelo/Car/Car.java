package com.jr.frutasa.Modelo.Car;


public class Car {
    private String name;
    private String Description;
    private String urlImage;
    private String price;
    private String model;

    public Car(String name, String description, String urlImage, String price, String model){
        this.name = name;
        this.Description = description;
        this.urlImage = urlImage;
        this.price = price;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}