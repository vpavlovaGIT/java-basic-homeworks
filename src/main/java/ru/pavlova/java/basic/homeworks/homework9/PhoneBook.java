package ru.pavlova.java.basic.homeworks.homework9;

import java.util.*;

public class PhoneBook {
    private Map<String, Person> contactsPhone;

    public PhoneBook() {
        this.contactsPhone = new HashMap<>();
    }

    public void add(String phoneNumber, Person person) {
        contactsPhone.put(phoneNumber, person);
    }

    public Person find(String phoneNumber) {
        return contactsPhone.get(phoneNumber);
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        return contactsPhone.containsKey(phoneNumber);
    }
}
