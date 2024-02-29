package ru.pavlova.java.basic.homeworks.homework9;

import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        Set<String> phoneNumbers = phoneBook.getOrDefault(name, new HashSet<>());
        phoneNumbers.add(phoneNumber);
        phoneBook.put(name, phoneNumbers);
    }

    public Set<String> find(String name) {
        return phoneBook.getOrDefault(name, Collections.emptySet());
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (Set<String> numbers : phoneBook.values()) {
            if (numbers.contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}
