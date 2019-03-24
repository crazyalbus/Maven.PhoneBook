package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {

    String testName1 = "Zebra";
    String[] testPhone1 = {"111-222-333"};
    String testName2 = "Dog";
    String[] testPhone2 = {"222-444-4444", "555-666-777"};


    @Test
    public void constructorTest() {
        //When
        PhoneBook newPhoneBook = new PhoneBook();

        //Then
        Assert.assertTrue(newPhoneBook instanceof PhoneBook);
    }

    @Test
    public void getPhoneBookTest() {
        //Given
        PhoneBook newPhoneBook = new PhoneBook();

        //When
        Map<String, String[]> testPhoneBook = newPhoneBook.getPhoneBook();

        //Assert
        Assert.assertEquals(0, testPhoneBook.size());

    }

    @Test // adds an entry to the composite associate data type
    public void addEntryTest() {
        //Given
        PhoneBook newPhoneBook = new PhoneBook();
        TreeMap<String, String[]> testPhoneBook = newPhoneBook.getPhoneBook();

        //When
        newPhoneBook.addEntry(testName1, testPhone1);

        //Then
        Assert.assertTrue(testPhoneBook.containsKey(testName1));
    }

    @Test // removes an entry to the composite associate data type
    public void removeEntryTest() {
        //Given
        PhoneBook newPhoneBook = new PhoneBook();
        TreeMap<String, String[]> testPhoneBook = newPhoneBook.getPhoneBook();
        newPhoneBook.addEntry(testName1, testPhone1);

        //When
        newPhoneBook.removeEntry(testName1);

        //Then
        Assert.assertFalse(testPhoneBook.containsKey(testName1));
    }

    @Test // returns a phone number for the respective input name
    public void lookupTest() {
        //Given
        PhoneBook newPhoneBook = new PhoneBook();
        TreeMap<String, String[]> testPhoneBook = newPhoneBook.getPhoneBook();
        newPhoneBook.addEntry(testName1, testPhone1);

        //When
        String[] expected = newPhoneBook.lookupEntry(testName1);

        //Then
        Assert.assertEquals(expected, testPhoneBook.get(testName1));
    }


    @Test // returns a name for the respective input phoneNumber
    public void reverseLookupTest() {
        //Given
        PhoneBook newPhoneBook = new PhoneBook();
        newPhoneBook.addEntry(testName1, testPhone1);

        //When
        String actualEntry = newPhoneBook.reverseLookupEntry(testPhone1[0]);

        //Then
        Assert.assertEquals(testName1, actualEntry);
    }


    @Test
    public void displayTest() {
        //Given
        PhoneBook newPhoneBook = new PhoneBook();
        TreeMap<String, String[]> testPhoneBook = newPhoneBook.getPhoneBook();

        //When
        testPhoneBook.put(testName1, testPhone1);
        testPhoneBook.put(testName2, testPhone2);
        String expectedDisplay = "Dog numbers:\n" +
                "   222-444-4444\n" +
                "   555-666-777\n" +
                "Zebra numbers:\n" +
                "   111-222-333\n";
        String actualDisplay = newPhoneBook.displayPhoneBook();

        //Then
        Assert.assertEquals(expectedDisplay, actualDisplay);
    }
}
