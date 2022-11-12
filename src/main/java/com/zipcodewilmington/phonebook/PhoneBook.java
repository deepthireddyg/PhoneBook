package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phoneBook;




    public PhoneBook(Map<String, List<String>> map) {
        this.phoneBook = map;
    }

    public PhoneBook() {
        this(new LinkedHashMap<>());
    }

    public void add(String name, String phoneNumber) {
        ArrayList<String> a = new ArrayList<>();
        a.add(phoneNumber);
        this.phoneBook.put(name,a);
    }

    public void addAll(String name, String[] phoneNumbers) {
        ArrayList<String> a = new ArrayList<>();
        a.addAll(Arrays.asList(phoneNumbers));
        this.phoneBook.put(name,a);
    }

    public void remove(String name) {

    this.phoneBook.remove(name);
    }

    public Boolean hasEntry(String name) {

        return this.phoneBook.containsKey(name);
    }
        public Boolean hasEntry(String name, String number) {

            return this.phoneBook.containsKey(name) &&
                    this.phoneBook.get(name).contains(number);
        }


    public List<String> lookup(String name) {
        return this.phoneBook.get(name);
    }

    public String reverseLookup(String phoneNumber) {

        for (String name : this.phoneBook.keySet()) {
            if (phoneBook.get(name).contains(phoneNumber)) {
                return name;
            }
        }


        return  null;
    }



    public List<String> getAllContactNames() {
        return new ArrayList<>(this.phoneBook.keySet());
    }



    public Map<String, List<String>> getMap() {
        return this.phoneBook;
    }
}
