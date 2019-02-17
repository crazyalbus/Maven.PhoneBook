package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {

    String testName1 = "Zebra";
    String testPhone1 = "111-222-333";
    String testName2 = "Dog";
    String testPhone2 = "222-444-4444";


    @Test // adds an entry to the composite associate data type
    public void addEntryTest() {
        //Given
        PhoneBook newPhoneBook = new PhoneBook();
        TreeMap<String, String> testPhoneBook = new TreeMap<String, String>();

        //When

        newPhoneBook.addEntry(testPhoneBook, testName1, testPhone1);
//        System.out.println(testPhoneBook);

        //Then
        Assert.assertTrue(testPhoneBook.containsKey(testName1));
    }

    @Test // removes an entry to the composite associate data type
    public void removeEntryTest() {
        //Given
        PhoneBook newPhoneBook = new PhoneBook();
        TreeMap<String, String> testPhoneBook = new TreeMap<String, String>();
        newPhoneBook.addEntry(testPhoneBook,testName1, testPhone1);

        //When
        newPhoneBook.removeEntry(testPhoneBook, testName1);

        //Then
        Assert.assertFalse(testPhoneBook.containsKey(testName1));
    }

    @Test // returns a phone number for the respective input name
    public void lookupTest() {
        //Given
        PhoneBook newPhoneBook = new PhoneBook();
        TreeMap<String, String> testPhoneBook = new TreeMap<String, String>();
        newPhoneBook.addEntry(testPhoneBook,testName1, testPhone1);

        //When
        newPhoneBook.lookupEntry(testPhoneBook, testName1);

        //Then
        Assert.assertEquals(testPhone1, testPhoneBook.get(testName1));
    }


    @Test // returns a name for the respective input phoneNumber
    public void reverseLookupTest() {
        //Given
        PhoneBook newPhoneBook = new PhoneBook();
        TreeMap<String, String> testPhoneBook = new TreeMap<String, String>();
        newPhoneBook.addEntry(testPhoneBook,testName1, testPhone1);

        //When
        String actualEntry = newPhoneBook.reverseLookupEntry(testPhoneBook, testPhone1);

        //Then
        Assert.assertEquals(testName1, actualEntry);
    }


    @Test
    public void displayTest() {
        //Given
        PhoneBook newPhoneBook = new PhoneBook();
        TreeMap<String, String> testPhoneBook = new TreeMap<String, String>();

        //When
        testPhoneBook.put(testName1, testPhone1);
        testPhoneBook.put(testName2, testPhone2);
        String expectedDisplay = "Dog 222-444-4444\nZebra 111-222-333\n";
        String actualDisplay = newPhoneBook.displayPhoneBook(testPhoneBook);

        //Then
        Assert.assertEquals(expectedDisplay, actualDisplay);
    }
}
