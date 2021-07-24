package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public abstract class Person {

    boolean getSex;
    String FirstName;
    String LastName;
    float height;
    float weight;

    public Person(String firstName, String lastName, float height, float weight) {
    }




    public boolean isGetSex() {
        return getSex;
    }

    public void setGetSex(boolean getSex) {
        this.getSex = getSex;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Person(boolean getSex,String firstName, String lastName, float height, float weight) {
        FirstName = firstName;
        LastName = lastName;
        this.height = height;
        this.weight = weight;
        this.getSex = getSex;
    }
protected Person (boolean getSex ){
    this.getSex = getSex;

}
    public boolean Speak(Person person) {
        if (this.getSex() != person.getSex())
            return true;
        else if (this.getSex() == false && person.getSex() == false)
            return true;
        else return Math.random() < 0.5;
    }


    public boolean Tolerate(Person person) {
        if (this.getSex == false && person.getSex() == false)
            return Math.random() < 0.05;
        else if (this.getSex() != person.getSex())
            return Math.random() < 0.7;
        else return Math.random() < 0.056;
    }

    protected abstract boolean getSex();

    public boolean SpendTime(Person person) {
        if (((this.getHeight() - person.getHeight()) / person.getHeight()) * 100 > 10)
            return Math.random() <= 0.85;
        else
            return Math.random() <= 0.95;
    }

    public Person Relations(Person person) {
        boolean options = (this.Speak(person) && this.Tolerate(person) && this.SpendTime(person));

        if (options != true && (this.getSex() == person.getSex())) {
            return null;
        } else return ((Women) person).BabyBorn(this);

    }

}




