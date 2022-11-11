package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phoneBook;

    String name;
    String phoneNumber;
    Map<String, String> phoneBookMap;

    public PhoneBook(Map<String, List<String>> map) {
        this.phoneBook = map;
    }

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        phoneBook.put(name, Collections.singletonList(phoneNumber));
    }

    public void addAll(String name, String[] phoneNumbers) {
        phoneBook.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        phoneBook.remove(name);
    }

    public Boolean hasEntry(String name) {

        return phoneBook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return (phoneBook.get(name));
    }

    public String reverseLookup(String phoneNumber) {

        for(Map.Entry<String,List<String>> entry:phoneBook.entrySet()) {
            if ((entry.getValue().toString().replaceAll("[\\[\\],]", "")).equals(phoneNumber)) {
                return entry.getKey();
            }
        }

        return null;
    }

    public List<String> getAllContactNames() {
        Set<String> setNames = phoneBook.keySet();
        List<String> names=new ArrayList<>(setNames);
        Collections.sort(names,Collections.reverseOrder());
        return names;
    }
   


    public Map<String, List<String>> getMap() {
        return this.phoneBook;
    }
}
