package ru.pavlova.java.basic.homeworks.homework10;

import java.util.ArrayList;
import java.util.List;

public class PersonDataBase {
    private List<Person> personList;

    public PersonDataBase() {
        personList = new ArrayList<>();
    }

    public Person findById(Long id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void add(Person person) {
        personList.add(person);
    }

    public boolean isManager(Person person) {
        return person.getPosition() == Position.MANAGER || person.getPosition() == Position.DIRECTOR ||
                person.getPosition() == Position.BRANCH_DIRECTOR || person.getPosition() == Position.SENIOR_MANAGER;
    }

    public boolean isEmployee(Long id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person.getPosition() != Position.MANAGER && person.getPosition() != Position.DIRECTOR &&
                        person.getPosition() != Position.BRANCH_DIRECTOR && person.getPosition() != Position.SENIOR_MANAGER;
            }
        }
        return false;
    }
}