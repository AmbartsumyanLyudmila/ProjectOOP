package com.company;

import java.util.Scanner;

public class Women extends Person {

    @Override
    protected boolean getSex() {
        return false;
    }

    @Override
    public String toString() {
        return "Women{" +
                "getSex=" + getSex +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "} " + super.toString();
    }

    public Women(Boolean setSex, String firstName, String lastName, float height, float weight) {
        super(firstName, lastName, height, weight);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public float getHeight() {
        return super.getHeight();
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }

    protected Person BabyBorn(Person person) {
        Person baby;
        if (Math.random() > 0.5) {
            baby = new Women(getSex, getFirstName(), getLastName(), getHeight(), getWeight());
        } else {
            baby = new Man(getSex,getFirstName(), getLastName(), getHeight(), getWeight());
        }
        System.out.println("Please enter First name baby");
        Scanner scanner = new Scanner(System.in);
        baby.setFirstName(scanner.nextLine());
        System.out.println("Please enter First name baby");
        baby.setLastName(person.getLastName());
        if (baby.getSex()) {
            float babyHeigh1 = person.getHeight() + (0.1f * this.getHeight());
            baby.setHeight(babyHeigh1);
        } else {
            float babyHeigh2 = this.getHeight() + (0.1f * person.getHeight());
            baby.setHeight(babyHeigh2);

        }
        if (baby.getSex()) {
            float babyWeight1 = person.getWeight() + (0.1f * this.getWeight());
            baby.setHeight(babyWeight1);
        } else {
            float babyWeight2 = this.getWeight() + (0.1f * person.getWeight());
            baby.setHeight(babyWeight2);

        }
        return baby;
    }

}
