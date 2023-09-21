package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static Map<String,String> phoneBook = new HashMap<>();

    public int add(String name,String number){
        if(!phoneBook.containsKey(name)){
            phoneBook.put(name,number);
        } else {
            phoneBook.replace(name,phoneBook.get(name),number);
        }
        return phoneBook.size();
    }
}
