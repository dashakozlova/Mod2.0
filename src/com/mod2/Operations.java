package com.mod2;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Operations {
    FileWriter wr;

    public void getPersonByAddress(ArrayList<Person> personList) throws IOException {
        Scanner scanner = new Scanner(System.in);
        wr = new FileWriter("output.txt");
        System.out.println("Write adress:");
        String adress = scanner.nextLine();

        boolean
                counter = false;
        for (Person person : personList) {
            if (person.getAdress().getName().equals(adress.trim())) {
                counter = true;
                System.out.println(person.getName() + "lives at the " + adress + " adress .");
                wr.write(person.getName() + "lives at the " + adress + " adress.");
            }
        }
        if (!counter) {
            System.out.println("There is no such people living at these adress.");
            wr.write("There is no such people living at these adress.");
        }
    }
    public void getYoungest(ArrayList<Person> personList) throws IOException {
        wr = new FileWriter("output3.txt");
        Person person = Collections.max(personList);
        System.out.println(person.getName() + " " + person.getSurname() + " is the youngest.");
        wr.write(person.getName() + " " + person.getSurname() + " is the youngest.");
    }
    public void getPersonBySurname(ArrayList<Person> personList) throws IOException {
        Scanner scanner = new Scanner(System.in);
        wr = new FileWriter("output2.txt");
        System.out.println(" enter surname : ");
        String surname = scanner.nextLine();

        boolean counter = false;
        for (Person person : personList) {
            if (person.getSurname().equals(surname.trim())) {
                counter = true;
                System.out.println(person.getName() + " " + person.getSurname());
                wr.write(person.getName() + " " + person.getSurname());
            }
        }
        if (!counter) {
            System.out.println("There is no such people living at these adress.");
            wr.write("There is no such people living at these adress.");
        }
    }



    public void getOldest(ArrayList<Person> personList) throws IOException {
        wr = new FileWriter("output4.txt");
        Person person = Collections.min(personList);
        System.out.println(person.getName() + " " + person.getSurname() + " is the oldest.");
        wr.write(person.getName() + " " + person.getSurname() + " is the oldest.");
    }
}
