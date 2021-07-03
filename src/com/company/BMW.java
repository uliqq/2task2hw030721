package com.company;

public class BMW extends Car implements Printable{

    private String audioSystem;

    public BMW() {
    }

    public BMW(String model, int year, String color, String audioSystem) {
        super(model, year, color);
        this.audioSystem = audioSystem;
    }

    public String getAudioSystem() {
        return audioSystem;
    }


    @Override
    public void print() {
        System.out.println("Model: " + getModel() + "\nYear: " + getYear() + "\nColor: " + getColor() + "\nAudio system: " + getAudioSystem());
    }
}
