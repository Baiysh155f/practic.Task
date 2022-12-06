package services.impl;

import classes.Person;
import services.PersonInterface;

public class PersonImpl implements PersonInterface {
    private Person[] people;

    public PersonImpl(Person[] people) {
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String createPerson(Person... person) {
        Person[] newArray;

        if (people == null){
            this.people = person;
        }else {
            newArray = new Person[this.people.length + person.length];
            int index = 0;
            for (int i = 0; i < people.length; i++) {
                newArray[i] = people[index++];
            }
            for (int i = 0; i < person.length; i++) {
                newArray[index++] = person[i];
            }
            this.people = newArray;
        }

        return "Person successfully saved";
    }

    @Override
    public Person[] getAllPeople() {
        return getPeople();
    }
}
