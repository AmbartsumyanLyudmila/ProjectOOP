package com.company;

public class Man extends Person {



    public Man(boolean getSex,String firstName, String lastName, float height, float weight) {
        super(getSex,firstName, lastName, height, weight);

    }
    @Override
    public boolean getSex() {
        return true;
    }
    @Override
    public String toString() {
        return "Man{" +
                "getSex=" + getSex+'\''+
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "} " + super.toString();


    }
}
