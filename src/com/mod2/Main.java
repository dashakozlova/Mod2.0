package com.mod2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Adress> adress = new ArrayList<>();
        adress.add(new Adress("Symska"));
        adress.add(new Adress("Sadova"));

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("Dasha", "Kozlova", new Date(2000, 1, 26), adress.get(0)));
        persons.add(new Person("Max", "Basow",new Date(2000,2,6),adress.get(1)));
        persons.add(new Person("Aliona", "Tenytska", new Date(2000, 6, 9), adress.get(0)));

        Operations oper= new Operations();
        oper.getOldest(persons);
        oper.getPersonBySurname(persons);
    }

}
