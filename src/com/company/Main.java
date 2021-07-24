package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //work for MM,WW,MW
        System.out.println("Data for first person");
        Person person1 = CreateNewPerson();
        System.out.println("Data for second person");
        Person person2 = CreateNewPerson();

        System.out.println("Person 1 speak with Person 2 = " + person1.Speak(person2));
        System.out.println("Person 1 tolerate Person 2 = " + person1.Tolerate(person2));
        System.out.println("Person 1 spend time with Person 2 = " + person1.SpendTime(person2));

        Person haveRelation = person1.Relations(person2);
        if (haveRelation == null) {
            System.out.println("We are not right for each other");
        } else {
            System.out.println("New person: " + haveRelation);
        }

    }

    private static Person CreateNewPerson() {

        System.out.println("Please enter the Gender if Man=true, if Women=false");
        Scanner scanner = new Scanner(System.in);
        Boolean setSex = Boolean.parseBoolean(scanner.nextLine());
        String a = null, b = null;
        Person person;
        float a1=0f,c = 0f, d = 0f;
        if (setSex == false) {
            person = new Women( setSex,a, b, c, d);
        } else {
            person = new Man(setSex,a, b, c, d);
        }
        System.out.println("Please enter FirstName->Click Enter");
        Scanner scanner1 = new Scanner(System.in);
        person.setFirstName(scanner.nextLine());
        System.out.println("Please Enter LastName->Click Enter");
        person.setLastName(scanner.nextLine());
        System.out.println("Please enter height->Click Enter");
        person.setHeight(Integer.parseInt(scanner.nextLine()));
        System.out.println("Please enter weight->Click Enter");
        person.setWeight(Integer.parseInt(scanner.nextLine()));
        System.out.println("The Person: " + person);
        System.out.println();
        return person;
    }

}
