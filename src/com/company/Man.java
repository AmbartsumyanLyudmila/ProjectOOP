package com.company;

public class Man extends Person {

    @Override
    public boolean getSex() {
        return false;
    }

    public Man(String firstName, String lastName, float height, float weight) {
        super(firstName, lastName, height, weight);

    }

    @Override
    public String toString() {
        return "Man{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "} " + super.toString();


    }
}
