package com.oraclejava;

public class myBmi {

    private double height;
    private double weight;

    public double getBmi(){
        double bmi = weight / ((height / 100) * (height / 100));
        return bmi;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }
}
