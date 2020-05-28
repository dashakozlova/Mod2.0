package com.mod2;
import com.mod2.Adress;

import java.util.Date;

public class Person implements Comparable<Person> {
    private String name;

    private String surname;

    private Date birthdate;

    private Adress adress;

    public Person() {
    }

    ;

    public Person(String name, String surname, Date birthDate, Adress adress) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthDate;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthDate) {
        this.birthdate = birthdate;
    }

    @Override
    public int compareTo(Person o) {
        return this.getBirthdate().compareTo(o.getBirthdate());
    }
}
