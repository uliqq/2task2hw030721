package com.company;

public class Toyota extends Car implements Printable{

    private String wheels;

    public Toyota(String model, int year, String color, String wheels) {
        super(model, year, color);
        this.wheels = wheels;
    }

    public Toyota() {
    }

    public String getWheels() {
        return wheels;
    }

    @Override
    public void print() {
        System.out.println("Model: " + getModel() + "\nYear: " + getYear() + "\nColor: " + getColor() + "\nWheels: " + getWheels());

    }
}
