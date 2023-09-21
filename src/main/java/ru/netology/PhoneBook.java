package ru.netology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PhoneBook {
    private static Map<String, String> phoneBook = new HashMap<>();

    public int add(String name, String number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, number);
        } else {
            phoneBook.replace(name, phoneBook.get(name), number);
        }
        return phoneBook.size();
    }

    public String findByNumber(String number) {
        if (phoneBook.containsValue(number)) {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                if (entry.getValue().equals(number)) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    public String findByName(String name) {
        if(phoneBook.containsKey(name)){
            return phoneBook.get(name);
        }
        return null;
    }

    public List<String> printAllNames(){
        List<String> list = new ArrayList<>();
        return list;
    }
}

