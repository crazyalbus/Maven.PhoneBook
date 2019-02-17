package com.zipcodewilmington.phonebook;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

//    private TreeMap<String, String> phoneBook;

    public PhoneBook() {
//        phoneBook = new TreeMap<String, String>();
    }

    //methods

    public void addEntry(TreeMap<String, String> phoneBook, String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
    }

    public void removeEntry(TreeMap<String, String> phoneBook, String name) {
        phoneBook.remove(name);
    }

    public String lookupEntry(TreeMap<String, String> phoneBook, String name){
        return phoneBook.get(name);
    }

    public String reverseLookupEntry(TreeMap<String, String> phoneBook, String phoneNumber) {
        String lookupName = "";
        for (String entry : phoneBook.keySet()) {
            if (phoneBook.get(entry).equals(phoneNumber)) {
                lookupName = entry;
            }
//            String lookupNumber = phoneNumber;
//            String currentName = entry.getKey();
//            String currentNumber = entry.getValue();
//            if (lookupNumber == currentNumber) {
//                lookupName = currentName;
            }
        return lookupName;
        }


    public String displayPhoneBook(TreeMap<String, String> phoneBook) {
        String printPhoneBook = "";
        for (Map.Entry<String,String> entry : phoneBook.entrySet() ) {
            String currentName = entry.getKey();
            String currentNumber = entry.getValue();
            printPhoneBook = printPhoneBook + currentName + " " +currentNumber + "\n";
        }
        return printPhoneBook;
    }

}
