package com.company;

public class MercedesBenz extends Car implements Printable{

    private String spoiler;

    public MercedesBenz(String model, int year, String color, String spoiler) {
        super(model, year, color);
        this.spoiler = spoiler;
    }

    public MercedesBenz() {
    }

    public String getSpoiler() {
        return spoiler;
    }

    @Override
    public void print() {
        System.out.println("Model: " + getModel() + "\nYear: " + getYear() + "\nColor: " + getColor() + "\nSpoiler: " + getSpoiler());
    }
}
