package com.zipcodewilmington.phonebook;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook<Listings> {

    private TreeMap<String, String> phoneBook = new TreeMap<String, String>();


    //methods

    public void addEntry(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
    }

    public void removeEntry(String name) {
        phoneBook.remove(name);
    }

    public String lookupEntry(String name){
        return phoneBook.get(name);
    }

    public String reverseLookupEntry(String phoneNumber) {
        String lookupName = "";
        for (Map.Entry<String,String> entry : phoneBook.entrySet() ) {
            String lookupNumber = phoneNumber;
            String currentName = entry.getKey();
            String currentNumber = entry.getValue();
            if (lookupNumber == currentNumber) {
                lookupName = currentName;
            }
        }
        return lookupName;
    }

    public String displayPhoneBook() {
        String printPhoneBook = "";
        for (Map.Entry<String,String> entry : phoneBook.entrySet() ) {
            String currentName = entry.getKey();
            String currentNumber = entry.getValue();
            printPhoneBook = printPhoneBook + currentName + currentNumber + "\n";
        }
        return printPhoneBook;
    }

}
