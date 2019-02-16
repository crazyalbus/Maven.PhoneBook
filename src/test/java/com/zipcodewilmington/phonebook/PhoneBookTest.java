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
        PhoneBook testPhoneBook = new PhoneBook();
        String testName1 = "Zebra";
        String testPhone1 = "111-222-333";

        //When

        testPhoneBook.addEntry(testName1, testPhone1);

        //Then
        Assert.assertTrue(testPhoneBook.containsKey(testName1));
    }

    @Test // removes an entry to the composite associate data type
    public void removeEntryTest() {
        //Given
        PhoneBook testPhoneBook = new PhoneBook();
        String testName1 = "Zebra";
        String testPhone1 = "111-222-333";
        testPhoneBook.addEntry(testName1, testPhone1);

        //When
        testPhoneBook.removeEntry(testName1);

        //Then
        Assert.assertFalse(testPhoneBook.containsKey(testName1));
    }

    @Test // returns a phone number for the respective input name
    public void lookupTest() {
        //Given
        PhoneBook testPhoneBook = new PhoneBook();
        String testName1 = "Zebra";
        String testPhone1 = "111-222-333";

        //When
        testPhoneBook.lookupEntry(testName1);

        //Then
        Assert.assertEquals(testPhone1, testPhoneBook.get(testName1));
    }


    @Test // returns a name for the respective input phoneNumber
    public void reverseLookupTest() {
        //Given
        PhoneBook testPhoneBook = new PhoneBook();
        String testName1 = "Zebra";
        String testPhone1 = "111-222-333";

        //When
        testPhoneBook.reverseLookupEntry(testPhone1);

        //Then
        Assert.assertEquals(testName1, testPhoneBook.get(testPhone1));
    }


    @Test
    public void displayTest() {
        //Given
        PhoneBook testPhoneBook = new PhoneBook();
        String testName1 = "Zebra";
        String testPhone1 = "111-222-333";

        //When
        testPhoneBook.put(testName1, testPhone1);
        String expectedDisplay = "Dog 222-444-4444\nZebra 111-222-333";
        String actualDisplay = testPhoneBook.displayPhoneBook();

        //Then
        Assert.assertEquals(expectedDisplay, actualDisplay);
    }
}
